import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Timestamp;

public class HitmetrixWebsitesPage {
    private WebDriver driver;

    public HitmetrixWebsitesPage(WebDriver driver) {
        this.driver = driver;
    }

    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    String newRandomName = "" + timestamp.getTime();

    private By addWebsiteButton = By.xpath("//button//span[text()[contains(.,'Add Website')]]");
    private By websiteNameInput = By.xpath("//input[@id='websiteform-name']");
    private By websiteDomainInput = By.xpath("//input[@id='domainform-0-domain']");
    private By saveButton = By.xpath("//button[text()='Save']");
    private By refreshButton = By.xpath("//button[text()[contains(.,'Refresh')]]");
    private By firstWebsiteName = By.xpath("//table[@class='table table-condensed table-hover table-striped exportAllPages tableSearch-applied tableExport-applied']//tbody//tr[1]/td[1]");
    private By firstWebsiteDeleteButton = By.xpath("//table/tbody/tr[1]/td[last()]/button[text()[contains(.,'Delete')]]");
    private By firstWebsiteEditButton = By.xpath("//table/tbody/tr[1]/td[last()]/button[text()[contains(.,'Edit')]]");
    private By confirmTextArea = By.xpath("//form[@id='delete-form']//label[text()[contains(.,'Enter')]]");
    private By modalDeleteButton = By.xpath("//form[@id='delete-form']//button[text()='Delete']");
    private By enterTextInput = By.xpath("//input[@id='websitedeleteform-confirmmsg']");
    private By addNewDomainButton = By.xpath("//form[@id='website-form']/div[@class='dynamicform_wrapper']/button");
    private By secondDomainInput = By.xpath("//input[@id='domainform-1-domain']");
    private By getCodeButton = By.xpath("//table/tbody/tr[1]/td[last()]/button[text()[contains(.,'Get Code')]]");
    private By jsCode = By.xpath("//textarea[@id='jsFormCode']");
//    String code = driver.findElement(By.xpath("//textarea[@id='jsFormCode']")).getText().replaceAll("\\<.*?>", "");


    public String firstWebsiteName() {
        String websiteName = driver.findElement(firstWebsiteName).getText();
        return websiteName;
    }
    public void clickGetCodeButton() {
        driver.findElement(getCodeButton).click();
        getCodeForTracking();
    }

    //table[@class='table table-condensed table-hover table-striped exportAllPages tableSearch-applied tableExport-applied']//tbody//tr[1]/td[1]
    public String getCodeForTracking(){
        return driver.findElement(By.xpath("//textarea[@id='jsFormCode']")).getText().replaceAll("\\<.*?>", "");
    }
//    public String code() {
//        String jsText = driver.findElement(By.xpath("//textarea[@id='jsFormCode']")).getText();
//        jsText = codeForTracking().replaceAll("\\<.*?>", "");
//        return jsText;
//    }

    private String getTextForDelete() {
        String confirmText = driver.findElement(confirmTextArea).getText().substring(7, 11);
        return confirmText;
    }

    private void pasteTextForDelete() {
        driver.findElement(enterTextInput).sendKeys(getTextForDelete());

    }

    private void clickAddButton() {
        driver.findElement(addWebsiteButton).click();
    }

    private void typeWebsiteName() {
        driver.findElement(websiteNameInput).sendKeys(newRandomName);
    }

    private void typeWebsiteDomain() {
        driver.findElement(websiteDomainInput).sendKeys(newRandomName + ".com");
    }

    private void clickSaveAndRefresh() {
        driver.findElement(saveButton).click();
        driver.findElement(refreshButton).click();
    }

    private void clickFirstWebsiteEditButton() {
        driver.findElement(firstWebsiteEditButton).click();
    }

    private void addNewDomainToWebsite() {
        driver.findElement(addNewDomainButton).click();
        driver.findElement(secondDomainInput).sendKeys(newRandomName + "1.com");
    }


    private void clickFirstWebsiteDeleteButton() {
        driver.findElement(firstWebsiteDeleteButton).click();
    }

    private void clickDeleteAndRefresh() {
        driver.findElement(modalDeleteButton).click();
        driver.findElement(refreshButton).click();
    }

    public void addNewWebsite() {
        clickAddButton();
        typeWebsiteName();
        typeWebsiteDomain();
        clickSaveAndRefresh();
    }

    public void editWebsite() {
        clickFirstWebsiteEditButton();
        addNewDomainToWebsite();
        clickSaveAndRefresh();
    }

    public void deleteNewWebsite() {
        clickFirstWebsiteDeleteButton();
        pasteTextForDelete();
        clickDeleteAndRefresh();
    }


}
