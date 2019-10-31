package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //bu bos bir chrome tab aciyor


       driver.get("https://practice.cybertekschool.com"); //bu, acilmis olan tab'a adres giriyor

        Thread.sleep(3000);

       //close() closes the current tab
        driver.close();
        //ustteki kod sayfayi kapattigi icin yeniden acmak gerekiyor; onu da alttaki kod la yaptik


        driver=new ChromeDriver();


      driver.get("https://practice.cybertekschool.com/open_new_tab");
      Thread.sleep(5000);
    //quit() --> closes all open windows and tabs and pop ups
      driver.quit();










    }
}
