package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy (className = "ico-register")
    WebElement register;
    public void open_registerpaage(){
        click_btn(register);
    }
    @FindBy (partialLinkText = "Log in")
    WebElement log_in;

    public void open_login(){click_btn(log_in);}
    @FindBy (id = "customerCurrency")
    WebElement currncy_list;
    public void click_currncy(){click_btn(currncy_list);}

}

