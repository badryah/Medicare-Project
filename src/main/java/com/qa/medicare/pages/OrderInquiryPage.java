package com.qa.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OrderInquiryPage extends PageBase{

	public OrderInquiryPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(id="Name")
	WebElement name;

	@FindBy(id="Company_Name")
	WebElement cname;

	@FindBy(id="Address")
	WebElement addr;

	@FindBy(id="Phone_No")
	WebElement pno;

	@FindBy(id="Mobile_No")
	WebElement mno;

	@FindBy(id="email")
	WebElement em;

	@FindBy(id="Search_Engine")
	WebElement SearchEngine;


	@FindBy(id="Comments")
	WebElement Comments;

	@FindBy(name="Submit")
	WebElement btn;

	@FindBy(css ="span.style2")
	public WebElement confirmesubmitorder;


	public void orderCreate(String n, String cn, String ad, String pn, String mn, String email, String Search, String comm)
	{

		setTextElementText(name, n);

		setTextElementText(cname, cn);

		setTextElementText(addr, ad);

		setTextElementText(pno, pn);

		setTextElementText(mno, mn);

		setTextElementText(em, email);

		setTextElementText(SearchEngine, Search);

		setTextElementText(Comments, comm);

	}

	public void buttonClcik()
	{
		clickButton(btn);
	}

}
