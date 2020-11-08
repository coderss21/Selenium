package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoIE {
    public static void main(String[] args){
        //Create driver object for chrome browser
        //we will strictly implements methods of webDriver
        //invoke .exe file first

        System.setProperty("webdriver.ie.driver","C:\\work\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.google.com/");
        //To get title of the page
        System.out.println(driver.getTitle());
    }
}
