package com.realtimeexercises;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandingTables {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\work\\npmwork\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/31968/dvk-vs-jst-semi-final-2-lanka-premier-league-2020");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //selecting the complete  one table
        WebElement table =driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        //Get css for one row in that table and find the size of rows in table
        int rowcount= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
        int count= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        int sum=0;
        for(int i=0;i<count-2;i++){
            String value= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            sum=sum+Integer.parseInt(value);
        }
       // System.out.println(sum);
        String extraSum= driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        int expectedSum=sum+Integer.parseInt(extraSum);
        String totalSum= driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
        int totalSumInt = Integer.parseInt(totalSum);
        if(expectedSum==totalSumInt){
            System.out.println("Count matches");
        }
        else
            System.out.println("Count failed");
        driver.close();

    }
}
