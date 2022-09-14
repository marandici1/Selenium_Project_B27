package com.cydeo.test.day1_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_FullScreenMode {
    public static void main(String[] args) {

        //set up a chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to google and print out the title
        driver.get("https://www.google.com/");

        //open maxim screen but not full
        driver.manage().window().maximize();

        //covering all screen
        driver.manage().window().fullscreen();

    }
}
