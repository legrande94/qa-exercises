package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;
import java.util.Map;

import static common.Config.IMPLICIT_WAIT;

public class CommonAction {
    private static WebDriver driver = null;

    private CommonAction() {
    }

    public static WebDriver createDriver() throws MalformedURLException {
        if (driver == null) {
            try {
                ChromeOptions options = new ChromeOptions();

                options.setCapability("browserName", "chrome");
                options.setCapability("selenoid:options", Map.of(
                        "enableVNC", true,
                        "enableVideo", false
                ));

                options.addArguments(
                        "--no-sandbox",
                        "--disable-dev-shm-usage"
                );

                driver = new RemoteWebDriver(
                        URI.create("http://selenoid:4444/wd/hub").toURL(),
                        options
                );

                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));

            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to create driver", e);
            }
        }
        return driver;
    }
}
