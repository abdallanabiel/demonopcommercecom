package org.example.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.example.stepDefs.Hooks.driver;
public class P02_login extends PageBase {
   public P02_login(WebDriver driver_for_constructor) {
       super(driver_for_constructor);
   }

    @FindBy(id = "Email")
    WebElement email_forlogin;
    @FindBy(id = "Password")
    WebElement password_forlogin;
    @FindBy(className = "login-button")
    WebElement login_btn;
    @FindBy(className = "ico-account")
    WebElement myaccount_tab;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")
    WebElement wrongLogin;

    public void email_login(String user_email) {
        send_text(email_forlogin, user_email);
    }

    public void password_login(String user_password) {
        send_text(password_forlogin, user_password);
    }
    public void login_button_press(){
        click_btn(login_btn);
    }

    public void assert_true_login(String expected_url , String expected_tab_after_login) {
        assert_succes_login(myaccount_tab,expected_tab_after_login,driver.getCurrentUrl(),expected_url);

    }
    public void assert_fail_meesage(String expected_text_for_fail , String expected_colour_for_fail){
        assert_for_any_text_and_colour(wrongLogin,expected_text_for_fail,expected_colour_for_fail);
    }


}