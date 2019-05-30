package com.jbkoffline.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbkoffline.qa.base.TestBase;
import com.relevantcodes.extentreports.ExtentTest;

public class HomePage extends TestBase{

	@FindBy(xpath="//a[@href=\"dashboard.html\" and @class=\"logo\"]")
	WebElement homePageLogo;
	
	@FindBy(xpath="//a[@href=\"dashboard.html\"]")
	WebElement DashboardLink;
		
	@FindBy(xpath="//a[@href=\"users.html\"]")
	WebElement UsersLink;
	
	@FindBy(xpath="//button[@class=\"btn btn-block btn-primary btn-sm pull-right\"]")
	WebElement AddUserLink;
	
	@FindBy(xpath="//a[@href=\"operators.html\"]")
	WebElement OperatorsLink;
	
	@FindBy(xpath="//a[@href=\"logout.html\"]")
	WebElement LogoutLink;
	
	@FindBy(xpath="//a[@href=\"logout.html\" and @class]")
	WebElement logoutBtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		
		log.info("Verifying the Home Page Title :>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		return driver.getTitle();
	}
	
	public UsersPage clickOnUsersLink() {
		log.info("Click On the UsersLink :>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		UsersLink.click();
		return new UsersPage();
	}
	
	public OperatorsPage clickOnOperatorsLink() {
		log.info("Click On the OperatorsLink :>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		OperatorsLink.click();
		return new OperatorsPage();		
	}
	
	public void clickOnAddUserLink() {
		Actions action = new Actions(driver);
		action.moveToElement(UsersLink).build().perform();
		AddUserLink.click();
	}
	
}
