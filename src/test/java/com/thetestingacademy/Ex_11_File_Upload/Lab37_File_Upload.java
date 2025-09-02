package com.thetestingacademy.Ex_11_File_Upload;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Lab37_File_Upload extends CommonToAll {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));
        String user_dir = System.getProperty("user.dir");
        // \src\test\java\com\thetestingacademy\Ex_11_File_Upload\testdata.txt
        System.out.println(user_dir);
        String path = user_dir+"/src/test/java/com/thetestingacademy/Ex_11_File_Upload/testdata.txt";

        uploadFileInput.sendKeys(path);
        driver.findElement(By.name("submit")).click();

        closeBrowser(driver);

    }

}
