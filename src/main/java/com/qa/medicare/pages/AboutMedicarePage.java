package com.qa.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutMedicarePage extends PageBase {

	public AboutMedicarePage(WebDriver driver) {
		super(driver);

	}

	@FindBy (className = "hd1")
	public WebElement Validateaboutmedicarepage;

	@FindBy (linkText  = "Home")
	public WebElement HomePagebut;

	public void OpenHomePage() throws InterruptedException 
	{
		clickButton(HomePagebut);
		Thread.sleep(300);
	}

}
