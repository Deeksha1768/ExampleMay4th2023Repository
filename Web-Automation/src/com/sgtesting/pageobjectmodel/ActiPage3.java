package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage3 {

	public ActiPage3(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	private WebElement username;
	public WebElement getUserName()
	{
		return username;

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
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr/td[3]/a")
	private WebElement Task;
	public WebElement getTask()
	{
		return Task;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")
	private WebElement AddNew;
	public WebElement getAddNew()
	{
		return AddNew;
	}
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement NewCustomer;
	public WebElement getNewCustomer()
	{
		return NewCustomer;
	}
	private WebElement customerLightBox_nameField;
	public WebElement getName()
	{
		return customerLightBox_nameField;
	}
	private WebElement customerLightBox_descriptionField;
	public WebElement getDescription()
	{
		return customerLightBox_descriptionField;
	}
	@FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]")
	private WebElement CreateCustomer;
	public WebElement getCreateCustomer()
	{
		return CreateCustomer;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement Edit;
	public WebElement getEdit()
	{
		return Edit;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")
	private WebElement ActionButton;
	public WebElement getAction()
	{
		return ActionButton;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	private WebElement Delete;
	public WebElement getDelete()
	{
		return Delete;
	}
	
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getConfirmation()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	@FindBy(xpath="//*[@id=\"logoutLink\"]")
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
