package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClassname {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("hello"); //give error as the classname contain spaces
    }
}
