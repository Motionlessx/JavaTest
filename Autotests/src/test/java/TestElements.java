import org.junit.Test;

public class TestElements {
//   SomeClass test1 = new SomeClass();
   RegisterPage tests = new RegisterPage(Drivers.getDriver());
//@Test
    public void main() throws InterruptedException {
    //test1.checkActions();

//    test1.checkButtons();
    tests.driver.get("https://gitlab.com/users/sign_up");
    tests.registerWithInvalidCreds("asdf", "dqdwqd", "dqwesad", "qwd@dsd.dsqd", "dqhdwdjqdWHDS");




//        test1.checkElements();
    }
}
