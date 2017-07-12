package Section10;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Marius on 04-Jul-17.
 */
public class Exerc {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ebay.com/");
        //Count of the Links in the entire page.
        System.out.println("Links in the page");
        System.out.println(driver.findElements(By.tagName("a")).size());
        //Count of links in the footer section of the page
        WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
        System.out.println(footer.findElements(By.tagName("a")).size());
        WebElement col = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]"));
        System.out.println(col.findElements(By.tagName("a")).size());

        String Beforeclicking = null;
        String Afterclicking;

        for (int i=0; i<col.findElements(By.tagName("a")).size(); i++){

            //System.out.println(col.findElements(By.tagName("a")).get(i).getText());
            if (col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
            {
                Beforeclicking = driver.getTitle();

                col.findElements(By.tagName("a")).get(i).click();
                break;
                }
                Afterclicking =driver.getTitle();
                if (Beforeclicking!=Afterclicking){

                    if(driver.getPageSource().contains("sitemap"))
                        System.out.println("Pass");
                }
                else{
                    System.out.println("Fail");
                }
            }

        }

    }

