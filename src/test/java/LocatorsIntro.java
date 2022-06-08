import org.bouncycastle.est.ESTSourceConnectionListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsIntro {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailTextBox = driver.findElement(By.id("session_email"));

        emailTextBox.sendKeys("testtechproed@gmail.com");
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));

        passwordTextBox.sendKeys("Test1234!");
        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();

        driver.manage().window().maximize();

        WebElement userId = driver.findElement(By.className("navbar-text"));

        System.out.println(userId.getText());

        WebElement adresses = driver.findElement(By.linkText("Addresses"));

    String addressLink= adresses.getText();
    String expectedAdressLink = "Addresses";

    if (addressLink.equals(expectedAdressLink)){
        System.out.println("PASS");
    }else {
        System.out.println("FAIL");
    }
        WebElement SignOutwebElement = driver.findElement(By.linkText("Sign out"));
        System.out.println(SignOutwebElement.getText());

        if (SignOutwebElement.getText().equals("Sign out")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        List<WebElement> listOfWebElement = driver.findElements(By.tagName("a"));

        System.out.println("Bu web sayfasinda "+listOfWebElement.size()+" link vardir");

        System.out.println("Birinci elemanin yazdirilmasi  " + listOfWebElement.get(0).getText());
        System.out.println("ikinci elemanin yazdirilmasi  " + listOfWebElement.get(1).getText());
        System.out.println("Ucuncu elemanin yazdirilmasi  " + listOfWebElement.get(2).getText()+"\n");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
for (int i=0 ;i<listOfWebElement.size();i++) {
    System.out.println(listOfWebElement.get(i).getText());}
        System.out.println("**************************************");
for (WebElement element: listOfWebElement){
    System.out.println(element.getText());
}
driver.quit();
    }
}
