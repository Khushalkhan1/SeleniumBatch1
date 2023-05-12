package reviewClass2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.findElement(By.xpath("//input[@name='alert']")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='confirmation']")).click();
        Alert confirmAlert=driver.switchTo().alert();
        System.out.println("This is confirm alert text : "+confirmAlert.getText());
        Thread.sleep(2000);
        confirmAlert.dismiss();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='prompt']")).click();
        Alert promptAlert=driver.switchTo().alert();
        Thread.sleep(2000);
        String promptAlertText=promptAlert.getText();
        System.out.println(promptAlert);
        promptAlert.sendKeys("JOIN-CORE-TECH");
        Thread.sleep(2000);
        promptAlert.accept();

    }
}
