package com.ajax.multiplewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsHerokuapp {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[text()='Click Here']")).click();
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String  parentId= it.next();
        String childId= it.next();

        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());
        driver.close();

    }

}
