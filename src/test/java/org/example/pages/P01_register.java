package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P01_register extends PageBase {
    public P01_register(WebDriver driver) {
        super(driver);

    }

    @FindBy(id = "gender-male")
    WebElement genderRdoBtn;

    @FindBy(id = "FirstName")
    WebElement fnTxtBox;

    @FindBy(id = "LastName")
    WebElement lnTxtBox;

    @FindBy(id = "Email")
    WebElement emailTxtBox;

    @FindBy(id = "Password")
    WebElement passwordTxtBox;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordTxtBox;

    @FindBy(id = "register-button")
    WebElement registerBtn;
    @FindBy(className = "result")
    public WebElement message_after_resg;
    @FindBy(name = "DateOfBirthDay")
    private WebElement dateOfBirthDayDropdown;
    @FindBy(name = "DateOfBirthMonth")
    private WebElement DateOfBirthMonthDropdown;
    @FindBy(name = "DateOfBirthYear")
    private WebElement dateOfBirthYearDropdown;


    public void gender() {
        click_btn(genderRdoBtn);
    }

    public void frist_last(String firstName, String lastName) {
        send_text(fnTxtBox, firstName);
        send_text(lnTxtBox, lastName);
    }

    public void email(String email) {
        send_text(emailTxtBox, email);
    }

    public void password(String password) {
        send_text(passwordTxtBox, password);
        send_text(confirmPasswordTxtBox, password);
    }

    public void birthday(String number_day, String name_month, String number_year) {
        DayOfBirth(dateOfBirthDayDropdown, number_day);
        MonthOfBirth(DateOfBirthMonthDropdown, name_month);
        YearOfBirth(dateOfBirthYearDropdown, number_year);
    }

    public void click_regest() {
        click_btn(registerBtn);
    }

    public void assert_true(String expected_text, String expected_colour) {
        assert_for_any_text_and_colour(message_after_resg, expected_text, expected_colour);
    }
}

