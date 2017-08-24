package Section12;

import com.sun.jna.platform.WindowUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;

/**
 * Created by Marius on 21-Aug-17.
 */
public class KillTheProcess {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WindowsUtils.killByName("notepad.exe");
        driver.get("http://www.gsmarena.com");

    }
}
