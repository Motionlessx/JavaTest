import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebsiteCrudTest {
    WebDriver driver = Drivers.getDriver();
    HitmetrixWebsitesPage websitesCrud = new HitmetrixWebsitesPage(driver);
    InstLogin login = new InstLogin(driver);

    @Before
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://cp-inst334-client.phonexa.xyz/p8/hitmetrix/websites");
    }

    @Test
    public void main() {
        login.fillfields();
        websitesCrud.addNewWebsite();
        String newWebsiteName = websitesCrud.newRandomName;
        String firstWebsiteName = websitesCrud.firstWebsiteName();
        Assert.assertEquals(newWebsiteName, firstWebsiteName);
//        System.out.println(newWebsiteName + " " + firstWebsiteName);
        websitesCrud.editWebsite();
        Assert.assertEquals(newWebsiteName, firstWebsiteName);
        websitesCrud.deleteNewWebsite();
        Assert.assertNotEquals(websitesCrud.newRandomName, websitesCrud.firstWebsiteName());
        String lastestSite = websitesCrud.firstWebsiteName();
//        System.out.println(lastestSite);



    }
    @After
    public void browserClose() {
        driver.quit();
    }
}
