package com.qa.medicare.testcases;

import org.testng.annotations.Test;

import com.qa.medicare.pages.HomePage;
import com.qa.medicare.pages.OrderInquiryPage;

public class OrderInquiryPageTest extends TestBase{
	
	
	HomePage homepage;	
	OrderInquiryPage orderinquirypage;
	
	@Test
	public void Submitorderinquri() throws InterruptedException
	{
		homepage = new HomePage(driver);
		homepage.OpenOrderPage();
		orderinquirypage = new OrderInquiryPage(driver);
		orderinquirypage.orderCreate("sol", "mos1", "india", "123445", "09876", "as@jk.com", "sihuih", "khiei");
		orderinquirypage.buttonClcik();
		System.out.println(orderinquirypage.confirmesubmitorder.getText());
		System.out.println(driver.getCurrentUrl());
	}
	

}
