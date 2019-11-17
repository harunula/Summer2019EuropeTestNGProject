package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLnotchanged {

        /**
         * Verify URL not changed
         * open chrome
         * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
         * click on Retrieve password
         * verify that url did not change
         * Verify URL changed
         * open browser
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * enter any email
         * click on Retrieve password
         * verify that url changed to http://practice.cybertekschool.com/email_sent
         * Verify confirmation message
         * open browser
         * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
         * enter any email
         * verify that email is displayed in the input box
         * click on Retrieve password
         * verify that confirmation message says 'Your e-mail's been sent!'
          */
        public static void main(String[] args) {
            //open chrome
            WebDriver driver= WebDriverFactory.getDriver("chrome");

            //go to http://practice.cybertekschool.com/forgot_password Links to an external site.
            driver.get("http://practice.cybertekschool.com/forgot_password");

            //save url to string variable
            String expectedUrl = driver.getCurrentUrl();


            //click on Retrieve password
            WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
            retrievePasswordButton.click();
            String actualUrl = driver.getCurrentUrl();

            if(expectedUrl.equals(actualUrl)){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");

            }

            // close the driver
            driver.quit();


    }
}
