package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage_training {
    public static void main(String[] args) {
//        Verify confirmation message
//        open browser
//        go to http://practice.cybertekschool.com/forgot_password  Links to an external site.
//        enter any email
//        verify that email is displayed in the input box
//        click on Retrieve password
//        verify that confirmation message says 'Your e-mail's been sent!'

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.navigate().to("http://practice.cybertekschool.com/forgot_password");
        String expectedEmail = "necmi@hilmi.com";
        WebElement inputMail = driver.findElement(By.name("email"));
        inputMail.sendKeys("necmi@hilmi.com");
        System.out.println(inputMail.getAttribute("value"));
        String actualEmail=inputMail.getAttribute("value");
        if(actualEmail.equals(expectedEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        WebElement retrievePassButton = driver.findElement(By.id("form_submit"));
        retrievePassButton.click();
        WebElement confMessage = driver.findElement(By.name("confirmation_message"));
        String confMessageText = confMessage.getText();
        System.out.println("confMessageText = " + confMessageText);
        String expectedText = "Your e-mail's been sent!";

        if(confMessageText.equals(expectedText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.quit();


    }
}
