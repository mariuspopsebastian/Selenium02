import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Marius on 27-May-17.
 */
public class Locator1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Prog\\Pt proiect\\geko\\geckodriver.exe");
        WebDriver driver  = new FirefoxDriver();
        driver.get("https://ro-ro.facebook.com/");
        //driver.findElement(By.xpath(".//*[@id='emg-category-menu-icon']/span")).click();
        driver.findElement(By.id("email")).sendKeys("pop_gigi2@yahoo.com");
        driver.findElement(By.name("pass")).sendKeys("superman");
        //driver.findElement(By.linkText("Ai uitat contul?")).click();
        driver.findElement(By.partialLinkText("Ai uitat")).click();
        //driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();


    }
}
