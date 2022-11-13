import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FunnelCrudTest {
    WebDriver driver = Drivers.getDriver();
    HitmetrixFunnelsPage funnelsPageTest = new HitmetrixFunnelsPage(driver);
    InstLogin login = new InstLogin(driver);

    @Before
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://cp-inst334-client.phonexa.xyz/p8/hitmetrix/funnel");

    }
    @Test
    public void main() {
        login.fillfields();
        funnelsPageTest.addNewFunnel();
        String newFunnelName = funnelsPageTest.newRandomName;
        String funnelName = funnelsPageTest.getTextFromLastFunnelName();
        Assert.assertEquals(newFunnelName, funnelName);
        System.out.println(newFunnelName + " " + funnelName);
        funnelsPageTest.editLastFunnel();
        String funnelPageName = funnelsPageTest.getTextFromLastFunnelPageName();
        Assert.assertEquals("edited page name", funnelPageName);
        funnelsPageTest.deleteLastFunnel();
        String lastFunnelName = (funnelsPageTest.getTextFromLastFunnelName());
        Assert.assertNotEquals(newFunnelName, lastFunnelName);
        System.out.println(lastFunnelName);


    }
    @After
    public void browserClose() {
        driver.quit();
    }
}
