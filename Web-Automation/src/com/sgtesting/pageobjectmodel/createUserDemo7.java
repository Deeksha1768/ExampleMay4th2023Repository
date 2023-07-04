package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createUserDemo7 {
	public static WebDriver b=null;
	public static ActiPage7 opage=null;
	public static void main(String[] args) {
			launch();
			navigate();
			Login();
			Minimize();
			CreateCustomer();
			CreateProject();
			CreateTask();
			deleteTask();
			deleteproject();
			deletecustomer();
			Logout();
			Close();

		}
		private static void launch()
		{
			try {
				b=new ChromeDriver();
				opage=new ActiPage7(b);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		private static void navigate()
		{
			try {
				b.get("http://localhost:81/login.do");
				Thread.sleep(3000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void Login()
		{
			try {
				opage.getusername().sendKeys("admin");
				Thread.sleep(2000);
				opage.getpassword().sendKeys("manager");
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
				opage.getName().sendKeys("kaira");
				Thread.sleep(2000);
				opage.getDescription().sendKeys("abcd");
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
				opage.getname().sendKeys("Project1");
				Thread.sleep(2000);
				opage.getdesc().sendKeys("abcd");
				Thread.sleep(2000);
				opage.getproject().click();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void CreateTask()
	    {
	    	try {
	    		opage.gettask().click();
	    		Thread.sleep(2000);
	    		opage.Addnew().click();
	    		Thread.sleep(2000);
	    		opage.entername().sendKeys("Task1");
	    		Thread.sleep(2000);
	    		opage.getentername2().sendKeys("fcgvk");
	    		Thread.sleep(2000);
	    		opage.getCreateTask().click();
	    		Thread.sleep(2000);
	    		
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
		private static void deleteTask()
	    {
	    	try {
	    		 opage.getcontainer().click();
	    		 Thread.sleep(2000);
	    		 opage.getact().click();
	    		 Thread.sleep(2000);
	    		 opage.getde().click();
	    		 Thread.sleep(2000);
	    		 opage.getde1().click();
	    		 Thread.sleep(2000);
	    		 opage.getcon().click();
	    		 Thread.sleep(2000);
	    		 opage.getact2().click();
	    		 Thread.sleep(2000);
	    		 opage.getde2().click();
	    		 Thread.sleep(2000);
	    		 opage.getdelet().click();
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
				b.close();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	
