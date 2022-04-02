package com.syntax.SeleniumReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Review02CheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.syntaxprojects.com/basic-checkbox-demo.php");

        // check the check box
        WebElement checkbox1 = driver.findElement(By.cssSelector("input#isAgeSelected"));
        System.out.println("th checkbox is selected" + checkbox1.isSelected());
        checkbox1.click();
        Thread.sleep(3000);
        // deselect the checkbox
        checkbox1.click();

        //get all the available options
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
        Thread.sleep(3000);
        for (WebElement checkbox : checkboxes) {
            checkbox.click();

        }
    }
}
