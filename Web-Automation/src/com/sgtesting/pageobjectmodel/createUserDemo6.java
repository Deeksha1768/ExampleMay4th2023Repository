package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createUserDemo6 {
		public static WebDriver oBrowser=null;
		public static ActiPage6 opage=null;
		public static void main(String[] args) {
			launch();
			navigate();
			Login();
			Minimize();
			CreateCustomer();
			CreateProject();
			ModifyProject();
			deleteproject();
			deletecustomer();
			Logout();
			Close();

		}
		private static void launch()
		{
			try {
				oBrowser=new ChromeDriver();
				opage=new ActiPage6(oBrowser);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		private static void navigate()
		{
			try {
				oBrowser.get("http://localhost:81/login.do");
				Thread.sleep(3000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void Login()
		{
			try {
				opage.getuserName().sendKeys("admin");
				Thread.sleep(2000);
				opage.getPassword().sendKeys("manager");
				Thread.sleep(2000);
				opage.getLoginButton().click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void Minimize()
		{
			try {
				opage.getFlyOutwindow().click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private static void CreateCustomer()
		{
			try {
				opage.getTask().click();
				Thread.sleep(2000);
				opage.getAddNew().click();
				Thread.sleep(2000);
				opage.getNewcustomer().click();;
				Thread.sleep(2000);
				opage.getName().sendKeys("Kaira");
				Thread.sleep(2000);
				opage.getDescription().sendKeys("hello");
				Thread.sleep(2000);
				opage.getCreatecustomer().click();;
				Thread.sleep(2000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void CreateProject()
		{
			try {
				opage.getaddnew().click();
				Thread.sleep(2000);
				opage.getProject().click();
				Thread.sleep(2000);
				opage.getname().sendKeys("Project2");
				Thread.sleep(2000);
				opage.getdesc().sendKeys("hola");
				Thread.sleep(2000);
				opage.getproject().click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void ModifyProject()
		{
			try {
				opage.getModi().click();
				Thread.sleep(2000);
				opage.getdesc1().clear();
				Thread.sleep(2000);
				opage.getdesx().sendKeys("gjhlyi");
				Thread.sleep(2000);
				opage.getclosebut().click();
				Thread.sleep(2000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void deleteproject()
		{
			try {
				opage.geted().click();
				Thread.sleep(2000);
				opage.getac().click();
				Thread.sleep(2000);
				opage.getdel().click();
				Thread.sleep(2000);
				opage.getcodel().click();
				Thread.sleep(2000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void deletecustomer()
		{
			try {
				opage.getedi().click();
				Thread.sleep(2000);
				opage.getAction().click();
				Thread.sleep(2000);
				opage.getDelete().click();;
				Thread.sleep(2000);
				opage.getConfirm().click();;
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
				oBrowser.close();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	


