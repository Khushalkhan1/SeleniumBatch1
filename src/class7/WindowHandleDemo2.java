package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();
        String mainWindowHandle= driver.getWindowHandle();
        Set <String> allWindowHandles=driver.getWindowHandles();
        Iterator <String> iterator= allWindowHandles.iterator();
        while (iterator.hasNext()){
            String childWindowHandle=iterator.next();
            if (!mainWindowHandle.equals(childWindowHandle)){
                driver.switchTo().window(childWindowHandle);
                WebElement text=driver.findElement(By.id("sampleHeading"));
                System.out.println("This is simple window text "+text.getText());

                if (text.getText().equals("This is simple page")){
                    System.out.println("Text as expected");
                }else {
                    System.out.println("Text is not as expected");
                }
            }
        }
        driver.close();
        driver.switchTo().window(mainWindowHandle);
        driver.quit();
    }
}
