package com.realtimeexercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingCalendar {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\work\\npmwork\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.id("travel_date")).click();
        //Before Grabing the day we need to select the month
       while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")){
           driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
       }
        //Grab the common attribute and put into list and iterate
        List<WebElement> dates= driver.findElements(By.cssSelector(".day"));
        int count= driver.findElements(By.cssSelector(".day")).size();
        //Run through the loop and find the particular day
        for(int i =0;i<count;i++){
            String text=driver.findElements(By.cssSelector(".day")).get(i).getText();
            if(text.equalsIgnoreCase("21")){
                driver.findElements(By.cssSelector(".day")).get(i).click();
                break;
            }
        }
       driver.close();
    }
}
