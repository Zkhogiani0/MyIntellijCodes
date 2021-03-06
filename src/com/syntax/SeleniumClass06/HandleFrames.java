package com.syntax.SeleniumClass06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement textbox= driver.findElement(By.id("name"));
        textbox.sendKeys("Batch 12 forever!!!");

        driver.switchTo().defaultContent();

        WebElement alertButton= driver.findElement(By.id("alert"));
        alertButton.click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.switchTo().frame("iframe_a");
        textbox.clear();
        textbox.sendKeys("we are back to frame");

        driver.switchTo().defaultContent();
        WebElement frameElement = driver.findElement(By.id("//iframe[@src = '/Demo,html']"));
        driver.switchTo().frame(0);
        textbox.clear();
        textbox.sendKeys("Hold your Horses");


    }
}
