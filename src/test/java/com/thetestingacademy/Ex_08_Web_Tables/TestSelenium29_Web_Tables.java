package com.thetestingacademy.Ex_08_Web_Tables;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium29_Web_Tables extends CommonToAll {

    @Test
    public void test_WebTables(){

        // Which country is of Google

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");

        //How to fetch table
        // xpath - //table[@id="customers"] , CSS Selectors , ID
        // If something dynamic in nature - //table[contains@id,"cust"]
        //By Tag Name - table - If there is one Table (If nothing works)

        //Number of Rows and Columns
        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th")).size();
       // System.out.println(row);
       // System.out.println(col);

        //table[@id="customers"]/tbody/tr[i]/td[j]

        String firstPart = "//table[@id=\"customers\"]/tbody/tr[";
        String secondPart = "]/td[";
        String thirdPart = "]";

        for (int i = 2; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {

                String dynamic_Path = firstPart+i+secondPart+j+thirdPart;
              //  System.out.println(dynamic_Path);

                String data = driver.findElement(By.xpath(dynamic_Path)).getText();
               System.out.print(data +" ");

                if(data.contains("Google")){
                    String temp = dynamic_Path+"/following-sibling::td[2]";
                    String country_Google = driver.findElement(By.xpath(temp)).getText();
                    System.out.println(country_Google);

                    // Who is in Google
                    String temp1 = dynamic_Path+ "/following-sibling::td[1]";
                    String member_Google = driver.findElement(By.xpath(temp1)).getText();
                    System.out.println(member_Google);
                }

                //Find Helen Benett of which country
                while (!data.contains("Helen Bennett")){
                    driver.findElement(By.xpath("next")).click();
                    if (data.contains("Helen Bennett")) {
                        String country_path = dynamic_Path + "/following-sibling::td";
                        String country_Text = driver.findElement(By.xpath(country_path)).getText();
                        System.out.println("-----------------------");
                        System.out.println("Hellen Bennett is in - " + country_Text);
                    }
                }
            }
        }

        closeBrowser(driver);

    }
}
