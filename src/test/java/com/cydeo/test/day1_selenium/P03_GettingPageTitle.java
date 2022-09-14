package com.cydeo.test.day1_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_GettingPageTitle {
    public static void main(String[] args) {

        //set up a chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to google and print out the title
        driver.get("https://www.google.com/");

        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);

        if(title.equals("Google")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
        driver.quit();

    }
}
