package com.ecomerceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RahulShettyAcademyPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String[] itemsNeeded = {"Tomato", "Cucumber", "Capsicum", "Corn"};
        //To keep track of number of elements in an array
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //define variable for explicit wait condition
        WebDriverWait w = new WebDriverWait(driver,5);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        //call the function to add items in a cart
        addAnItem(driver, itemsNeeded);
        checkOutProducts(driver,w);

        driver.close();

    }

    public static void addAnItem(WebDriver driver, String[] itemsNeeded) {
        int count = 0;
        //Get all the product names in WebElement type List
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        //iterate over each element
        for (int i = 0; i < products.size(); i++) {
            //divide name in 2 parts as it contains like Cauliflower - 1 kg
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
            // Convert array to arrayList
            List veggies = Arrays.asList(itemsNeeded);
            if (veggies.contains(formattedName)) {
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
            }
            if (count == itemsNeeded.length) {
                break;
            }
        }
    }

    public static void checkOutProducts(WebDriver driver,WebDriverWait w){
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        //explicit wait

        w.until((ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo"))));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
    }
}
