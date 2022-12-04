import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Runner {
    WebDriver driver = Drivers.getDriver();
//       SomeClass test = new SomeClass();

       InstLogin login = new InstLogin(driver);



//    HitmetrixWebsitesPage goalPageTest = new HitmetrixWebsitesPage(driver);


    @Before
    public void setUp() {

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://cp-inst334-client.phonexa.xyz/p8/hitmetrix/websites");
    }


        @Test
    public void main() {
//        test.start();
//        test.selectOption("day", "5");
//        test.selectOption("month", "сен");
//        test.selectOption("year", "1995");
//        test.browserClose();
//        test.goToRecord("BQprP0n6m3");
        login.fillfields();
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[last()]/button[text()[contains(.,'Get Code')]]")).click();
        String jsText = driver.findElement(By.xpath("//textarea[@id='jsFormCode']")).getText();
            jsText = jsText.replaceAll("\\<.*?>", "");
            System.out.println(jsText);

        }
}


//*[@id="brand"]/div/div/div/div[2]/div/a/span[1]

