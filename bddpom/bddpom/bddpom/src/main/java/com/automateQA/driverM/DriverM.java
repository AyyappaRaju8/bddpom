package com.automateQA.driverM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverM {
    public static  WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new EdgeDriver(); // Initialize the WebDriver instance
            driver.manage().window().maximize(); // Optional: Maximize the browser window
        }
        return driver;
    }

}