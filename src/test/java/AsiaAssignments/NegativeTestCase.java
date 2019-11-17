package AsiaAssignments;
/*2. Negative test case:
•Go to the login page of VyTrack
•Enter invalidcredential (can be any role)
•Click login button
•Verify that the system shows error message “Invalid user name or password.”
*/
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NegativeTestCase {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa1.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#prependedInput")).sendKeys("user1");
        driver.findElement(By.cssSelector("#prependedInput2")).sendKeys("123456");
        driver.findElement(By.cssSelector("#_submit")).click();
        Thread.sleep(1500);
        String actualMessage = driver.findElement(By.xpath("//div[text()='Invalid user name or password.']")).getText();
        String expectedMessage = "Invalid user name or password.";
        if(actualMessage.equals(expectedMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualMessage = " + actualMessage);
            System.out.println("expectedMessage = " + expectedMessage);
        }

        driver.quit();
    }
}
