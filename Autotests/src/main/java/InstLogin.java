import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstLogin {
    private WebDriver driver;

    public InstLogin(WebDriver driver) {
        this.driver = driver;
    }

    private By emailField = By.xpath("//*[@id=\"loginform-email\"]");
    private By passwordField = By.xpath("//*[@id=\"loginform-password\"]");
    private By signInButton = By.xpath("//button[text()='Sign In']");
    private String email = "said@doubledmarketing.com";
    private String pass = "12345Qwerty!";

    public void fillfields() {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(pass);
        driver.findElement(signInButton).click();
    }


}
