package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSLoginPage {
	public DWSLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	private @FindBy(id="Email")
	WebElement username;
	private @FindBy(name="Password")
	WebElement password;
	private @FindBy(xpath="//input[@value='Log in']")
	WebElement login;
	
public void username(String value) {
	username.sendKeys(value);
}
public void password(String value)

{
	password.sendKeys(value);}

public void login()
{
	login.click();
	}
}

