import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.fr/");

        String actualTitle= driver.getTitle();
        String expectedtitle ="Google";


        if (actualTitle.equals(expectedtitle)){
            System.out.println(" Test  PASSED");
        }else{
            System.out.println("Test FAILED");
        }




    }
}
