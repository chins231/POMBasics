package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBaseClass;

public class LoginPage extends TestBaseClass{

	//Pagefactory /Object repo
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement loginBtn;
	
	@FindBy(xpath="//span[contains(text(),'sign up')]")
	WebElement signUp;
	
	@FindBy(xpath="//a[@title='free crm home']")
	WebElement logoTitle;
	//init
	public LoginPage ()
	{
		PageFactory.initElements(driver,this );//all variables will be initialized with driver LoginPage.class or this
	}
	
	//Actions
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validateCRMPage() {
		return logoTitle.isDisplayed();
	}
	
	public HomePage login (String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
}
