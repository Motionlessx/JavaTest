import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }



    private By firstName = By.xpath("//*[@id=\"new_user_first_name\"]");
    private By lastName = By.xpath("//*[@id=\"new_user_last_name\"]");
    private By username = By.xpath("//*[@id=\"new_user_username\"]");
    private By email = By.xpath("//*[@id=\"new_user_email\"]");
    private By password = By.xpath("//*[@id=\"new_user_password\"]");
    private By signUpButton = By.xpath("//*[@id=\"new_new_user\"]/div[9]/input");



    public RegisterPage typeFirstName(String firstName) {
        driver.findElement(this.firstName).sendKeys(firstName);
        return this;
    }
    public RegisterPage typeLastName(String lastName) {
        driver.findElement(this.lastName).sendKeys(lastName);
        return this;
    }
    public RegisterPage typeUsername(String username) {
        driver.findElement(this.username).sendKeys(username);
        return this;
    }
    public RegisterPage typeEmail(String email) {
        driver.findElement(this.email).sendKeys(email);
        return this;
    }
    public RegisterPage typePassword(String password) {
        driver.findElement(this.password).sendKeys(password);
        return this;
    }
    public RegisterPage clickRegister() {
        driver.findElement(signUpButton).click();
        return this;
    }

    public RegisterPage register(String firstName, String lastName, String username, String email, String password) {
        driver.manage().window().maximize();
        this.typeFirstName(firstName);
        this.typeLastName(lastName);
        this.typeUsername(username);
        this.typeEmail(email);
        this.typePassword(password);
        this.clickRegister();
        return new RegisterPage(driver);
    }
}
