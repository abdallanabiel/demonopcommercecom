package org.example.stepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;

import org.example.pages.P03_currencies;


import static org.example.stepDefs.Hooks.driver;

public class D03_currenciesStepDef {
    HomePage currncylist =  new HomePage(driver);
    P03_currencies currncy = new P03_currencies(driver);
    @Given("user click on dropdown list of currencies")
    public void click_on_droptownlist(){
        currncylist.click_currncy();
    }
   @And("user choose euro")
    public void choose_euro(){
       currncy.change_current_currncy();

    }
    @Then("verify euro symbol")
    public void verify_euro_in_homepage(){
        currncy.verify_symbol("€");
    }


}
