package stepsDefs;

import com.microsoft.playwright.Playwright;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.PlaywrightDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class loginStepDefs {
    LoginPage loginPage=new LoginPage();
    @Given("user navigates to the swaglabe website.")
    public void user_navigates_to_the_swaglabe_website() {
        PlaywrightDriver.openPage(PlaywrightDriver.config.getProperty("testsUrl"));
    }
    @When("user validate the home title.")
    public void user_validate_the_home_title() {
        assertThat(loginPage.validateThePageTitle(),is(true));
    }
    @Then("user enter username.")
    public void user_enter_username() {
     loginPage.enterUserName();

    }
    @And("user enter password.")
    public void user_enter_password() {
        loginPage.enterPassword();
    }
    @And("user clicks on the signin button.")
    public void user_clicks_on_the_signin_button() {
        loginPage.clickOnLoginBtn();
    }
}
