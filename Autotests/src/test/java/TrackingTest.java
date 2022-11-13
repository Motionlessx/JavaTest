import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

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
    public void main() throws InterruptedException {
        login.fillfields();
        websitesCrud.codeForTracking();
        String code = driver.findElement(By.xpath("//textarea[@id='jsFormCode']")).getText();
        code = code.replaceAll("\\<.*?>", "");
//        System.out.println(code);


        Thread.sleep(5000);
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
        jse.executeScript(code);
        Thread.sleep(5000);
        String sessionId = getSessionId();
        System.out.println("website: " + getSessionId());
        driver.switchTo().window(window1);
        driver.get("https://cp-inst334-client.phonexa.xyz/p8/hitmetrix/recordings");
        recordingsPage.checkLastSession();
        System.out.println("modal window: " + recordingsPage.getLastSessionId());
        Assert.assertEquals(sessionId,recordingsPage.getLastSessionId());




    }
    public  String getSessionId() {
        return (String) jse.executeScript(String.format("return window.localStorage.getItem('spxSessionId');"));
    }
    @After
    public void browserClose(){
        driver.quit();
    }


}
