package com.appium.AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class CalculatorDemo {
	static AppiumDriver driver=null;
	
	public static void main(String[] args)throws MalformedURLException, InterruptedException
	{	
		openCalculator();
	}
	
public static void openCalculator() throws InterruptedException, MalformedURLException
{
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "samsung SM-S908B");
	cap.setCapability("udid","R5CT92VPQYL");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion","34");
	cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
	cap.setCapability("automationName","UiAutomator2");
	URL url = new URL("http://127.0.0.1:4723");
	
	driver =new AppiumDriver(url,cap);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Thread.sleep(5000);
	driver.quit();
	}

}
