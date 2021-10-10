package com.qa.medicare.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.medicare.pages.HomePage;
import utils.EventReporter;

public class TestBase {
	//public static WebDriver driver;	
	protected EventFiringWebDriver driver;

	protected HomePage homePage;
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new EventFiringWebDriver (new ChromeDriver(getChromeOptions()));
		driver.register(new EventReporter());
		driver.get("https://www.medicare-india.com/");
	}

	@AfterClass
	public void stopDriver() 
	{
		driver.quit();
	}

	private ChromeOptions getChromeOptions(){
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.setHeadless(true);// the page not open
		return options;
	}


}
