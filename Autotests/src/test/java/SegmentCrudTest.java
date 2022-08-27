import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SegmentCrudTest {
    WebDriver driver = Drivers.getDriver();
    HitmetrixSegmentsPage segmentsCrud = new HitmetrixSegmentsPage(driver);
    InstLogin login = new InstLogin(driver);

    @Before
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://cp-inst334-client.phonexa.xyz/p8/hitmetrix/segments");
    }

    @Test
    public void main() {
        login.fillfields();
        segmentsCrud.addNewSegment();
        Assert.assertEquals(segmentsCrud.newRandomName, segmentsCrud.getTextFromLastSegmentName());
        segmentsCrud.editSegment();
        Assert.assertEquals(segmentsCrud.newRandomName + "bb", segmentsCrud.getTextFromLastSegmentName());
        segmentsCrud.deleteSegment();
        Assert.assertNotEquals(segmentsCrud.newRandomName, segmentsCrud.getTextFromLastSegmentName());
    }

    @After
    public void browserClose() {
        driver.quit();
    }

}
