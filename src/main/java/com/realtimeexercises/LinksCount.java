package com.realtimeexercises;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class LinksCount {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Get all the link count in the webpage
        System.out.println(driver.findElements(By.tagName("a")).size());
        //get the linkcount in the footer side
        WebElement footerElement =driver.findElement(By.xpath("//div[@id='gf-BIG']"));
        System.out.println(footerElement.findElements(By.tagName("a")).size());

        //get the link counts in particular column
        WebElement columnElement= driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnElement.findElements(By.tagName("a")).size());

        //click on each link inside the column
        for(int i=1;i<columnElement.findElements(By.tagName("a")).size();i++){
            //to open the link on new tab
            String clickOnNewTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
            columnElement.findElements(By.tagName("a")).get(i).sendKeys(clickOnNewTab);

        }
        //to print the title of each page
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> it = windowHandles.iterator();
        while(it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }
        driver.quit();
    }
}
