package pages;

import base.BasePage;
import utils.PlaywrightDriver;

import java.util.List;

public class LoginPage extends BasePage {



    public boolean validateThePageTitle(){
        return isElementPresent("homePageTitle");
    }

    public void enterUserName(String username){
        type("username", username );
    }
    public void enterPassword(String password){
        type("password", password );
    }
    public void clickOnLoginBtn(){
    click("loginBtn");
    }

  public void userLogin(String user) {
    switch (user) {
      case "standard_user":
        {
          type("username", "standard_user");
          type("password", "secret_sauce");
          click("loginBtn");
          break;
        }
      case "problem_user":
        {
          type("username", "problem_user");
          type("password", "secret_sauce");
          click("loginBtn");
          break;
        }
    }
  }
}
