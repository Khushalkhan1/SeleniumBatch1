package class3;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.out;

public class WebOrderTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //driver.findElement(By.id("ct100_MainContent_userName")).sendKeys("Tester");
        WebElement username=driver.findElement(By.id("ct100_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password=driver.findElement(By.name("ct100$MainContent$password"));
        password.sendKeys("test");
        WebElement loginBT=driver.findElement(By.id("ct100_MainContent_login_button"));
        loginBT.click();
        
        String title =driver.getTitle();
        if (title.equals("Web Orders")){
            out.println("The title is correct");
        }else
            System.out.println("The title is not correct");
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }
}
