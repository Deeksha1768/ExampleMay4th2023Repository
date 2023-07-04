package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProject6 {
	public static WebDriver b=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		Minimize();
		Createcustomer();
		CreateProject();
		ModifyProject();
		DeleteProject();
		Deletecustomer();
		Logout();
		Close();

	}

	private static void launch()
	{
		try {
			b=new ChromeDriver();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try {
			b.get("http://localhost:81/login.do");
			Thread.sleep(2000);

		} catch (Exception e) {

		}
	}
	private static void login()
	{
		try {
			b.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			b.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			b.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Minimize()
	{
		try {
			b.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Createcustomer()
	{
		try {
			b.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			b.findElement(By.id("customerLightBox_nameField")).sendKeys("hawasa");
			Thread.sleep(2000);
			b.findElement(By.id("customerLightBox_descriptionField")).sendKeys("kshdfbcbjhfegugbh");
			Thread.sleep(1000);
			b.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void CreateProject()
	{
		try {
			b.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			b.findElement(By.id("projectPopup_projectNameField")).sendKeys("project2");
			Thread.sleep(2000);
			b.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("ghffyiyfg");
			Thread.sleep(2000);
			b.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void ModifyProject()
	{
		try {
			
			b.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]/div")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("/html/body/div[26]/div[2]/div")).click();
			Thread.sleep(2000);
			


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void DeleteProject()
	{
		try {
			b.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			b.findElement(By.id("//*[@id=\"projectPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deletecustomer()
	{
		try {
			b.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			b.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(1000);
			b.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			b.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			b.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Close()
	{
		try {
			b.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}



