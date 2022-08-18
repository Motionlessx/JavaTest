import org.apache.maven.shared.utils.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SomeClass {
    WebDriver driver = Drivers.getDriver();
    WebDriverWait wait;


    public void checkElements() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://comfy.ua/ua/dnepropetrovsk/smartfon/");
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"brand\"]/div/div/div/div[2]/div/a/span"));
//        elements.get(2).click();
        if (elements.size() == 18) {
            System.out.println("18");
        } else System.out.println("< 18");
    }

    public void checkActions() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("alert('HelloWorld')");

        driver.get("https://www.ebay.com/");

        jse.executeScript("window.scrollBy(0, 1000)", "");
        jse.executeScript("confirm('asdasd');");
//        WebElement link = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(link).build().perform();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
    }

    public void start() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
//        WebDriverWait wait = (new WebDriverWait(driver, Duration.ofSeconds(5)));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(text(), 'Facebook помогает')]")));
        driver.findElement(By.xpath("//a[text()[contains(.,'Создать новый аккаунт')]]")).click();
    }

    public void selectOption(String list, String option) {
//        wait = (new WebDriverWait(driver, Duration.ofSeconds(5)));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(), 'Регистрация')]")));
        String listXpath = String.format("//select[@id='%s']", list);
        String optionXpath = String.format("//option[text()='%s']", option);
        driver.findElement(By.xpath(listXpath)).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(listXpath))));
        driver.findElement(By.xpath(optionXpath)).click();
//        wait.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath(listXpath))));
    }

    public void checkButtons() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
//        driver.get("https://www.md5hashgenerator.com/");
////        driver.findElement(By.xpath("/html/body/button[2]")).click();
//        WebElement button1 = driver.findElement(By.xpath("//*[@id=\"cap\"]/button"));
//        driver.findElement(By.xpath("//*[@id=\"string\"]")).sendKeys("qweqweqwe");
////        WebElement button2 = driver.findElement(By.xpath("//*[@id=\"menuButton\"]"));
//
//        System.out.println(button1.isEnabled());
////        System.out.println(button2.isEnabled());
//        if (button1.isEnabled()) button1.click();

        driver.get("https://ebay.com");
//        WebElement radio1 = driver.findElement(By.xpath("//*[@id=\"output-print_r\"]"));
//        WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"output-Krumo\"]"));
//
//        System.out.println(radio1.isSelected());
//        if (radio1.isSelected()) radio2.click();
//            WebElement link1 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
//            WebElement link2 = driver.findElement(By.xpath("//li//a[contains(text(),'Apple')]"));
//        System.out.println(driver.findElements(By.xpath("//a")).size());
//        System.out.println(link1.isDisplayed());
//        System.out.println(link2.isDisplayed());
//        if (!link2.isDisplayed()) actions.moveToElement(link1).build().perform();
        WebElement search = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        search.sendKeys("zxczxczc");
        search.sendKeys(Keys.ENTER);

        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String fileName = format.format(dateNow) + ".png";

        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\Admin\\Pictures\\Saved Pictures\\" + fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

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