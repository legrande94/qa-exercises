package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {super(driver);}

    By signUpButton = By.xpath("//a[@href='/login']");

    public HomePage registerUserCheck() {
        driver.findElement(signUpButton).click();
        return this;
    }
}
