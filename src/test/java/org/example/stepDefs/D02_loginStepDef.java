package org.example.stepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;

  import org.example.pages.P02_login;


import static org.example.stepDefs.Hooks.driver;


public class D02_loginStepDef {

    HomePage hom_login = new HomePage(driver);
    P02_login userlogin = new P02_login(driver);




    @Given("user goes to the login page")


    public void user_in_login_page() {
        hom_login.open_login();
    }

    @When("user logs in with \"valid\" username \"test@example.com\" and password \"P@ssw0rd\"")

    public void user_enter_pass_email() {
        userlogin.email_login("test@example.com");
        userlogin.password_login("P@ssw0rd");
    }

    @And("user presses the login button")

    public void user_click_login() {
        userlogin.login_button_press();
    }


    @Then("user should be logged in to the system successfully")
    public void assert_correct_login() {
        userlogin.assert_true_login("https://demo.nopcommerce.com/", "My account");
    }

    ///// feature fail login
    @Given("user go to login page")
    public void user_in_login_page_for_fail() {
        hom_login.open_login();
    }

    @When("user login with \"invalid\" \"wrong@example.com\" and \"P@ssw0rd\"")
    public void user_enter_pass_email_for_fail() {
        userlogin.email_login("wrong@example.com");
        userlogin.password_login("P@ssw0rd");
    }

    @And("user press on login button")
    public void user_press_loginbtn() {
        userlogin.login_button_press();
    }
   @Then("user could not login to the system")
    public void assert_failLogIn(){
        userlogin.assert_fail_meesage("Login was unsuccessful.","rgba(228, 67, 75, 1)");
   }

}





