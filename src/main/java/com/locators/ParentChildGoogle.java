package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildGoogle {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("write program in c");
    }
}
