import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Runner {
//    SomeClass test = new SomeClass();
    WebDriver driver = Drivers.getDriver();
    HitmetrixGoalsPage goalPageTest = new HitmetrixGoalsPage(driver);
    InstLogin login = new InstLogin(driver);



    @Test
    public void main() {
//        test.start();
//        test.selectOption("day", "5");
//        test.selectOption("month", "сен");
//        test.selectOption("year", "1995");
//       // test.browserClose();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://cp-inst334-client.phonexa.xyz/p8/hitmetrix/goals");
        login.fillfields();
        goalPageTest.createNewGoal("10");
        Assert.assertEquals(goalPageTest.newRandomName, goalPageTest.getTextFromLastGoalName());
        System.out.println(goalPageTest.newRandomName);
        System.out.println(goalPageTest.getTextFromLastGoalName());
//        System.out.println(table.getValueFromCellH(4, "Goal name "));


    }
}



//*[@id="brand"]/div/div/div/div[2]/div/a/span[1]

