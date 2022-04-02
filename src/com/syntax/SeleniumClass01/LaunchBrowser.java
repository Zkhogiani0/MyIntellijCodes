package com.syntax.SeleniumClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");// for windows add extension .ext or you can use back slach //

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
