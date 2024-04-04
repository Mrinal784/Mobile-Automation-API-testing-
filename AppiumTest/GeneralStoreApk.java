package com.appium.AppiumTest;


import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class GeneralStoreApk {
	
	public AndroidDriver driver;
	 
	public AppiumDriverLocalService service;

	@Test
	public void Test() throws MalformedURLException, InterruptedException {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Mrinal");
		options.setApp("D:\\Documents\\Desktop\\Automation tool\\APK FILES\\General-Store.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		Thread.sleep(4000);
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("Mrinal");
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='India']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
		int productCount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
				for(int i=0;i<productCount;i++ )
				{
					String productName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
					Thread.sleep(2000);
					if(productName.equalsIgnoreCase("Jordan 6 Rings"))
					{
						driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
						}
				}
				driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
		
				Thread.sleep(4000);
		driver.quit();
	

	}
 
}
