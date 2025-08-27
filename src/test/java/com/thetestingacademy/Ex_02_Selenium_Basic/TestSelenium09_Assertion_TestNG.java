package com.thetestingacademy.Ex_02_Selenium_Basic;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium09_Assertion_TestNG {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        // TestNG
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com");
        // AssertJ Validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull()
                .isEqualTo("https://www.google.com/?zx=1756108202625&no_sw_cr=1\n" +
                        "<Click to see difference>");

        driver.quit();


    }
}
