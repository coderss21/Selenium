package com.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SpiceJetHandlingDropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());



        //selecting the no of passengers

       // driver.findElement(By.xpath("//div[@id='divpaxOptions']")).click();
        Thread.sleep(10000);
       driver.findElement(By.xpath("//*[@class='row1 adult-infant-child']")).click();


	     // Selection of Adults
	     //WebElement Adults = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
	     Select adultsdrp = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	     adultsdrp.selectByValue("3");
	     driver.close();





    }

}
