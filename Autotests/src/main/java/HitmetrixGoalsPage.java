import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Timestamp;

public class HitmetrixGoalsPage {
    private WebDriver driver;

    public HitmetrixGoalsPage(WebDriver driver) {
        this.driver = driver;
    }

    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    String newRandomName = "" + timestamp.getTime();

    private By addGoalButton = By.xpath("//span[text()[contains(.,'Add Goal')]]");
    private By goalNameInput = By.xpath("//input[@id='goalform-name']");
    private By visitCountInput = By.xpath("//input[@id='goalform-conditions-0-visits-count']");
    private By saveButton = By.xpath("//button[text()='Save']");
    private By refreshButton = By.xpath("//button[text()[contains(.,'Refresh')]]");

    private By lastGoalName = By.xpath("/html/body/div[1]/div[4]/section[2]/div[3]/div/div/div[3]/table/tbody/tr[last()]/td[1]/span");

    //tbody/tr[last()]/td/span

//    public String  createNewName() {
//        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//
//        String newRandomName = "" + timestamp.getTime();
//        return newRandomName;
//    }

    public void clickAddGoalButton() {
        driver.findElement(addGoalButton).click();
    }

    public void writeGoalName() {
        driver.findElement(goalNameInput).sendKeys(newRandomName);
    }

    public void addVisitCount(String visitCount) {
        driver.findElement(visitCountInput).sendKeys(visitCount);
    }

    public void clickSaveButton() {
        driver.findElement(saveButton).click();
    }

    public void clickRefreshButton() {
        driver.findElement(refreshButton).click();
    }

    public String getTextFromLastGoalName() {
        String textFromName = driver.findElement(lastGoalName).getText();
        return textFromName;
    }

    public void createNewGoal(String visitCount) {
        clickAddGoalButton();
        writeGoalName();
        addVisitCount(visitCount);
        clickSaveButton();
        clickRefreshButton();
    }

}
