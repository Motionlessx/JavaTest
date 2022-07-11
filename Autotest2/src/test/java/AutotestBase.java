import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutotestBase {

    WebDriver driver =  Drivers.getDriver();


@Test
    public void login() throws InterruptedException {
//    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://cp-inst334-client.phonexa.xyz");
    driver.findElement(By.xpath("//*[@id=\"loginform-email\"]")).sendKeys("said@doubledmarketing.com");
    driver.findElement(By.xpath("//*[@id=\"loginform-password\"]")).sendKeys("12345Qwerty!");
    driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div[2]/button")).click();
//    driver.get("https://cp-inst334-client.phonexa.xyz/p8/dashboard");
//
//    //WebElement dynamicElement = login.driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[4]/a"));
//    Thread.sleep(10000);
//    driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[4]/a")).click();
//    driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[4]/ul/li[6]/a/span")).click();
//    driver.findElement(By.xpath("/html/body/div[1]/div[4]/section[2]/div[3]/div/div/div[2]/div/div[1]/div[1]/button/span[2]")).click();
//    driver.findElement(By.xpath("//*[@id=\"goalform-name\"]")).sendKeys("zxczxczxc");
//    driver.findElement(By.xpath("//*[@id=\"goalform-conditions-0-visits-count\"]")).sendKeys("5");
//    driver.findElement(By.xpath("//*[@id=\"goal-form\"]/div[5]/button[1]")).click();
//    driver.findElement(By.xpath("//*[@id=\"modalPopup\"]/div/div/div[2]/div/div[2]/button")).click();
}

@Test
    public void website() {

}



}
