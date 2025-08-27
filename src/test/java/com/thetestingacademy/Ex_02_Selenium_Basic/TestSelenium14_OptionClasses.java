package com.thetestingacademy.Ex_02_Selenium_Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium14_OptionClasses {

    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        // FirefoxOptions, ChromeOptions, SafariOptions

        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // local storage, download ?
//        chromeOptions.addArguments("--window-size=800,600");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");
//       chromeOptions.addArguments("--headless");




        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://sdet.live");

        System.out.println(driver.getTitle());

        driver.quit();



    }
}
