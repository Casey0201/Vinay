package com.tcs.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver;
	 System.out.println("ab");
	 System.setProperty("webdriver.gecko.driver","/Users/tcsinteractive/Documents/workspace-spring-tool-suite-4-4.5.0.RELEASE/Automation/geckodriver");
	 driver=new FirefoxDriver();
	 driver.get("https://www.google.com");
	 Thread.sleep(5000);
	 
	 driver.quit();
	}
}
