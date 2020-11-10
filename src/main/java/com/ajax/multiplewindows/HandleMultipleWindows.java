package com.ajax.multiplewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandleMultipleWindows {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[//*[text()='Recruiters']]")).click();
        System.out.println("Before Switching");
        System.out.println(driver.getTitle());

       //Return the ids of different open windows
        Set<String> ids= driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();

        driver.switchTo().window(childId);
        System.out.println("After switching");
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentId);
        System.out.println("Switching back to parent");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
