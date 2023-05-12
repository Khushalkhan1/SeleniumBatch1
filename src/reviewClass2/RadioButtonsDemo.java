package reviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonsDemo {
    public static String url = "https://mui.com/material-ui/react-radio-button/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.drive", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='radio-buttons-group']"));
        System.out.println(radioButtons.size());

        for (WebElement RBtn : radioButtons) {//This for loop will click on all each button.
            System.out.println("Before click " + RBtn.isSelected());
            RBtn.click();
            System.out.println("After click " + RBtn.isSelected());
            Thread.sleep(2000);
        }

        for (WebElement radioBtn : radioButtons) {
            String value = radioBtn.getAttribute("value");
            System.out.println(value);
            if (value.equalsIgnoreCase("male")) {
                radioBtn.click();
            } else if (!radioBtn.isEnabled()) {
                System.out.println("The radio button is not enabled");
            }
        }
    }
}