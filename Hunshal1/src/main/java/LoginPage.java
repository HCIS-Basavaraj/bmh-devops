import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

        WebElement username= driver.findElement(By.id("Email"));
        username.clear();
        username.sendKeys("admin@yourstore.com");

        WebElement password=driver.findElement(By.id("Password"));
        password.clear();
        password.sendKeys("admin");
        String loginPageHandle = driver.getWindowHandle();
        WebElement submit=driver.findElement(By.xpath("//div[@class='buttons']/child::button"));
        submit.click();

        String title = driver.getTitle();
        System.out.println(title);
        assertEquals(title, "Dashboard / nopCommerce administration", "Title Identified Successfully...");
        String homePageHandle = driver.getWindowHandle();
        System.out.println("homePageHandle" + homePageHandle);

        WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Thread.sleep(3000);
        ewait.until(ExpectedConditions.titleContains(title));
        driver.navigate().back();
        ewait.until(ExpectedConditions.titleContains("Your store. Login"));
        //Thread.sleep(3000);
        driver.close();
    }
}
