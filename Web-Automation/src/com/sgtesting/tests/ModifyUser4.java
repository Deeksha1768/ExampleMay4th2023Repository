//launch browser-->navigate-->login-->create user-->modify-->delete user-->logout-->close application
package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ModifyUser4 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modify();
		deleteUser();
		logout();
		closeApplication();


	}

	

	



	private static void launchBrowser()
	{
		try {
			oBrowser=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
			oBrowser.findElement(By.name("lastName")).sendKeys("User2");
			oBrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demouser2");
			oBrowser.findElement(By.name("password")).sendKeys("helloworld");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("helloworld");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modify()
	{
		try {
			  oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.name("password")).clear();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.name("password")).sendKeys("qwerty");
			  Thread.sleep(2000);
			  oBrowser.findElement(By.name("passwordCopy")).clear();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.name("passwordCopy")).sendKeys("qwerty");
			  Thread.sleep(2000);
			  oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			  Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteUser() {

		
			try {
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				Thread.sleep(2000);
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void logout() {
			
			try {
				oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
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



