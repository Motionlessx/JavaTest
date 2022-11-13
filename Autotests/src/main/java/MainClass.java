import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainClass {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Idea\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        RegisterPage registerPage = new RegisterPage(driver);
//        driver.get("https://gitlab.com/users/sign_up/");
//        registerPage.registerWithInvalidCreds("xc", "sda", "dsq", "dsq@ds.dd", "dsqWY245SD");

        driver.get("https://www.w3schools.com/html/html_tables.asp");
        WebElement tableElement = driver.findElement(By.xpath("//table[@id='customers']"));
        TableTest table = new TableTest(tableElement, driver);
        System.out.println("Rows number is: " + table.getRows().size());
        System.out.println(table.getValueFromCell(2, 3));
        System.out.println(table.getValueFromCell(4, 1));
        System.out.println(table.getValueFromCell(4, "Company"));
        System.out.println(table.getValueFromCell(1, "Country"));
        System.out.println(table.getValueFromCell(2, "Contact"));


    }

}


//        Thread.sleep(10000);
//        driver.get("https://cp-inst334-client.phonexa.xyz/p8/dashboard");
//        driver.findElement(By.xpath("//*[@id=\"loginform-email\"]")).sendKeys("said@doubledmarketing.com");
////        WebDriverWait wait = new WebDriverWait(driver,100);
//        driver.findElement(By.xpath("//*[@id=\"loginform-password\"]")).sendKeys("12345Qwerty!");
//        driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div[2]/button")).click();
//        Thread.sleep(10000);
//
//        //WebElement dynamicElement = login.driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[4]/a"));
////        Thread.sleep(5000);
//        driver.findElement(By.xpath("//span[text() = 'Analytics']")).click();
////        Thread.sleep(2000);
//        driver.findElement(By.xpath("//span[text() = 'Goals']")).click();
////        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@data-title = 'Add Goal']")).click();
////        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"goalform-name\"]")).sendKeys("zxczxczxc");
//        driver.findElement(By.xpath("//*[@id=\"goalform-conditions-0-visits-count\"]")).sendKeys("5");
//        driver.findElement(By.xpath("//*[@id=\"goal-form\"]/div[5]/button[1]")).click();
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("//*[@id=\"modalPopup\"]/div/div/div[2]/div/div[2]/button")).click();
//        System.out.println(driver.findElement(By.xpath("//*[@id=\"modalPopup\"]/div/div/div[2]/div/div[2]/button")).isSelected());
//
//        if (!driver.findElement(By.xpath("//*[@id=\"modalPopup\"]/div/div/div[2]/div/div[2]/button")).isSelected()) {
//            System.out.println("not checked");
//        }
//
//        else {
//            System.out.println("checked");
//        }