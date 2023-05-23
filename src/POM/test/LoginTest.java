package POM.test;

import POM.Pages.LoginPage;
import Utiles.CommonMethod;

public class LoginTest extends CommonMethod {
    static String url="https://dreamhiringacademy.com/index.php";
    public static void main(String[] args) {
        openDriver(url);
        driver.manage().window().maximize();
        LoginPage loginPage=new LoginPage();
        loginPage.userName.sendKeys("batch1@gmailcom");
        loginPage.password.sendKeys("batch1@123");
        loginPage.loginBtn.click();

    }
}
