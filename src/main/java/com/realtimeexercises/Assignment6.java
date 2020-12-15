package com.realtimeexercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Assignment6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\work\\npmwork\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
        String value = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText();
        System.out.println(value);
        Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
        dropdown.selectByVisibleText(value);
        driver.findElement(By.id("name")).sendKeys(value);
        driver.findElement(By.cssSelector("[id='alertbtn']")).click();
        String text = driver.switchTo().alert().getText();
        if (text.contains(value)) {
            System.out.println("Success");
        } else
            System.out.println("Something wrong");
        driver.switchTo().alert().accept();

        driver.close();


    }
}
