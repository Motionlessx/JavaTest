import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitTest {
    static WebDriver driver = WebDriverHolder.getInstance().getDriver();
//    static WebDriver driver;

    static JavascriptExecutor jse = (JavascriptExecutor) driver;
    @Test
    public synchronized void main() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "E:\\Idea\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
//        webDriverWait.wait(2500,2500);

        driver.get("https://lendyou.com/");
        wait(5000);


//       String lastName = (String) jse.executeScript("console.log(localStorage.getItem('spxSessionId'))");
//        System.out.println(lastName + " :last name");
//        Logs logs = driver.manage().logs();
//        LogEntries logEntries = logs.get(LogType.BROWSER);
//        for (LogEntry logEntry : logEntries) {
//            System.out.println(logEntry.getMessage());
//        }
        for (Cookie cookie: driver.manage().getCookies()) {
            System.out.println(cookie.getName() + "===>>" + cookie.getValue());
        }

        System.out.println(getSessionId());




    }
    public static String getSessionId() {
        return (String) jse.executeScript(String.format("return window.localStorage.getItem('spxSessionId');"));
    }
}
