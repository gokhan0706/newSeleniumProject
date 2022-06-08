import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLTest {

    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");

       WebDriver driver =new ChromeDriver();
       driver.get("https://www.google.fr");

       String  actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.google.fr/";

        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
            System.out.println("Expected URL   "+expectedUrl);
            System.out.println("actualUrl "+actualUrl);
        }

driver.close();



    }


}
