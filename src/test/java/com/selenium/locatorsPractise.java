package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsPractise {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("tata");
		driver.findElement(By.name("inputPassword")).sendKeys("hari");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	  System.out.println( driver.findElement(By.xpath("//p[text()='* Incorrect username or password']")).getText());
	 // driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click(); Using Xpath Test
	  driver.findElement(By.linkText("Forgot your password?")).click();   //Using Linedtext
	  driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("y"); // customized css syntax
	  driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();  //xpath
	  driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("y");
	  driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("h");
	 // driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("77");
	  driver.findElement(By.xpath("//form/input[3]")).sendKeys("88"); //parent tagname child tagname
	  
				}
	

}
