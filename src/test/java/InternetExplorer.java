import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "D:\\Prog\\Pt proiect\\IEDriver\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://google.com");
    }
}
