package com.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SpiceJetCheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        driver.findElement(By.xpath("//input[contains (@id,'chk_SeniorCitizenDiscount')]")).click();
        //To verify checkbox is selected
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //To count the no of checkboxes
        System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
        driver.close();
    }
}
