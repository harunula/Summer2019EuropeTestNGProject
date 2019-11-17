package AsiaAssignments;

//    Assignment description
//    •Each student automate 2 test cases:
//        1.Positive test case:
//            •Go to the login page of VyTrack
//            •Enter valid credential (can be any role)
//            •Click login button
//            •Verify that the user login successfully

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PositiveTestCase {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://qa1.vytrack.com/user/login");
        //enter username(storemanager57)
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager57");
        //enter pasword(UserUser123)
        driver.findElement(By.cssSelector("#prependedInput2")).sendKeys("UserUser123");
        Thread.sleep(1500);
        //click
        driver.findElement(By.cssSelector("#_submit")).click();
        String expectedTitle="Dashboard";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        Thread.sleep(1500);
        driver.quit();


    }

}
