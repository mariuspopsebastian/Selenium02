import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Marius on 30-May-17.
 */
public class Css {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("test");
        driver.findElement(By.cssSelector("[id='password']")).sendKeys("parola");
        //driver.findElement(By.xpath("//input[@id='Login']")).click();
        driver.findElement(By.cssSelector("#Login")).click();


        //For cssselector #id and .class also works
        /*
        css =     [class='input r4 wide mb16 mt8 username']
        css2=   tag[atribute='value']
        xpath =   //&[@class='input r4 wide mb16 mt8 username']
        xpath al doilea elemet cu exact acelasi id = (//a[@value='DEL')[2]  pui tot xpath intre paranteze si pui [2] dupa el
        */
    }
}
