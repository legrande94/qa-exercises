package UI;

import org.testng.annotations.Test;
import java.net.MalformedURLException;

public class InitTest extends BaseTest {
    public InitTest() throws MalformedURLException {
    }

    @Test
    public void start() {
        basePage.open("https://automationexercise.com/");
        homePage.registerUserCheck();
    }
}
