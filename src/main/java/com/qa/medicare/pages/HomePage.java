package com.qa.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//map[@name='Map2']/child::area[1]")
	WebElement AboutMedicare;

	@FindBy(xpath = "//map[@name='Map2']/child::area[2]")
	WebElement Product;

	@FindBy(xpath = "//map[@name='Map2']/child::area[3]")
	WebElement Order;

	@FindBy(xpath = "//map[@name='Map2']/child::area[4]")
	WebElement Site;

	@FindBy(xpath = "//map[@name='Map2']/child::area[5]")
	WebElement Contact; 
	
	public void OpenAboutMedicarePage() {
		clickButton(AboutMedicare);
	}
	public void OpenProductPage() {
		clickButton(Product);
	}
	
	public void OpenOrderPage() {
		clickButton(Order);
	}
	public void OpenSitePage() {
		clickButton(Site);
	}
	public void OpenContactPage() {
		clickButton(Contact);
	}

}
