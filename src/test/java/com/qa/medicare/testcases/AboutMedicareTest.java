package com.qa.medicare.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.medicare.pages.AboutMedicarePage;
import com.qa.medicare.pages.HomePage;

public class AboutMedicareTest extends TestBase{
	
	HomePage homepage;
	AboutMedicarePage aboutmedicarepage;
	
	
		
	@Test 
	public void CheckAboutMedicarePage() throws InterruptedException
	{
		homepage = new HomePage(driver);
		homepage.OpenAboutMedicarePage();
		aboutmedicarepage = new AboutMedicarePage(driver);
		Assert.assertTrue(aboutmedicarepage.Validateaboutmedicarepage.getText().contains("Medicare is open to Customisation, particularly for Spacers and Peak Flow Meters."));
		System.out.println(driver.getCurrentUrl());
		aboutmedicarepage.OpenHomePage();
		
		
	}
	

}
