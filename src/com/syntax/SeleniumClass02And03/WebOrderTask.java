package com.syntax.SeleniumClass02And03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();

        String title= driver.getTitle();
        if(title.equals("Web Orders")){
            System.out.println("Title Is Correct");
        }else {
            System.out.println("Title is not Correct");
        }

        driver.findElement(By.linkText("LogOut")).click();
        driver.quit();
    }
}
