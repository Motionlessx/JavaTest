import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class GoalsCrudTest {
    WebDriver driver = Drivers.getDriver();
    HitmetrixGoalsPage goalPageTest = new HitmetrixGoalsPage(driver);
    InstLogin login = new InstLogin(driver);

    @Before
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://cp-inst334-client.phonexa.xyz/p8/hitmetrix/goals");
    }


    @Test
    public void main() {
        login.fillfields();
        goalPageTest.createNewGoal("10");
        String newGoalName = goalPageTest.newRandomName;
        String goalName = goalPageTest.getTextFromLastGoalName();
        Assert.assertEquals(newGoalName, goalName);//(goalPageTest.newRandomName, goalName);//goalPageTest.getTextFromLastGoalName());
        System.out.println(newGoalName + " " + goalName);
        goalPageTest.editGoal();
//        Assert.assertEquals();
        goalPageTest.deleteLastGoal();
        Assert.assertNotEquals(goalPageTest.newRandomName, goalPageTest.getTextFromLastGoalName());
        String lastGoalName = (goalPageTest.getTextFromLastGoalName());
        System.out.println(lastGoalName);
    }


    @After
    public void browserClose() {
        driver.quit();
    }


}
