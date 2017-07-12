package Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AutoSuggestion {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fantasycricket.dream11.com/in/");

        driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("gre");
        WebDriverWait wd = new WebDriverWait(driver, 5);

        wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul")));

        driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[2]/p")).click();
    }
}








