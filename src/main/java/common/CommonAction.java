package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import static common.Config.IMPLICIT_WAIT;

public class CommonAction {
    private static WebDriver driver = null;

    private CommonAction() {
    }

    public static WebDriver createDriver() throws MalformedURLException {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();

            driver = new RemoteWebDriver(URI.create("http://selenoid:4444/wd/hub").toURL(), options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        }
        return driver;
    }
}
