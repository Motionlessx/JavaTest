import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Timestamp;

public class HitmetrixSegmentsPage {
    private WebDriver driver;


    public HitmetrixSegmentsPage(WebDriver driver) {
        this.driver = driver;
    }


    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    String newRandomName = "" + timestamp.getTime();

    private By addSegmentButton = By.xpath("//button//span[text()[contains(.,'Add Segment')]]");
    private By segmentNameInput = By.xpath("//input[@id='segmentform-name']");
    private By deviceSelect = By.xpath("//div[@id='segmentform_filters_devicetypeid_chosen']");
    private By selectDesktop = By.xpath("//div[@id='segmentform_filters_devicetypeid_chosen']//li[text()='Desktop']");
    private By osSelect = By.xpath("//div[@id='segmentform_filters_os_chosen']");
    private By selectWindows = By.xpath("//div[@id='segmentform_filters_os_chosen']//li[text()='Windows']");
    private By browserSelect = By.xpath("//div[@id='segmentform_filters_browser_chosen']");
    private By selectChrome = By.xpath("//div[@id='segmentform_filters_browser_chosen']//li[text()='Chrome']");
    private By saveButton = By.xpath("//button[text()='Save']");
    private By refreshButton = By.xpath("//button[text()[contains(.,'Refresh')]]");
    private By lastSegmentEditButton = By.xpath("//table/tbody/tr[last()]/td[last()]/button[text()[contains(.,'Edit')]]");
    private By lastSegmentDeleteButton = By.xpath("//table/tbody/tr[last()]/td[last()]/button[text()[contains(.,'Delete')]]");
    private By lastSegmentName = By.xpath("//table[@class='table table-condensed table-hover table-striped exportAllPages tableSearch-applied tableExport-applied']/tbody/tr[last()]/td[1]");
    private By confirmTextArea = By.xpath("//form[@id='segment-delete-form']//label[text()[contains(.,'Enter')]]");
    private By enterTextInput = By.xpath("//input[@id='segmentform-confirmmsg']");
    private By modalDeleteButton = By.xpath("//form[@id='segment-delete-form']//button[text()='Delete']");


//    public void selectDeviceOf() {
//        Select selectDevice = new Select(driver.findElement(By.xpath("//*[@id=\"segmentform-filters-devicetypeid\"]")));
//        selectDevice.selectByVisibleText("Desktop");
//    }





    private void clickAddButton() {
        driver.findElement(addSegmentButton).click();
    }
    private void typeSegmentName() {
        driver.findElement(segmentNameInput).sendKeys(newRandomName);
    }
    private void typeNewSegmentName(){
        driver.findElement(segmentNameInput).clear();
        driver.findElement(segmentNameInput).sendKeys(newRandomName + "bb");
    }
    private void selectDevice() {
        driver.findElement(deviceSelect).click();
        driver.findElement(selectDesktop).click();
    }
    private void selectOs() {
        driver.findElement(osSelect).click();
        driver.findElement(selectWindows).click();
    }
    private void selectBrowser() {
        driver.findElement(browserSelect).click();
        driver.findElement(selectChrome).click();
    }
    private void clickSaveAndRefresh() {
        driver.findElement(saveButton).click();
        driver.findElement(refreshButton).click();
    }

    private void clickEditButton() {
        driver.findElement(lastSegmentEditButton).click();
    }
    private void clickDeleteButton() {
        driver.findElement(lastSegmentDeleteButton).click();
    }
    private String getTextForDelete() {
        String confirmText = driver.findElement(confirmTextArea).getText().substring(7, 10);
        return confirmText;
    }

    private void pasteTextForDelete() {
        driver.findElement(enterTextInput).sendKeys(getTextForDelete());

    }
    private void clickDeleteAndRefresh() {
        driver.findElement(modalDeleteButton).click();
        driver.findElement(refreshButton).click();
    }

    public String getTextFromLastSegmentName() {
        String textFromSegmentName = driver.findElement(lastSegmentName).getText();
        return textFromSegmentName;
    }

    public void addNewSegment() {
        clickAddButton();
        typeSegmentName();
        selectDevice();
        selectOs();
        selectBrowser();
        clickSaveAndRefresh();
    }

    public void editSegment() {
        clickEditButton();

        typeNewSegmentName();
        clickSaveAndRefresh();
    }
    public void deleteSegment(){
        clickDeleteButton();
        pasteTextForDelete();
        clickDeleteAndRefresh();
    }












}


