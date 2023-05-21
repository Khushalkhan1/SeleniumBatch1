package class10;

import Utiles.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo extends CommonMethod {
    public static void main(String[] args) throws InterruptedException {
        String url="http://amazon.com";
        Thread.sleep(2000);
        openDriver(url);
        driver.manage().window().maximize();
        WebElement accountAndList=driver.findElement(By.id("nav-link-accountList"));
        Actions actions=new Actions(driver);
        actions.moveToElement(accountAndList).perform();
        Thread.sleep(2000);
        tearDown();

    }
}
