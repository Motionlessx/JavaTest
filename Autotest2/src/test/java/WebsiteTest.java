import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class WebsiteTest {
        AutotestBase login = new AutotestBase();
       // WebDriver driver = Drivers.getDriver();


    @Test
    public void testWebsite() throws InterruptedException {
        login.login();
//        login.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        login.driver.get("https://cp-inst334-client.phonexa.xyz/p8/dashboard");

    //WebElement dynamicElement = login.driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[4]/a"));
        Thread.sleep(10000);
        login.driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[4]/a")).click();
        Thread.sleep(2000);
        login.driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[4]/ul/li[6]/a/span")).click();
        Thread.sleep(2000);
        login.driver.findElement(By.xpath("/html/body/div[1]/div[4]/section[2]/div[3]/div/div/div[2]/div/div[1]/div[1]/button/span[2]")).click();
        Thread.sleep(2000);
        login.driver.findElement(By.xpath("//*[@id=\"goalform-name\"]")).sendKeys("zxczxczxc");
        login.driver.findElement(By.xpath("//*[@id=\"goalform-conditions-0-visits-count\"]")).sendKeys("5");
        login.driver.findElement(By.xpath("//*[@id=\"goal-form\"]/div[5]/button[1]")).click();
        Thread.sleep(2000);
        login.driver.findElement(By.xpath("//*[@id=\"modalPopup\"]/div/div/div[2]/div/div[2]/button")).click();
     //  Assert.assertFalse(login.driver.findElement(By.className("ellipsis tooltip-applied")).isDisplayed());
//       Assert.assertEquals(login.driver.findElement());
    }
}
