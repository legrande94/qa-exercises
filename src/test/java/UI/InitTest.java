package UI;

import org.testng.annotations.Test;

public class InitTest extends BaseTest {
    @Test
    public void start() {
        basePage.open("https://automationexercise.com/");
        homePage.registerUserCheck();
    }
}
