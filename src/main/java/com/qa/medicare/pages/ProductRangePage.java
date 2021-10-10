package com.qa.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductRangePage extends PageBase{

	public ProductRangePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//map[@name='Map2']/child::area[1]")
	WebElement Respiratorycare;

	@FindBy(xpath = "//map[@name='Map2']/child::area[2]")
	WebElement Aspirators;

	@FindBy(xpath = "//map[@name='Map2']/child::area[3]")
	WebElement DiaphragmPumps;

	@FindBy(className  = "hd")
	public WebElement checkRespiratorycare;

	public void openRespiratorycarePage()
	{
		clickButton(Respiratorycare);
	}

	public void openAspiratorsPage()
	{
		clickButton(Aspirators);
	}

	public void openDiaphragmPumpsPage()
	{
		clickButton(DiaphragmPumps);
	}

}
