package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public static WebDriver driver;
    public void setup(){


        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");


    }

    public void tearDown(){
        driver.quit();
    }
}
