package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement enableButton=driver.findElement(By.cssSelector("#input-example>button"));
        enableButton.click();
        WebElement text= driver.findElement(By.id("message"));
        System.out.println("Is the Text message displayed ? : "+text.isDisplayed());

        WebElement removeButton= driver.findElement(By.cssSelector("#checkbox-example>button"));
        removeButton.click();
        WebElement checkBox=driver.findElement(By.id("message"));
        System.out.println("Is the add button displayed ? : "+checkBox.isDisplayed());




    }
}
