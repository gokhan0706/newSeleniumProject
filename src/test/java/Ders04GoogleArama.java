import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ders04GoogleArama {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        driver.navigate().to("https://www.google.fr/#cns=1");

        WebElement googleTextBox = driver.findElement(By.name("q"));
        googleTextBox.sendKeys("city bike");
        googleTextBox.submit();
        //"
        WebElement accepteBox = driver.findElement(By.className("QS5gu sy4vM"));

        accepteBox.click();


    }
}
