package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyURLnotchanged_training {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.navigate().to("http://practice.cybertekschool.com/forgot_password");
        String expectedURL = driver.getCurrentUrl();
        System.out.println("expectedURL = " + expectedURL);
        driver.findElement(By.id("form_submit")).click();
        String actualURL = driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.quit();
    }
}
