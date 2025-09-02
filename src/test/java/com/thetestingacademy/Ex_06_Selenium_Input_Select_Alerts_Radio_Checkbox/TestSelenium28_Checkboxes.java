package com.thetestingacademy.Ex_06_Selenium_Input_Select_Alerts_Radio_Checkbox;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;


public class TestSelenium28_Checkboxes extends CommonToAll {

    @Test
    public void test_checkBox(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        List<WebElement>allCheck = driver.findElements(By.cssSelector("input[type='checkbox']"));

        for (WebElement checkboxes: allCheck){
            //Check the checkbox if it is not already check
            if (!checkboxes.isSelected()){
                checkboxes.click();
            }
        }

        closeBrowser(driver);

    }
}
