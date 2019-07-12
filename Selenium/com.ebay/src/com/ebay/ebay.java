package com.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.*;


public class ebay {

	public static void main(String[] args) {
		
		// set the chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wsembukuttige\\Documents\\Selenium\\com.ebay\\Driver\\chromedriver.exe");
		
		//initate webdriver
		WebDriver driver=new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		
		//Open ebay
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("ebay");
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys(Keys.RETURN);//enter
		driver.findElement(By.xpath("//a/h3[contains(text(),\"eBay: Electronics, Cars, Fashion, Collectibles, Coupons and More\")]")).click();
		
		driver.get("https://www.ebay.com/");
		
		//Find sign in link and click
		driver.findElement(By.xpath("//span/a[text()=\"Sign in\"]")).click();
		//pause
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//Enetering username and password
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("surandhi.fdo94@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("1qaz@WSX!*");
	
		driver.findElement(By.xpath("//button[@id=\"sgnBt\"]")).click();
		
		
		//Verify the name
		driver.findElement(By.xpath("//button/b[text()=\"Su\"]"));
		
		
		// Close browser
		driver.close();

	}

}
