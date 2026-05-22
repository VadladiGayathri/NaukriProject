package hooks;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Hooks extends BaseTest {

    @After
    public void takeScreenshot(Scenario scenario) throws IOException {

        System.out.println("HOOK EXECUTED");

        if (scenario.isFailed()) {

            File src = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            File dest = new File(
                    "screenshots/" + scenario.getName() + ".png");

            FileUtils.copyFile(src, dest);

            System.out.println("Screenshot saved");
        }
    }
}