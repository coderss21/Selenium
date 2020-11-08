package com.ajax;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Actions a = new Actions(driver);
        //To send the keys in search box Using keysDown option type in capital letters
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
        //To hover the mouse on accounts option
        a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).contextClick().build().perform();
        //To send keys using CLICK AND HOLD option
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().clickAndHold().sendKeys("dress").build().perform();

        driver.close();

    }
}
