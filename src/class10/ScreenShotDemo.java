package class10;

import Utiles.CommonMethod;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class ScreenShotDemo extends CommonMethod {
    public static void main(String[] args) throws InterruptedException, IOException {
        String url = "https://dreamhiringacademy.com/index.php";
        openDriver(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement userNameBox = driver.findElement(By.xpath("//input[@type='Email']"));
        Thread.sleep(1000);
        userNameBox.sendKeys("batch1@gmailcom");
        WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordBox.sendKeys("batch1@123");
        WebElement signInBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        signInBtn.click();
       /* public static void takeScreenShot(String filePath) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File sourceFile = ts.getScreenshotAs(OutputType.FILE);
            try {

                FileUtils.copyFile(sourceFile, new File("ScreenShot/adminLogin.png"));
            } catch (IOException e) {
                e.printStackTrace();*/
        String filePath="ScreenShot/adminLogin.png";
        takeScreenShot(filePath);
        tearDown();


        }
    }
