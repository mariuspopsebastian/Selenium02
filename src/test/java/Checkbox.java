import org.apache.xpath.SourceTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Marius on 03-Jun-17.
 */
public class Checkbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://book2.spicejet.com/");
        //isSelected()
        //Validate wheter checkbox is selected by default
        System.out.println("Is the checkbox selected:" + driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
        System.out.println("Is the checkbox selected:" + driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());
        // true or false from isSelected
    }
}
