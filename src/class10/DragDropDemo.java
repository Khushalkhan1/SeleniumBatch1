package class10;

import Utiles.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo extends CommonMethod {
    public static void main(String[] args) throws InterruptedException {
        String url="https://jqueryui.com/droppable/";
        openDriver(url);
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement draggable=driver.findElement(By.id("draggable"));
        WebElement droppable=driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        //actions.dragAndDrop(draggable, droppable).perform();//we can use both for the dropping.
        actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform();//we can use both.

        //tearDown And driver.close works same.
        Thread.sleep(2000);
        tearDown();


    }
}
