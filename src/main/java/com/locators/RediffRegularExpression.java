package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffRegularExpression {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://rediff.com");
        // tagName[Attribute*='value'] -- css Regular expression
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.id("login1")).sendKeys("shubhra");
        // //tagName[conatins(@Attribute,'value')]------ Xpath regular expression
        driver.findElement(By.cssSelector("input[id*='password']")).sendKeys("123pass");
        driver.findElement(By.xpath("//input[contains(@name,'proc')]")).sendKeys("hello");
        driver.findElement(By.cssSelector("input[name*='proce']")).click();
    }

}
