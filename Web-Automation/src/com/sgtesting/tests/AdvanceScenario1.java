package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		AdminLogin();
		minimizeFlyOutWindow();
		createUser();
		Adminlogout();
		loginUser1();
		logoutUser1();
		loginUser2();
		logoutUser2();
		loginUser3();
		logoutUser3();
		Adminlogin();
		modifyPwd();
		AdminLogout();
		LoginUser1();
		LogoutUser1();
		LoginUser2();
		LogoutUser2();
		LoginUser3();
		LogoutUser3();
        adminLogin();
		deleteUsers();
		adminLogout();
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
	private static void AdminLogin()
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
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			oBrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demouser1");
			oBrowser.findElement(By.name("password")).sendKeys("helloworld1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("helloworld1");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo2");
			oBrowser.findElement(By.name("lastName")).sendKeys("User2");
			oBrowser.findElement(By.name("email")).sendKeys("demo2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demouser2");
			oBrowser.findElement(By.name("password")).sendKeys("helloworld2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("helloworld2");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo3");
			oBrowser.findElement(By.name("lastName")).sendKeys("User3");
			oBrowser.findElement(By.name("email")).sendKeys("demo3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demouser3");
			oBrowser.findElement(By.name("password")).sendKeys("helloworld3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("helloworld3");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void Adminlogout() {

		try {
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void loginUser1()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("helloworld1");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logoutUser1() {

		try {
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void loginUser2()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("helloworld2");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);	
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logoutUser2()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginUser3()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("helloworld3");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logoutUser3()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Adminlogin()
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
    private static void modifyPwd()
    {
    	try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("qwerty1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("qwerty1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("qwerty2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("qwerty2");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("qwerty3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("qwerty3");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    private static void AdminLogout() {

		try {
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
    private static void LoginUser1()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("qwerty1");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void LogoutUser1() {

		try {
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void LoginUser2()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("qwerty2");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void LogoutUser2()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void LoginUser3()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("qwerty3");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void LogoutUser3()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void adminLogin()
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
	private static void deleteUsers()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
			Alert oAlert1=oBrowser.switchTo().alert();
			String content1=oAlert1.getText();
			Thread.sleep(2000);
			System.out.println(content1);
			oAlert1.accept();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
			Alert oAlert2=oBrowser.switchTo().alert();
			String content2=oAlert2.getText();
			Thread.sleep(2000);
			System.out.println(content2);
			oAlert2.accept();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(2000);
			Alert oAlert3=oBrowser.switchTo().alert();
			String content3=oAlert3.getText();
			Thread.sleep(2000);
			System.out.println(content3);
			oAlert3.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void adminLogout() {
		
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
