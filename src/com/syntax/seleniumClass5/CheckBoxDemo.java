package com.syntax.seleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {

   public static String url ="https://www.syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get(url); // non static can not be used in static we have to add
        // locating checkboxes and storing them in the list.
        List<WebElement> optionalCheckBoxes= driver.findElements(By.cssSelector("input[class='cb1-element']"));
        int size =optionalCheckBoxes.size();
        System.out.println(size);
        // looping through each element from the list line 19
        for(WebElement option:optionalCheckBoxes){
            //option.click(); when i // do it. now we are selecting one option among 4
            String checkBoxvalue=option.getAttribute("value");

            if(checkBoxvalue.equals(("Option-2"))){
                option.click();
                break;
            }

        }




    }
}
