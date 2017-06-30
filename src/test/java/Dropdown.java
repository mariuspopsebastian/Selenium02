import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Marius on 01-Jun-17.
 */
public class Dropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://book2.spicejet.com/");
        Select s =new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
        s.selectByValue("2");
        s.selectByIndex(6);
        s.selectByVisibleText("4");
        Select  locatie = new Select(driver.findElement(By.xpath(".//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1']")));
        locatie.selectByValue("GOI");

        /*
        Textul asta nu merge dar e eexemplu de dynamic dropdown din Section 7 Lecture 41
        driver.findElement(By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1")).click();
        driver.findElement(By.xpath("//a[@value='GOI']")).click();
        driver.findElement(By.xpath("(//a[@value='DEL')[2]")).click();
        */
    }
}
