import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {
    SomeClass test = new SomeClass();

    @Test
    public void main() {
        test.start();
        test.selectOption("day", "15");
        test.selectOption("month", "сен");
        test.selectOption("year", "1995");
        test.browserClose();

    }
}



//*[@id="brand"]/div/div/div/div[2]/div/a/span[1]

