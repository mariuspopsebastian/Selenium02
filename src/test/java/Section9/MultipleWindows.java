package Section9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by Marius on 02-Jul-17.
 */
public class MultipleWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/intl/ro/gmail/about/");
        driver.findElement(By.xpath("html/body/nav/div/a[3]")).click();
        System.out.println("Before Switching");
        System.out.println(driver.getTitle());
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentid = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        System.out.println("After Switching");
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentid);
        System.out.println("Switching back to parent window");
        System.out.println(driver.getTitle());

    }
}
