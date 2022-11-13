import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HitmetrixRecordingsPage {
    private WebDriver driver;

    public HitmetrixRecordingsPage(WebDriver driver) {
        this.driver = driver;
    }
    private By websiteSelector = By.xpath("//div[@id='searchform_siteId_chosen']");
    private By selectWebsite = By.xpath("//div[@id='searchform_siteId_chosen']/div/ul/li[text()='bestfast']");
    private By searchButton = By.xpath("//button[text()='Search']");
    private By lastSessionDetailsButton = By.xpath("//table[@data-tablesearch-id='0']//tbody/tr[1]/td[@column-id='sessionDetails']");
    private By lastSessionId = By.xpath("//div[@id='modalPopup']//table[@class='table no-margin disableTableFieldFilter disableFastSearch disableExport']//tr[2]/td[2]");
    private void chooseWebsite() {
        driver.findElement(websiteSelector).click();
        driver.findElement(selectWebsite).click();
    }
    private void clickSearch() {
        driver.findElement(searchButton).click();
    }
    private void openSessionDetails(){
        driver.findElement(lastSessionDetailsButton).click();
    }

    public void checkLastSession(){
        chooseWebsite();
        clickSearch();
        openSessionDetails();
    }
    public String getLastSessionId(){
        String sessionId = driver.findElement(lastSessionId).getText();
        return sessionId;
    }


}
