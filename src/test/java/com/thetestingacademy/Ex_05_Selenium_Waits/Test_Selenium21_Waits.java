package com.thetestingacademy.Ex_05_Selenium_Waits;



import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class Test_Selenium21_Waits {


    @Description("Verify Ebay Print the prices (iMac)")
    @Test
    public void test_verify_print_imac_price() {

        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://app.vwo.com");


    }
}