package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.P01_register;




import static org.example.stepDefs.Hooks.driver;

public class D01_registerStepDef {

    HomePage hom = new HomePage(driver);
    P01_register regest = new P01_register(driver);

    @Given("the user is on the registration page")
    public void user_in_HomePage(){
        hom.open_registerpaage();
    }
    @When("the user selects their gender")
    public void user_select_gender(){
        regest.gender();

    }
    @And("enters their first name \"automation\" and last name \"tester\"")
    public void user_enter_frist_and_last_name(){
      regest.frist_last("automation","tester");
    }
    @And("enters their birthday")
    public void user_enter_birthday(){
        regest.birthday("1","January","2002");

    }
    @And("enters their email address test@example.com")
    public void user_enter_email(){
        regest.email("test@example.com");
    }

    @And("enters a password and confirms it with")
    public void user_enter_and_confirm_password(){
        regest.password("P@ssw0rd");
    }

    @And("clicks on the register button")
    public void user_click_registerbtn(){
        regest.click_regest();
    }

    @Then("a success message is displayed")
    public void verify_succes_regestire(){
        regest.assert_true("Your registration completed" ,"rgba(76, 177, 124, 1)");

    }
    }
