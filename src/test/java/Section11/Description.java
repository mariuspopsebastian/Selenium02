package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static Section11.Description.findFramenumber;

/**
 * Created by Marius on 10-Jul-17.
 */
public class Description {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/recaptcha/api2/demo");
        //driver.manage().window().fullscreen();
        //driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        int number = findFramenumber(driver, By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));

        driver.switchTo().frame(number);
        driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
        driver.switchTo().defaultContent();

        int number1 = findFramenumber(driver, By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
        driver.switchTo().frame(number1);
        driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
    }





    public static int findFramenumber(WebDriver driver, By by)
    {
        int i;
        int framecount = driver.findElements(By.tagName("iframe")).size();

        for (i = 0; i<framecount; i++)
        {
            driver.switchTo().frame(i);

            int count = driver.findElements(by).size();

            if (count>0)
            {

                break;

            }
            else
            {

                System.out.println("continue looping");
            }
        }

        driver.switchTo().defaultContent();
        return i;

    }
}
