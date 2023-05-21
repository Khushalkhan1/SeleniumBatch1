package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Registration {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.xpath("//input[@type='Email']"));
        userName.sendKeys("batch1@gmailcom");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("batch1@123");
        WebElement signInButton = driver.findElement(By.xpath("//input[@type='submit']"));
        signInButton.click();
        WebElement employee = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a/span[1]"));
        employee.click();
        WebElement addEmployee = driver.findElement(By.cssSelector("#menu > li:nth-child(2) > ul > li:nth-child(1) > a"));
        addEmployee.click();
        WebElement employeeID = driver.findElement(By.xpath
                ("/html/body/div[1]/div[1]/div/div[2]/div/form/div[1]/div[1]/div/input"));
        employeeID.sendKeys("1");
        WebElement firstName = driver.findElement(By.cssSelector
                ("body > div.page-container > div.left-content > div > div.validation-system > div > form > div:nth-child(4) > div:nth-child(1) > div > input"));
        firstName.sendKeys("Khushal");
        WebElement middleName=driver.findElement(By.xpath("//input[@name='mname']"));
        middleName.sendKeys("null");
        WebElement lastName = driver.findElement(By.cssSelector
                ("body > div.page-container > div.left-content > div > div.validation-system > div > form > div:nth-child(4) > div:nth-child(3) > div > input"));
        lastName.sendKeys("Khan");
        WebElement gender=driver.findElement(By.xpath("//option[@value='1']"));
        gender.click();
        /*driver.findElement(By.id("Birthdate")).click();
        Thread.sleep(2000);
        List<WebElement> birthDates=driver.findElements(By.cssSelector("#Birthdate"));
        System.out.println(birthDates.size());
        for (WebElement birthDate : birthDates){
            String birthDateText = birthDate.getText();
            if (birthDateText.equals("13")){
                birthDate.click();
                break;*/
        WebElement marital=driver.findElement(By.cssSelector
                ("body > div.page-container > div.left-content > div > div.validation-system > div > form > div:nth-child(5) > div:nth-child(2) > div > select"));
        marital.click();
        WebElement maritalSituation=driver.findElement(By.xpath
                ("/html/body/div[1]/div[1]/div/div[2]/div/form/div[4]/div[2]/div/select/option[3]"));
        maritalSituation.click();
        WebElement mobileNumber=driver.findElement(By.xpath
                ("/html/body/div[1]/div[1]/div/div[2]/div/form/div[4]/div[3]/div/input"));
        mobileNumber.sendKeys("5078560495");
        WebElement address1=driver.findElement(By.xpath("//input[@name ='address1']"));
        address1.sendKeys("Turkey, Istanbul");
        WebElement address2=driver.findElement(By.xpath("//input[@name ='address2']"));
        address2.sendKeys("Esenyurt , MehterCesme");
        WebElement address3=driver.findElement(By.xpath("//input[@name ='address3']"));
        address3.sendKeys("1816 St");
        Thread.sleep(2000);
        WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("khushalkhanpaktiawal321@gmail.com");
        WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
        Password.sendKeys("khan.123");

        WebElement submitButton=driver.findElement(By.xpath("//button[@name='submit']"));
        Thread.sleep(2000);
        submitButton.click();

            }

}






