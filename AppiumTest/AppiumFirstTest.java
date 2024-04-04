package com.appium.AppiumTest;


import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;


import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumFirstTest {
	
	public AndroidDriver driver;
	 
	public AppiumDriverLocalService service;

	@Test
	public void Test() throws MalformedURLException, InterruptedException {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Mrinal");
		options.setApp("D:\\Documents\\Desktop\\Automation tool\\APK FILES\\ApiDemos-debug.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Access'ibility\"]\n")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]\n")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]\n")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Events\"]\n")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]\n")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Launcher Shortcuts\"]\n")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Graphics\"]\n")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"ColorFilters\"]\n")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.quit();
	

	}
 
}
