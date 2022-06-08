import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DenemeImpatlivre {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        driver.navigate().to("https://impact-livres.com/");

        WebElement buttonAccederBoutique = driver.findElement(By.className("modal-connexion-link"));
        buttonAccederBoutique.click();
    }
}
