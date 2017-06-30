import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Marius on 27-May-17.
 */
public class customize {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ro-ro.facebook.com/");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pop_gigi3@yahoo.com");

    }
}
