import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Runner {
       SomeClass test = new SomeClass();
       InstLogin login = new InstLogin(test.driver);

//    @Test
    public void main() {
//        test.start();
//        test.selectOption("day", "5");
//        test.selectOption("month", "сен");
//        test.selectOption("year", "1995");
//        test.browserClose();
        test.goToRecord("BQprP0n6m3");
        login.fillfields();

    }
}


//*[@id="brand"]/div/div/div/div[2]/div/a/span[1]

