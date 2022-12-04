import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SegmentCrudTest {
    WebDriver driver = Drivers.getDriver();
//    WebElement tableElement = driver.findElement(By.xpath("//table[@data-tablesearch-id='0']"));
//    WebElement tableElement;

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
        WebElement tableElement = driver.findElement(By.xpath("//table[@data-tablesearch-id='0']"));
        HmTableTest table = new HmTableTest(tableElement, driver);
        System.out.println(table.getValueFromCellH(3, 1) + " <----");
        System.out.println(table.getValueFromCellH(5, 8) + " <----");
        segmentsCrud.addNewSegment();
        Assert.assertEquals(segmentsCrud.newRandomName, segmentsCrud.getTextFromLastSegmentName());
        segmentsCrud.editSegment();
        Assert.assertEquals(segmentsCrud.newRandomName + "bb", segmentsCrud.getTextFromLastSegmentName());
        segmentsCrud.deleteSegment();
        Assert.assertNotEquals(segmentsCrud.newRandomName, segmentsCrud.getTextFromLastSegmentName());
//        table.getValueFromCellH(2, 6);
//        System.out.println(table.getValueFromCellH(3, 1) + "----");
    }

//    @After
//    public void browserClose() {
//        driver.quit();
//    }

}
