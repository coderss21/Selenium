package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCSS {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*------------ tagname[attribute='value'] ---------*/
        driver.get("http://facebook.com");
        driver.findElement(By.cssSelector("input[aria-label = 'Email address or phone number']")).sendKeys("my own xpath");
        driver.findElement(By.cssSelector("[name='pass']")).sendKeys("123pass");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
}
