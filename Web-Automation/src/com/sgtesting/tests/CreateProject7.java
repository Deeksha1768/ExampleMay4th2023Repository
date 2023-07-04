package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProject7 {
    public static WebDriver b=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		createTasks();
		deleteTasks();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();

	}
	private static void launchBrowser()
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
	private static void minimizeFlyOutWindow()
	{
		try {
			b.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try {
			b.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			b.findElement(By.id("customerLightBox_nameField")).sendKeys("Aria");
			Thread.sleep(2000);
			b.findElement(By.id("customerLightBox_descriptionField")).sendKeys("hello");
			Thread.sleep(2000);
			b.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void createProject()
	{
		try {
			b.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			b.findElement(By.id("projectPopup_projectNameField")).sendKeys("project3");
			Thread.sleep(2000);
			b.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("ghffyiyfg");
			Thread.sleep(2000);
			b.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createTasks()
	{
		try {
			b.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")).click();
			Thread.sleep(3000);
			b.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("Script");
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\"descriptionElement\"]/img")).click();
			Thread.sleep(3000);
			b.findElement(By.id("editDescriptionPopupText")).sendKeys("Task to be given");
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\"scbutton\"]")).click();
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\"ext-gen144\"]")).click();
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\"ext-gen294\"]")).click();
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\"ext-gen162\"]/td[2]")).click();
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\"ext-gen344\"]")).click();
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[5]/div/input")).click();
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\"createTasksPopup_commitBtn\"]")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteTasks()
	{
		try {
			b.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")).click();
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			b.findElement(By.id("taskPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try {
			b.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			b.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(3000);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try {
			b.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(3000);
			b.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try {
			b.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try {
			b.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
