import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Drivers {

    public static WebDriver getDriver() {
    WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver", "E:\\Idea\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

//    WebDriverManager.chromedriver().setup();

}
