package com.waitMechanism;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
        //driver.findElement(By.xpath("//div[@id='results']"));
        WebDriverWait w = new WebDriverWait(driver,10);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
        System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
        driver.close();
    }
}
