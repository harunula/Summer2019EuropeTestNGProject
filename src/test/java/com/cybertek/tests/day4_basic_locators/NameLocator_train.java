package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NameLocator_train {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.navigate().to("http://practice.cybertekschool.com/sign_up");

        driver.findElement(By.name("full_name")).sendKeys("Mike Simit");
        driver.findElement(By.name("email")).sendKeys("necmi@necmi.com");
        driver.findElement(By.name("wooden_spoon")).click();

        //task
        //verify that you got "Thank you for signing up. Click the button below to return to the home page."

        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
        String actualMessage = driver.findElement(By.name("signup_message")).getText();

        System.out.println("actualMessage = " + actualMessage);

        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


        driver.quit();
        //


    }
}
