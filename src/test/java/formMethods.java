import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Marius on 04-Jun-17.
 */
public class formMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Prog\\Pt proiect\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        System.out.println("Before clicking on Multicity radio button");
        System.out.println(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
        driver.findElement(By.xpath(".//*[@id='js-switch__option']/div[3]/label")).click();
        //driver.findElement(By.xpath(".//*[@id='js-switch__option']/div[3]/label")).isEnabled();
        System.out.println("After clicking on Multicity Butoon");
        System.out.println(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
        //Thread.sleep(3000L);
        System.out.println(driver.findElement(By.xpath(".//*[@id='fd-wrap']/div[2]/h2")).getText());


        //driver.findElement(By.xpath(".//*[@id='js-switch__option']/div[2]/label/button")).isDisplayed();
        //Is displayed works only if the elemnt exists on the page and is hidden . it will not work if the element is not present on the page

        //If you want tto validate if an object is present in a web page user this:
        int count = driver.findElements(By.xpath(".//*[@id='js-switch__option']/div[2]/label/button")).size();

        if (count==0){
            System.out.println("verified");
        }


    }
}
