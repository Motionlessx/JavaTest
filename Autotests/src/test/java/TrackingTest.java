import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TrackingTest {
    WebDriver driver = Drivers.getDriver();
    HitmetrixWebsitesPage websitesCrud = new HitmetrixWebsitesPage(driver);
    HitmetrixRecordingsPage recordingsPage = new HitmetrixRecordingsPage(driver);
    InstLogin login = new InstLogin(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    @Before
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://cp-inst334-client.phonexa.xyz/p8/hitmetrix/websites");


    }
    @Test
    public synchronized void main() throws InterruptedException {
        login.fillfields();
        websitesCrud.clickGetCodeButton();
//        websitesCrud.getCodeForTracking();
//        String code = driver.findElement(By.xpath("//textarea[@id='jsFormCode']")).getText().replaceAll("\\<.*?>", "");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5), Duration.ofMillis(5000));
        wait(5000);
        String window1 = driver.getWindowHandle();
        js.executeScript("window.open()");
        Set<String> currentWindow = driver.getWindowHandles();
        String window2 = null;
        for (String window : currentWindow) {
            if(!window.equals(window1)) {
                window2 = window;
                break;
            }
        }

        driver.switchTo().window(window2);
        driver.get("https://bestfastpayday.com/");
        jse.executeScript(websitesCrud.getCodeForTracking());
        wait(5000);
        String sessionId = getSessionId();
        System.out.println("website: " + getSessionId());
        driver.switchTo().window(window1);
        driver.get("https://cp-inst334-client.phonexa.xyz/p8/hitmetrix/recordings");
        recordingsPage.checkLastSession(sessionId);
        System.out.println("modal window: " + recordingsPage.getLastSessionId());
        Assert.assertEquals(sessionId,recordingsPage.getLastSessionId());




    }
    private   String getSessionId() {
        return (String) jse.executeScript(String.format("return window.localStorage.getItem('spxSessionId');"));
    }
//    @After
//    public void browserClose(){
//        driver.quit();
//    }



}
