package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.*;
        import utils.DriverFactory;

public class Hooks {

    @After
    public void takeScreenshot(Scenario scenario) {

        WebDriver driver = DriverFactory.getDriver();

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot,
                    "image/png",
                    "Failure Screenshot");
        }

        driver.quit();
    }
}