package com.syntax.SeleniumReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Review02 {

//Radio button example

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement femaleButton = driver.findElement(By.xpath("//input[@value='Female' and @name=\"optradio\"]"));
      //check if the radio button is enabled
        System.out.println("the female radio button is enabled"+ femaleButton.isEnabled());
      // check if the radio btn female is displayed.
        System.out.println("the female radio btn is displayed"+ femaleButton.isDisplayed());
     // check if its selected or not
        System.out.println("the female radio btn is selected"+ femaleButton.isSelected());

        if(!femaleButton.isSelected()){
            femaleButton.click();
        }
// check the status of selection again
        System.out.println("the female radio btn is selection"+ femaleButton.isSelected());

        // to get all the links in the current webpage and print their text
        List<WebElement>  links = driver.findElements(By.tagName("a"));

        for(WebElement link:links){
            String name=link.getText();
            if(!name.isEmpty()){
                System.out.println(name);
            }
        }
    }
}
