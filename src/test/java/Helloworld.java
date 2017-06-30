import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Marius on 24-May-17.
 */
public class Helloworld {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","D:/Prog/Pt proiect/geko/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://qaclickacademy.com"); ///Get tp hit the url
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}
