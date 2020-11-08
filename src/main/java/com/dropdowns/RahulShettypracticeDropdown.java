package com.dropdowns;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RahulShettypracticeDropdown {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
        s.selectByValue("option1");
        s.selectByIndex(2);
        s.selectByVisibleText("Option3");
    }
}
