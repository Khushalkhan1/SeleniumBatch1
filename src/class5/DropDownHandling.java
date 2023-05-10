package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='A Simple Dropdown Menu']")).click();
        //driver.findElement(By.xpath("")).click();
        WebElement DD = driver.findElement(By.name("coffee"));
        Select select = new Select(DD);
        Thread.sleep(1000);
        //select.selectByIndex(2);
        select.selectByVisibleText("With sugar");
        List<WebElement> options=select.getOptions();
        System.out.println(options.size());

        for (int i=0; i< options.size(); i++){
            String optionText=options.get(i).getText();
            System.out.println(optionText);
            select.selectByIndex(i);
            Thread.sleep(1000);

        }


    }
}
