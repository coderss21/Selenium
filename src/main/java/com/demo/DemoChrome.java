package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.String;

import java.util.logging.XMLFormatter;

public class DemoChrome {
    public static void main(String[] args){

        //Create driver object for chrome browser
        //we will strictly implements methods of webDriver
        //invoke .exe file first
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");  //hit the Url on the browser
        //To get title of the page
        System.out.println(driver.getTitle()); //to validate if your page title is correct
        System.out.println(driver.getCurrentUrl()); //to validate if you are landed on correct url
        //System.out.println(driver.getPageSource()); //to get PageSource of the webpage
         driver.get("http://www.yahoo.com/");
         driver.navigate().back();  // It is use to go back in the browser
         driver.navigate().forward(); //use to move on forward page
         driver.close();  //use to close the current tab
        //driver.quit(); //use to close all the tabs not required for this demo


    }
}
