package class11;

import Utiles.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class JSExecuterDemo extends CommonMethod {
    public static void main(String[] args) throws InterruptedException {
        String url="https://amazon.com/";
        openDriver(url);
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -500)");

        Thread.sleep(2000);
        WebElement backToTop=driver.findElement(By.id("'navBackToTop"));
        js.executeScript("arguments[0]scrollIntoView(true)",backToTop);

    }
}
