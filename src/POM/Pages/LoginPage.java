package POM.Pages;

import Utiles.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonMethod {
    public WebElement userName=driver.findElement(By.name("name"));
    public WebElement password=driver.findElement(By.name("password"));
    public WebElement loginBtn=driver.findElement(By.name("submit"));
}
