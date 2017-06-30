package Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class synchroniz {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://alaskatrips.poweredbygps.com/");
        driver.findElement(By.xpath(".//*[@id='tab-hotel-tab']/span[1]")).click();
        driver.findElement(By.xpath(".//*[@id='hotel-destination']")).sendKeys("nyc");
        driver.findElement(By.xpath(".//*[@id='hotel-destination']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(".//*[@id='hotel-checkin']")).sendKeys(Keys.ENTER);
        WebDriverWait d = new WebDriverWait(driver, 20);
        d.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='967211']/div[2]/div/a")));

        driver.findElement(By.xpath(".//*[@id='967211']/div[2]/div/a")).click();

    }
}
