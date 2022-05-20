package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//launch the browser         
		WebDriver dr=   new ChromeDriver();
        dr.navigate().to("https://www.flipkart.com");
        Thread.sleep(3000);
        dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(3000);
        dr.findElement(By.xpath("//div[text()='Grocery']")).click();
	}

}
