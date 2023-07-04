package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {

	
		public static WebDriver oBrowser=null;
		public static ActiPage oPage=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimizeFlyOutWindow();
			logout();
			closeApplication();
			

	}
		public static void launchBrowser()
		{
			try {
				oBrowser=new ChromeDriver();
				oPage=new ActiPage(oBrowser);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void navigate()
		{
			try {
				oBrowser.get("http://localhost:81/login.do");
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void login()
		{
			try {
				oPage.getUserName().sendKeys("admin");
				oPage.getpassword().sendKeys("manager");
				oPage.getLogoutButton().click();
				Thread.sleep(5000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void minimizeFlyOutWindow()
		{
			try {
		    oPage.getFlyOutWindow().click();
		    Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		private static void logout()
		{
			try {
				oPage.getLogoutButton().click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void closeApplication()
		{
			try {
				oBrowser.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
}
