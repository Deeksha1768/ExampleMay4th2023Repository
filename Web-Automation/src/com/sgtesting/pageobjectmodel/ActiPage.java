package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage {
    public ActiPage(WebDriver oBrowser)
    {
    	PageFactory.initElements(oBrowser,this);
    }
    private WebElement UserName;
    public WebElement getUserName()
    {
    	return UserName;
  
    }
    private WebElement pwd;
    public WebElement getpassword()
    {
    	return pwd;
    }
    @FindBy(xpath="//*[@id=\"loginButton\"]/div")
    private WebElement oLogin;
    public WebElement getLoginButton()
    {
    	return oLogin;
    }
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutButton()
	{
		return oLogout;
	}
	private WebElement close;
	public WebElement Close()
	{
		return close;
	}
		

	}


