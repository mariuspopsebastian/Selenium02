package Section12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Marius on 21-Aug-17.
 */
public class Certificate {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome ();
        handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
        WebDriver driver = new ChromeDriver(handlSSLErr);

        driver.get("http://www.gsmarena.com");
    }
}
