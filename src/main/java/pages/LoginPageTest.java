package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPageTest {

    WebDriver driver;

    public LoginPageTest(WebDriver driver) {

        this.driver = driver;

    }

    By loginLink = By.xpath("//a[contains(@title,'Jobseeker Login')]");
    By email = By.id("usernameField");
    By password = By.id("passwordField");
    By loginButton = By.xpath("///button[@type=\"submit\"]");

    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }

    public void enterEmail(String usernameField){
        driver.findElement(email).sendKeys(usernameField);

    }
    public void enterPassword(String passwordField){
        driver.findElement(password).sendKeys(passwordField);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

}
