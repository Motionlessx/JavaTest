import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }


    private By firstnameField = By.xpath("//*[@id=\"new_user_first_name\"]");
    private By lastNameField = By.xpath("//*[@id=\"new_user_last_name\"]");
    private By usernameField = By.xpath("//*[@id=\"new_user_username\"]");
    private By emailField = By.xpath("//*[@id=\"new_user_email\"]");
    private By passwordField = By.xpath("//*[@id=\"new_user_password\"]");
    private By signUpButton = By.xpath("//*[@id=\"new_new_user\"]/div[9]/input");
    private By heading = By.xpath("//h1[@class='mb-3 font-weight-normal']");
    private By errorMessage = By.xpath("//div[@class='flash-alert mb-2']/span");
    private By firstNameErrorMessage = By.xpath("//input[@id='new_user_first_name']/following-sibling::p");
    private By lastNameErrorMessage = By.xpath("//input[@id='new_user_last_name']/following-sibling::p");


    public RegisterPage typeFirstName(String firstName) {
        driver.findElement(firstnameField).sendKeys(firstName);
        return this;
    }

    public RegisterPage typeLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
        return this;
    }

    public RegisterPage typeUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
        return this;
    }

    public RegisterPage typeEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public RegisterPage typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public RegisterPage clickRegister() {
        driver.findElement(signUpButton).click();
        return this;
    }


    public RegisterPage registerWithInvalidCreds(String firstName, String lastName, String username, String email, String password) {
        driver.manage().window().maximize();
        this.typeFirstName(firstName);
        this.typeLastName(lastName);
        this.typeUsername(username);
        this.typeEmail(email);
        this.typePassword(password);
        this.clickRegister();
        return new RegisterPage(driver);
    }

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

    public String getErrorMessageText() {
        return driver.findElement(errorMessage).getText();
    }

    public String getFirstNameErrorMessageText() {
        return driver.findElement(firstNameErrorMessage).getText();
    }

    public String getLastNameErrorMessage() {
        return driver.findElement(lastNameErrorMessage).getText();
    }
}
