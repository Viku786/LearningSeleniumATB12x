package com.thetestingacademy.Ex_01_Selenium_Basic;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_data(){
        Assert.assertEquals("vikash","vikash");
    }

    @Test
    public void test_OpenVWOLoginPage(){
        // Open VWO.com, right?
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
        driver.quit();


    }
}
