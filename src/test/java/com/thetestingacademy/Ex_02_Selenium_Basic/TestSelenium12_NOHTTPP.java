package com.thetestingacademy.Ex_02_Selenium_Basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium12_NOHTTPP {

    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("bing.com"); // HTTPs is important.
        driver.get("https://bing.com"); // HTTPs is important.

        driver.quit();

    }
}
