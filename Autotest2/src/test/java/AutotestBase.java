import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutotestBase {

    WebDriver driver =  Drivers.getDriver();


@Test
    public void login() {
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://cp-inst334-client.phonexa.xyz");
    driver.findElement(By.xpath("//*[@id=\"loginform-email\"]")).sendKeys("said@doubledmarketing.com");
    driver.findElement(By.xpath("//*[@id=\"loginform-password\"]")).sendKeys("12345Qwerty!");
    driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div[2]/button")).click();
}

@Test
    public void website() {

}



}
