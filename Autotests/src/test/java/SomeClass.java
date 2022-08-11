import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SomeClass {
    WebDriver driver = Drivers.getDriver();

    public void checkElements() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://comfy.ua/ua/dnepropetrovsk/smartfon/");
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"brand\"]/div/div/div/div[2]/div/a/span"));
//        elements.get(2).click();
        if (elements.size() == 18) {
            System.out.println("18");
        }
        else System.out.println("< 18");

    }

    public void start() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[text()[contains(.,'Создать новый аккаунт')]]")).click();
    }

    public void selectOption(String list, String option) {
        String listXpath = String.format("//select[@id='%s']", list);
        String optionXpath = String.format("//option[text()='%s']", option);
        driver.findElement(By.xpath(listXpath)).click();
        driver.findElement(By.xpath(optionXpath)).click();
    }

    public void selectTable() {
       WebElement tableElement = driver.findElement(By.xpath("//table[@id='customers']"));
    }

    @After
    public void browserClose() {
        driver.quit();
    }
}


//select[@title='День']
//        driver.findElement(By.xpath("//*[@id=\"lang-chooser\"]//div//span[text()[contains(.,'English (United Kingdom)')]]")).click();
//        driver.findElement(By.xpath("//*[@id=\"day\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"day\"]/option[10]")).click();
//        driver.findElement(By.xpath("//*[@id=\"month\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"month\"]/option[6]")).click();
//        driver.findElement(By.xpath("//*[@id=\"year\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"year\"]/option[29]")).click();