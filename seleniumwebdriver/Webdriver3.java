package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//launch the browser         
		WebDriver dr=   new ChromeDriver();
        dr.navigate().to("https://www.flipkart.com");
        Thread.sleep(3000);
      String titlePage1=  dr.getTitle();
      System.out.println(titlePage1);
        dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(3000);
        dr.findElement(By.xpath("//div[text()='Grocery']")).click();
        Thread.sleep(3000);
        String titlePage2=  dr.getTitle();
        String url1=dr.getCurrentUrl();
        Thread.sleep(3000);
        System.out.println(url1);
        System.out.println(titlePage2);
          dr.navigate().back();
          Thread.sleep(3000);
          String titlePage3=  dr.getTitle();
          String url2=dr.getCurrentUrl();
          Thread.sleep(3000);
          System.out.println(url2);
          System.out.println(titlePage3);
          dr.navigate().forward();
          String titlePage4=  dr.getTitle();
         
          Thread.sleep(3000);
          System.out.println(titlePage4);
          dr.navigate().refresh();
	}

}
