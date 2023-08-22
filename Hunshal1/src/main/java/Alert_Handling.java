import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Alert_Handling {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Alert alertWindow=driver.switchTo().alert();
        String alertMessage = alertWindow.getText();

        System.out.println(alertMessage);

        alertWindow.accept();



/*        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
        Thread.sleep(3000);

        List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));

        System.out.println("Number of suggestions:"+list.size());


        //select an option from list
        for(int i=0;i<list.size();i++)
        {
            String text=list.get(i).getText();

            if(text.equals("selenium tutorial"))
            {
                list.get(i).click();
                break;
            }

        }*/
        driver.close();
    }
}
