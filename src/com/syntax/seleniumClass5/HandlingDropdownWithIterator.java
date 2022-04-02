package com.syntax.seleniumClass5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownWithIterator {
    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
