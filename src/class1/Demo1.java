package class1;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver.get("https://www.google.com/");//This will open chrome browser.
        String url = driver.getCurrentUrl();
        System.out.println("This is the url " + url);
        System.out.println("This is the url " + driver.getCurrentUrl());

        String title =driver.getTitle();// This method will get a page title.
        System.out.println("This is the page Title " +title);

        driver.close();

    }
}
