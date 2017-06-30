import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class  Browserinvocation {
    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", "D:\\Prog\\Pt proiect\\geko\\geckodriver.exe");


        try {
            WebDriver driver = new FirefoxDriver();
            driver.get("http://google.com");
        } catch (Exception e) {


            System.out.println(e);
        }
    }
}
