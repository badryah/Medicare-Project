package com.qa.medicare.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.medicare.pages.AboutMedicarePage;
import com.qa.medicare.pages.HomePage;
import com.qa.medicare.pages.ProductRangePage;

public class ProductRangePageTest extends TestBase{
	
	HomePage homepage;	
	ProductRangePage productrangepage;
	
		
	@Test (priority = '1')
	public void CheckProductePage() throws InterruptedException
	{
		homepage = new HomePage(driver);
		homepage.OpenProductPage();
		productrangepage = new ProductRangePage(driver);
		System.out.println(driver.getCurrentUrl());	
	}
	
	@Test (priority = '2')
	public void CheckRespiratorycarePage() throws InterruptedException
	{
		
		productrangepage.openRespiratorycarePage();
		Thread.sleep(2000);
		Assert.assertTrue(productrangepage.checkRespiratorycare.getText().contains("For Effective"));
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(2000);
	}
	
	@Test (priority = '3')
	public void CheckAspiratorsPage() throws InterruptedException
	{
		
		productrangepage.openAspiratorsPage();
		Thread.sleep(200);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(2000);
		
	}
	
	@Test (priority = '4')
	public void CheckDiaphragmPumpsPage() throws InterruptedException
	{
		
		productrangepage.openDiaphragmPumpsPage();
		Thread.sleep(200);
		System.out.println(driver.getCurrentUrl());
		
	}

}
