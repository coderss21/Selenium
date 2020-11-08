package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DemoFirefox {
    public static void main(String[] args){
        //Create driver object for chrome browser
        //we will strictly implements methods of webDriver
        //invoke .exe file first
        //gecko driver for Firefox
        System.setProperty("webdriver.gecko.driver","C:\\work\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        //To get title of the page
        System.out.println(driver.getTitle());

    }

}
