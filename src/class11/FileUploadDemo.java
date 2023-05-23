package class11;

import Utiles.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadDemo extends CommonMethod {
    public static void main(String[] args) {
        String url="https://the-internet.herokuapp.com/";
        openDriver(url);
        driver.manage().window().maximize();

        WebElement uploadFile=driver.findElement(By.linkText("File Upload"));
        uploadFile.click();

        WebElement choseFileBtn=driver.findElement(By.id("file-upload"));
        choseFileBtn.sendKeys("C:\\Users\\Dell\\IdeaProjects\\SeleniunBatch1\\ScreenShot\\adminLogin.png");
        WebElement uploadButton=driver.findElement(By.xpath("//input[@class='button']"));
        uploadButton.click();
        driver.navigate().back();
        
    }
}
