package Section12;

import com.sun.jna.platform.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Set;

/**
 * Created by Marius on 21-Aug-17.
 */
public class Cookies {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http:www.gsmarena.com");
        Set<Cookie> abc = driver.manage().getCookies();
        System.out.println(abc.size());
        driver.manage().deleteAllCookies();
        Set<Cookie> abcd = driver.manage().getCookies();
        System.out.println(abcd.size());

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        org.apache.commons.io.FileUtils.copyFile(scrFile, new File("D:\\Java\\Screenshot Folder\\screenshot.png"));


    }
}
