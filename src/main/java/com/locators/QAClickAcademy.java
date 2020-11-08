package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAClickAcademy {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com");

        //parent child relationship
        //driver.findElement(By.xpath("//nav[@class='navbar-collapse collapse']/ul/li[2]")).click();
        //traverse back to parent
        driver.findElement(By.xpath("//a[text()='Videos']")).click();
       //driver.findElement(By.xpath("//a[text()='Videos']/ancestor::ul")).click();
    }

}
