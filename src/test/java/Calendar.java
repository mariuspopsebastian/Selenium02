import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by Marius on 06-Jun-17.
 */
public class Calendar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.xpath(".//*[@id='hp-widget__depart']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.linkText("28")).click();
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.xpath(".//*[@id='js-multiCitySearchDepart']")).isDisplayed());
        driver.findElement(By.xpath(".//*[@id='hp-widget__paxCounter']")).click();
        driver.findElement(By.xpath(".//*[@id='js-child_counter']/li[2]")).click();
        driver.findElement(By.linkText("Done")).click();

        /*While loop 5 ori
        int i=0
        while (i<5){
            driver.findElement(By.xpath(".//*[id=adult_count]/a[2]")).click();
            i++;

        }*/

    }

}
