package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class P03_currencies extends PageBase{
    public P03_currencies(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[1]/div/select/option[2]")
    private WebElement euro;
    @FindBy (className = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[1]/span")
    private List<WebElement> itemList;
    public void change_current_currncy(){
        click_btn(euro);
    }
    public void verify_symbol( String currncy_symbol){
        verifyEuroSymbolDisplayed(itemList,currncy_symbol);



    }

}
