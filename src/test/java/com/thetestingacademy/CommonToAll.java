package com.thetestingacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CommonToAll {

    public EdgeDriver driver;

    public void openBrowser(WebDriver driver,String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeBrowser(WebDriver driver){
        driver.quit();
    }


}
