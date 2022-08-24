import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By loginField = By.xpath("//*[@id=\"user_login\"]");
    private By passwordField = By.xpath("//*[@id=\"user_password\"]");
    private By signInButton = By.xpath("//button[text()='Sign in']");
    private By heading = By.xpath("//h1[contains(@class, 'mb-3 font-weight-normal')]");
    private By errorMessage = By.xpath("//div[@class='flash-alert mb-2']/span");
    private By createAccButton = By.xpath("//a[text()='Register now']");

    public LoginPage typeUsername(String username) {
        driver.findElement(loginField).sendKeys(username);
        return this;
    }

    public LoginPage typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public LoginPage incorrectLogin(String username, String password) {
        this.typeUsername(username);
        this.typePassword(password);
        driver.findElement(signInButton).click();
        return new LoginPage(driver);

    }

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }

    public String getErrorMessageText() {
        return driver.findElement(errorMessage).getText();
    }

    public RegisterPage createAccount() {
        driver.findElement(createAccButton).click();
        return new RegisterPage(driver);
    }


}
