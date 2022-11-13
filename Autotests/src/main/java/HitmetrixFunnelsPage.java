import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Timestamp;

public class HitmetrixFunnelsPage {
    private WebDriver driver;
    public HitmetrixFunnelsPage(WebDriver driver) {
        this.driver = driver;
    }
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    String newRandomName = "" + timestamp.getTime();

    private By addGoalButton = By.xpath("//button//span[text()[contains(.,'Add Funnel')]]");
    private By goalNameInput = By.xpath("//input[@id='funnelform-name']");
    private By pageSelector = By.xpath("//*[@id='pageform_0_page_chosen']");
    private By pageOption = By.xpath("//*[@id='pageform_0_page_chosen']//li[text()[contains(.,'/metronic7.1.1/demo1/dist/index.html')]]");
    private By pageNameInput = By.xpath("//input[@id='pageform-0-alias']");
    private By saveButton = By.xpath("//button[text()='Save']");
    private By refreshButton = By.xpath("//button[text()[contains(.,'Refresh')]]");
    private By lastFunnelName = By.xpath("//table[@class='table table-condensed table-hover table-striped  tableSearch-applied tableExport-applied']/tbody/tr[last()]/td[1]");
    private By lastFunnelEditButton = By.xpath("//table/tbody/tr[last()]/td/button[text()[contains(.,'Edit')]]");
    private By lastFunnelDeleteButton = By.xpath("//table/tbody/tr[last()]/td[last()]/button[text()[contains(.,'Delete')]]");
    private By lastFunnelPageName = By.xpath("//table/tbody/tr[last()]/td[3]/div/nobr/span");
    private By enterTextInput = By.xpath("//*[@id='funnelform-confirmmsg']");
    private By confirmTextArea = By.xpath("//*[@id='funnel-form']//label[text()[contains(.,'Enter')]]");
    private By modalDeleteButton = By.xpath("//form[@id='funnel-form']//button[text()='Delete']");



    private void clickAddFunnelButton() {
        driver.findElement(addGoalButton).click();
    }
    private void clickEditButton(){
        driver.findElement(lastFunnelEditButton).click();
    }
    private void clickDeleteButton() {
        driver.findElement(lastFunnelDeleteButton).click();
    }
    private void writeGoalName(){
        driver.findElement(goalNameInput).sendKeys(newRandomName);
    }
    private void selectPage(){
        driver.findElement(pageSelector).click();
        driver.findElement(pageOption).click();
    }
    private void clickSaveButton(){
        driver.findElement(saveButton).click();
    }
    private void clickRefreshButton() {
        driver.findElement(refreshButton).click();
    }

    private void editPageName(){
        driver.findElement(pageNameInput).clear();
        driver.findElement(pageNameInput).sendKeys("edited page name");
    }
    public String getTextFromLastFunnelName() {
        String textFromName = driver.findElement(lastFunnelName).getText();
        return textFromName;
    }
    public String getTextFromLastFunnelPageName() {
        String textFromPageName = driver.findElement(lastFunnelPageName).getText();
        return textFromPageName;
    }
    private String getTextForDelete() {
        String confirmText = driver.findElement(confirmTextArea).getText().substring(7,15);
        return confirmText;
    }
    private int getTextForDelete2() {
        int intForDelete = Integer.parseInt(getTextForDelete().replaceAll("[^0-9]", ""));
        return intForDelete;
    }
    private void pasteTextForDelete() {
        driver.findElement(enterTextInput).sendKeys("#"+getTextForDelete2());
    }
    public void clickDeleteConfirmButton() {
        driver.findElement(modalDeleteButton).click();

    }

    public void addNewFunnel(){
        clickAddFunnelButton();
        writeGoalName();
        selectPage();
        clickSaveButton();
        clickRefreshButton();
    }
    public void editLastFunnel(){
        clickEditButton();
        editPageName();
        clickSaveButton();
        clickRefreshButton();
    }
    public void deleteLastFunnel(){
        clickDeleteButton();
        pasteTextForDelete();
        clickDeleteConfirmButton();
        clickRefreshButton();
    }


}
