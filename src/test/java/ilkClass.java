import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ilkClass {
    public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();
//
//        driver.get("https://www.amazon.com/");
//
//        Thread.sleep(3000);
//
//        driver.quit();

        driver.navigate().to("https://www.google.fr/");
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.manage().window().maximize();

    }
}
