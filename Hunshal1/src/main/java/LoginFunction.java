import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver","C:/Drivers/chromedriver_win32/chromedriver.exe");
        //WebDriverManager.chromedriver().setup();

        //1) Launch browser
        //ChromeDriver driver=new ChromeDriver();
        WebDriver driver=new ChromeDriver();

        //2) open url on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize(); // maximize the page

        Thread.sleep(5000);

        //3) Provide username  - Admin
        //WebElement txtUsername=driver.findElement(By.name("username"));
        //txtUsername.sendKeys("Admin");
        driver.findElement(By.name("username")).sendKeys("Admin");

        //4) Provide password  - admin123
        driver.findElement(By.name("password")).sendKeys("admin123");

        //5) Click on Submit button
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);

        // Label validation after successful login
        String act_label = "";

        act_label = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();

        String exp_label="Dashboard";

        if(act_label.equals(exp_label))
        {
            System.out.println("test passed");
        }
        else
        {
            System.out.println("test failed");
        }

        //7) close browser
        //driver.close();
        driver.quit();
    }
}
