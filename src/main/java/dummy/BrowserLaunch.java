package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement Destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(source, Destination).perform();
	
		//Thread.sleep(2000);
		//WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		//Actions a= new Actions(driver);
		//a.moveToElement(course).perform();
		
		//WebElement Training = driver.findElement(By.xpath("//span[text()='Data Warehousing Training']"));
		//a.moveToElement(Training).perform();
		
		//driver.findElement(By.xpath("//span[text()='DataStage Training']")).click();

		//driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//.sleep(2000);
		// FirstName = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		//FirstName.sendKeys("Yogesh");
	
		//WebElement Surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		//Surname.sendKeys("Selevaraj");
		//.sleep(2000);
		//.findElement(By.xpath("(//input[@type='radio'])[2]")).click();

		// WebElement email = driver.findElement(By.id("email"));
		// email.sendKeys("mechyogesh24@gmail.com");
		// WebElement pass = driver.findElement(By.name("pass"));
		// pass.sendKeys("8870487076");
		// WebElement click = driver.findElement(By.name("login"));
		// click.click();

	}

}
