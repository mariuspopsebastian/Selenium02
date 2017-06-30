import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by Marius on 21-May-17.
 */
public class MyFirstTest {

    @Test
    public void startWebDriver(){
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("title should start with Selenium Simpified", driver.getTitle().startsWith("Seleium Simplified"));

        driver.close();
        driver.quit();
    }

}
