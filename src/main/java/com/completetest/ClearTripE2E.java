package com.completetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ClearTripE2E {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.cleartrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        //Get the date
        //Click Departure date
        driver.findElement(By.id("DepartDate")).click();
        Thread.sleep(2000);
       driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();

        driver.findElement(By.id("OneWay")).click(); // To choose radio button option
        Select adults = new Select(driver.findElement(By.id("Adults")));
        adults.selectByIndex(5);
        Select children = new Select(driver.findElement(By.id("Childrens")));
        children.selectByValue("2");
        Select infant= new Select(driver.findElement(By.id("Infants")));
        infant.selectByValue("1");
        //Select text written value
        driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[id='AirlineAutocomplete']")).sendKeys("indigo");
        driver.findElement(By.id("SearchBtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
        driver.close();
    }

}
