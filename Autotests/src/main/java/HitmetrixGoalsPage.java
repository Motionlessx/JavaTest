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
    private By lastGoalDeleteButton = By.xpath("//table/tbody/tr[last()]/td[last()]/button[text()[contains(.,'Delete')]]");
    private By lastGoalEditButton = By.xpath("//table/tbody/tr[last()]/td/button[text()[contains(.,'Edit')]]");
    private By confirmTextArea = By.xpath("//*[@id=\"goal-form\"]//label[text()[contains(.,'Enter')]]");
    private By enterTextInput = By.xpath("//*[@id=\"goalform-confirmmsg\"]");
    private By modalDeleteButton = By.xpath("//form[@id='goal-form']//button[text()='Delete']");
    private By addPageButton = By.xpath("//form[@id='goal-form']//button[@id='page']");
    private By pageDropdown = By.xpath("//*[@id=\"goalform_conditions_page_condition_chosen\"]");
    private By pageEquals = By.xpath("//*[@id=\"goalform_conditions_page_condition_chosen\"]/div/ul/li[2]");
    private By pageUrlInput = By.xpath("//*[@id=\"goal-item-1\"]//input[@id='goalform-conditions-page-pageurl']");

    private void clickAddGoalButton() {
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

    public void clickDeleteButton() {
        driver.findElement(lastGoalDeleteButton).click();
    }
    public void clickEditButton() {
        driver.findElement(lastGoalEditButton).click();
    }
    public void addNewPage() {
        driver.findElement(addPageButton).click();
        driver.findElement(pageDropdown).click();
        driver.findElement(pageEquals).click();
        driver.findElement(pageUrlInput).sendKeys("qwerty");
    }
    public void clickRefreshButton() {
        driver.findElement(refreshButton).click();
    }


    public String getTextFromLastGoalName() {
        String textFromName = driver.findElement(lastGoalName).getText();
        return textFromName;
    }
    private String getTextForDelete() {
      String confirmText = driver.findElement(confirmTextArea).getText().substring(7,11);
        return confirmText;
    }
    public void pasteTextForDelete() {
        driver.findElement(enterTextInput).sendKeys(getTextForDelete());

    }
    public void clickDeleteConfirmButton() {
        driver.findElement(modalDeleteButton).click();
        driver.findElement(refreshButton).click();
    }


    public void createNewGoal(String visitCount) {
        clickAddGoalButton();
        writeGoalName();
        addVisitCount(visitCount);
        clickSaveButton();
        clickRefreshButton();
    }
    public void editGoal() {
        clickEditButton();
        addNewPage();
        clickSaveButton();
        clickRefreshButton();

    }
    public void deleteLastGoal() {
        clickDeleteButton();
        pasteTextForDelete();
        clickDeleteConfirmButton();
    }

}
