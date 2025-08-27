package com.thetestingacademy.Ex_02_Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium13_Close_VS_quit {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

     //  driver.close();
        // Close - will close the current tab, not the session (not the all tabs)
       // session id != null


       driver.quit();
        // It will close all the tabs. - session id == null



    }
}
