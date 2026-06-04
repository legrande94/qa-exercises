package UI;

import Pages.BasePage;
import Pages.HomePage;
import common.CommonAction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);

    @AfterSuite(alwaysRun = true)
    public void quitDriver() {driver.quit();}
}
