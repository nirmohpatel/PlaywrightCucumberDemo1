package stepsDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.PlaywrightDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoginStepDefs {
    LoginPage loginPage=new LoginPage();
    @Given("the user is on the Swaglabs login page.")
    public void theUserIsOnTheSwaglabsLoginPage() {
     assertThat(loginPage.validateThePageTitle(),is(true));
    }

    @When("the user enter valid username as a {string}.")
    public void theUserEnterValidUsernameAsA(String username) {
        loginPage.enterUserName(username);
    }

    @And("the user enter valid password as a {string}.")
    public void theUserEnterValidPasswordAsA(String password) {
        loginPage.enterPassword(password);
    }

    @And("the user click on login button.")
    public void theUserClickOnLoginButton() {
        loginPage.clickOnLoginBtn();
    }


    @And("the user login with {string}.")
    public void theUserLoginWith(String user) {
        loginPage.userLogin(user);
    }
}
