package class8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitDemo {
    public static String url = "http://the-internet.herokuapp.com/dynamic_loading/1";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();


    }
}