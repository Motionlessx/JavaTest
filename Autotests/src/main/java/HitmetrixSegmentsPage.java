import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private By lastSegmentName = By.xpath("//table[@data-tablesearch-id='0']/tbody/tr[last()]/td[1]");
    private By confirmTextArea = By.xpath("//form[@id='segment-delete-form']//label[text()[contains(.,'Enter')]]");
    private By enterTextInput = By.xpath("//input[@id='segmentform-confirmmsg']");
    private By modalDeleteButton = By.xpath("//form[@id='segment-delete-form']//button[text()='Delete']");
//    WebElement tableElement = driver.findElement(By.xpath("//table[@data-tablesearch-id='0']"));
//
//
//    public List<WebElement> getRowsH() {
//        List<WebElement> rows = tableElement.findElements(By.xpath("//table[@data-tablesearch-id='0']//tbody//tr"));
//        rows.remove(0);
//        return rows;
//    }
//
//    public List<WebElement> getHeadingsH() {
//        WebElement headingsRow = tableElement.findElement(By.xpath("//thead[@class='stickToTop']//tr[1]"));
//        List<WebElement> headingsCols = headingsRow.findElements(By.xpath("//thead[@class='stickToTop']//tr[1]/th/nobr"));
//        return headingsCols;
//    }
//
//    public List<List<WebElement>> getRowsWithColsH() {
//        List<WebElement> rows = getRowsH();
//        List<List<WebElement>> rowsWithCols = new ArrayList<List<WebElement>>();
//        for (WebElement row : rows) {
//            List<WebElement> rowWithCols = row.findElements(By.xpath("//table[@data-tablesearch-id='0']//tr/td"));
//            rowsWithCols.add(rowWithCols);
//        }
//        return rowsWithCols;
//    }
//
//    public List<Map<String, WebElement>> getRowsWithColsByHeadingsH() {
//        List<List<WebElement>> rowsWithCols = getRowsWithColsH();
//        List<Map<String, WebElement>> rowsWithColsByHeadings = new ArrayList<Map<String, WebElement>>();
//        Map<String, WebElement> rowByHeadings;
//        List<WebElement> headingCols = getHeadingsH();
//        for (List<WebElement> row : rowsWithCols) {
//            rowByHeadings = new HashMap<String, WebElement>();
//            for (int i = 0; i < headingCols.size(); i++) {
//                String heading = headingCols.get(i).getText();
//                WebElement cell = row.get(i);
//                rowByHeadings.put(heading, cell);
//            }
//            rowsWithColsByHeadings.add(rowByHeadings);
//        }
//        return rowsWithColsByHeadings;
//    }
//
//    public String getValueFromCellH(int rowNumber, int colNumber) {
//        List<List<WebElement>> rowsWithCols = getRowsWithColsH();
//        WebElement cell = rowsWithCols.get(rowNumber - 1).get(colNumber - 1);
//        return cell.getText();
//    }
//
//
//    public String getValueFromCellH(int rowNumber, String colName) {
//        List<Map<String, WebElement>> rowsWithColsByHeadings = getRowsWithColsByHeadingsH();
//        return rowsWithColsByHeadings.get(rowNumber - 1).get(colName).getText();
//    }



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


