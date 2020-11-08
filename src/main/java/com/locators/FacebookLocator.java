package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLocator {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
//        driver.findElement(By.id("email")).sendKeys("This is my first code");
//        driver.findElement(By.name("pass")).sendKeys("12345");
//        driver.findElement(By.linkText("Forgotten password?")).click();
//        driver.close();

        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("hey");
        driver.findElement(By.cssSelector("#pass")).sendKeys("123456");

    }
}
