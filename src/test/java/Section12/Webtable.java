package Section12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Marius on 16-Jul-17.
 */
public class Webtable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("http://www.espncricinfo.com/rankings/content/page/211271.html");
        WebElement table = driver.findElement(By.xpath("//table[@class='StoryengineTable']"));
        // finding the rows in table

        List<WebElement> noofrows = table.findElements(By.tagName("tr"));
        System.out.println("nr of rows are" + " " + noofrows.size());

        // finding columns
        int i = 0;
        for (WebElement eachrow:noofrows) {

            List<WebElement> eachcolounb = eachrow.findElements(By.tagName("td"));
            i++;
            System.out.println("nr of coloumns in" + " " + i + " " + "the row are" + " " + eachcolounb.size());


            //finding cell value
            for (WebElement text : eachcolounb) {
                System.out.println(text.getText());
            }

        }




    }
}
