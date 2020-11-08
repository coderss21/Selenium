package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceCSS {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=in");
        //pass the id attribute and its value use of # for id
        driver.findElement(By.cssSelector("#username")).sendKeys("hey");
        driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.password")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

    }
}
