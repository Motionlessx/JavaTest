import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers {
    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "E:\\Idea\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

}
