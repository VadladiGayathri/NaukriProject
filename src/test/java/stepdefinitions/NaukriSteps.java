package stepdefinitions;

import base.BaseTest;
import io.cucumber.java.en.*;
import pages.LoginPageTest;
import pages.ProfilePage;

public class NaukriSteps extends BaseTest {

    LoginPageTest login;
    ProfilePage profile;

    @Given("User launches naukri website")
    public void user_launches_naukri_website() {

        setup();
        login = new LoginPageTest(driver);
        profile= new ProfilePage(driver);

    }
    @When("User enters login credentials")
    public void user_enters_login_credentials() {
       login.clickLoginLink();
       login.enterEmail("gayathrivadladi22@gmail.com");
       login.enterPassword("Vadladi@2022");

    }
    @And("User click login button")
    public void user_click_login_button() {
        login.clickLoginButton();
    }
    @Then("User navigates to profile page")
    public void user_navigates_to_profile_page() {
        profile.openProfile();
        tearDown();
    }

}
