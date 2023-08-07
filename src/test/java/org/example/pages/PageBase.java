package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class PageBase {
 //   protected WebDriver driver_for_CurrentPage;
    public PageBase( WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    protected static void click_btn(WebElement btn){
        btn.click();
    }
    protected  void send_text(WebElement text , String value  ){text.sendKeys(value);}


    protected void  DayOfBirth(WebElement day , String numberofday) {
        // Create Select objects for each dropdown
        Select daySelect = new Select(day);
        daySelect.selectByVisibleText(numberofday);
        }
    protected void  MonthOfBirth(WebElement month ,  String numberofmonth) {
        // Create Select objects for each dropdown
        Select monthSelect = new Select(month);
        monthSelect.selectByVisibleText(numberofmonth);
    }
    protected void  YearOfBirth(WebElement year ,String numberofyear) {
        // Create Select objects for each dropdown
        Select yearSelect = new Select(year);
        yearSelect.selectByVisibleText(numberofyear);
    }
    /// make object for all assertion methods
    SoftAssert softAssert = new SoftAssert();
    /// for register
    protected void assert_for_any_text_and_colour(WebElement message_for_register,String expected_message,String expected_color)
    {

       String actual_message = message_for_register.getText();
        softAssert.assertTrue(actual_message.contains(expected_message), expected_message);
       String actual_color = message_for_register.getCssValue("color");
        softAssert.assertEquals(actual_color,expected_color);
        softAssert.assertAll();
    }
    protected void assert_succes_login( WebElement tab_after_login ,String expected_message_forlogintab ,String crrunt_url, String expected_url_login) {
        softAssert.assertEquals(crrunt_url, expected_url_login);

        softAssert.assertTrue(tab_after_login.isDisplayed(),expected_message_forlogintab );

    // Assert all conditions
        softAssert.assertAll();
    }

    protected void verifyEuroSymbolDisplayed(List<WebElement>productPrices , String symbol) {
        for (int i = 0; i < productPrices.size(); i++) {
            String priceText = productPrices.get(i).getText();
            Assert.assertTrue(priceText.contains("currncy_sympol"), "currncy sympol is not  displayed  " + (i + 1));

        }
    }

}
