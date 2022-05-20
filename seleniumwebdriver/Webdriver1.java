package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//launch the browser         
		WebDriver dr=   new ChromeDriver();
               //Pass URL
		         dr.get("https://online.actitime.com/tcs4/login.do");
              // Identify the username field
               WebElement wb=dr.findElement(By.id("username"));
               //Pass the value to username field
               wb.sendKeys("mraj37591@gmail.com");
               WebElement wb1=dr.findElement(By.name("pwd"));
               wb1.sendKeys("vUDUTUXt");
               dr.findElement(By.id("loginButton")).click();
	}

}
