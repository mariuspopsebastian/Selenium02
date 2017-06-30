import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Marius on 03-Jun-17.
 */
public class Alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
        System.out.println(driver.switchTo().alert().getText());
        //driver.switchTo().alert().sendKeys("test");
        driver.switchTo().alert().accept(); //Accept = ok, done, yes
        //driver.switchTo().alert().dismiss(); //Dismiss = no, cancel
    }

}
