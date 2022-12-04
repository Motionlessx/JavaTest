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
    String text = "Visit ID";
    private By lastSessionId = By.xpath("//div[@id='modalPopup']//td[text()[contains(.,'"+ text +"')]]//..//td[2]");
    private By visitIdField = By.xpath("//input[@id='searchform-sessionId']");
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
    private void searchSession(String sessionId) {
        driver.findElement(visitIdField).sendKeys(sessionId);
    }

    public void checkLastSession(String sessionId){
        chooseWebsite();
        searchSession(sessionId);
        clickSearch();
        openSessionDetails();
    }
    public String getLastSessionId(){
        return  driver.findElement(lastSessionId).getText();
    }


}
