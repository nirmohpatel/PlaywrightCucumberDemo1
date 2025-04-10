package pages;

import base.BasePage;
import utils.PlaywrightDriver;

import java.util.List;

public class LoginPage extends BasePage {

    public boolean validateThePageTitle(){
        return isElementPresent("homePageTitle");
    }

    public void enterUserName(){
        type("username", "standard_user" );
    }
    public void enterPassword(){
        type("password", "secret_sauce" );
    }
    public void clickOnLoginBtn(){
    click("loginBtn");
    }
}
