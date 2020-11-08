package com.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SpiceJetDynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.spicejet.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        // OriginStation
        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.cssSelector("a[value='DEL']")).click();
        System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value"));
        // Destination
        //driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
        //driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
        //find the dynamic dropdown using parent child relationship
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getAttribute("value"));

        //Selecting date it will select the current date
        //driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-active']")).click();

        //this selenium method is Enabled will not work in current HTML scenarios so we use different method
        //System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        //System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
            System.out.println("Round Trip is enabled");
        }
        else
            System.out.println("Round trip not enabled");


        driver.close();
    }
}
