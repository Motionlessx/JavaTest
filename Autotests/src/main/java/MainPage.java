import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    private By loginButton = By.xpath("//a[text()=' Login ']");
    private By registerButton = By.xpath("//a[text()=' Register ']");


    public RegisterPage clickRegister() {
        driver.findElement(registerButton).click();
        return new RegisterPage(driver);
    }
    public LoginPage clickLogin() {
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }

}
