package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceLocator {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("Hello world");
        driver.findElement(By.name("pw")).sendKeys("1234569");
        driver.findElement(By.xpath("//*[@id='Login']")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
    }
}
