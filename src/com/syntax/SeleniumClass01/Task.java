package com.syntax.SeleniumClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task {
    public static void main(String[] args) {


    /*
    1. launch the browser
    2. navigate to amazon website
    3. print out the title and the url in the console
    4. close the browser
     */

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title+ " "+ url);
        driver.quit();

     }
     }