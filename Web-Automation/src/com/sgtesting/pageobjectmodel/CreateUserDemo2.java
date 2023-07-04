package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserDemo2 {
	public static WebDriver b=null;
	public static ActiPage2 opage=null;
	public static void main(String[] args) {
		launch();
		Navigate();
		login();
		minimize();
		createuser();
		Modifyuser();
		deleteuser();
		Logout();
		Close();


	}
	private static void launch()
	{
		try {
			b=new ChromeDriver();
			opage=new ActiPage2(b);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Navigate()
	{
		try {
			b.get("http://localhost:81/login.do");
			Thread.sleep(3000);

		} catch (Exception e) {

		}
	}
	private static void login()
	{
		try {
			opage.getuserName().sendKeys("admin");
			Thread.sleep(2000);
			opage.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			opage.getLoginButton().click();
			Thread.sleep(2000);

		} catch (Exception e) {

		}
	}
	private static void minimize()
	{
		try {
			opage.getFlyOutwindow().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try {
			opage.getuser().click();
			Thread.sleep(2000);
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.firstname().sendKeys("demo1");
			Thread.sleep(2000);
			opage.lastname().sendKeys("user1");
			Thread.sleep(2000);
			opage.email().sendKeys("pari456@gmail.com");
			Thread.sleep(2000);
			opage.username().sendKeys("laya");
			Thread.sleep(2000);
			opage.getpassword().sendKeys("1234");
			Thread.sleep(2000);
			opage.passwordCopy().sendKeys("1234");
			Thread.sleep(2000);
			opage.getSavecopy().click();
			Thread.sleep(4000);;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Modifyuser()
	{
		try {
			opage.getModify().click();
			Thread.sleep(2000);
			opage.getclearlastName().clear();
			Thread.sleep(2000);
			opage.getModifylastName().sendKeys("anu");
			Thread.sleep(2000);
			opage.getanotherlastname().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try {
			opage.getclickonuser().click();
			Thread.sleep(2000);
			opage.getdelete().click();
			Thread.sleep(2000);
			b.switchTo().alert().accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			opage.getLogoutButton().click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Close()
	{
		try {
			b.close();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}



}
