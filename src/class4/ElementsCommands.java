package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsCommands {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement userName=driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        userName.sendKeys("Tester");

        WebElement password=driver.findElement(By.cssSelector("input[name$='password']"));
        password.sendKeys("test");
        WebElement logInButton= driver.findElement(By.cssSelector("input.button"));
        logInButton.click();
        WebElement checkBox= driver.findElement(By.cssSelector("input[id*='ctl02']"));
        boolean isCheckBoxEnabled=checkBox.isEnabled();
        System.out.println(isCheckBoxEnabled);
        if (isCheckBoxEnabled){
            System.out.println("The checkBox is enabled");
        }else {
            System.out.println("The checkBox is disabled");
        }
        boolean isCheckBoxDisabled=checkBox.isDisplayed();
        System.out.println(isCheckBoxDisabled);
        boolean isCheckBoxSelected=checkBox.isSelected();
        System.out.println("Before click "+isCheckBoxSelected);
        checkBox.click();
        isCheckBoxSelected=checkBox.isSelected();
        System.out.println("After click "+isCheckBoxSelected);
        driver.quit();
    }
}
