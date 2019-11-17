package com.cybertek.tests.day1_basic_navigation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class basic_firefox_training {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.google.com");

    }
}
