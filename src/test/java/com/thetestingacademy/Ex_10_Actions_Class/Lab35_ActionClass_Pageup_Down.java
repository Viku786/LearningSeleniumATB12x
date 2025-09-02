package com.thetestingacademy.Ex_10_Actions_Class;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab35_ActionClass_Pageup_Down extends CommonToAll {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();


        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

        closeBrowser(driver);
    }
}
