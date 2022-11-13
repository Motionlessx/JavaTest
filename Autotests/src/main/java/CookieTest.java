import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.*;

import java.util.*;


public class CookieTest {


    static WebDriver driver = Drivers.getDriver();
//    static WebDriver driver;

    static JavascriptExecutor jse = (JavascriptExecutor) driver;
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "E:\\Idea\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("https://lendyou.com/");
        Thread.sleep(5000);

//       String lastName = (String) jse.executeScript("console.log(localStorage.getItem('spxSessionId'))");
//        System.out.println(lastName + " :last name");
//        Logs logs = driver.manage().logs();
//        LogEntries logEntries = logs.get(LogType.BROWSER);
//        for (LogEntry logEntry : logEntries) {
//            System.out.println(logEntry.getMessage());
//        }

        System.out.println(getSessionId());




    }
    public static String getSessionId() {
        return (String) jse.executeScript(String.format("return window.localStorage.getItem('spxSessionId');"));
    }


}