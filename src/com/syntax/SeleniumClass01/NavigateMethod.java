package com.syntax.SeleniumClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(2000); //it pauses the execution for 2 secs
        driver.navigate().refresh();
       //driver.close(); // closing the current tab
        driver.quit(); // closing the entire browser


    }
}
