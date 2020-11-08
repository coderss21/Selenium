package com.completetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SpiceJetE2E {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        //select origin
        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.cssSelector("a[value='DEL']")).click();
        System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value"));
        //select destination
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getAttribute("value"));

        //select date
        driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-active']")).click();

        //select passengers
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@class='row1 adult-infant-child']")).click();

        // Selection of Adults
        Select adultsdrp = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        adultsdrp.selectByValue("3");
        Thread.sleep(2000);

        driver.close();


    }
}
