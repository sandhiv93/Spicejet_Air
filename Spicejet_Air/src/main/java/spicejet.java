package com.spicejet.pages;

import com.spicejet.utils.SeWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends SeWrappers {

    //1. Main page Login button click
    @FindBy(xpath = "//div[contains(text(),'Login')]")
    public WebElement loginbutton;

    public void clickloginMainpage() {
        setImplicitWait(15);
        clickElement(loginbutton);
    }

    //////////////////////////////////////////////////////////

    //2. Click email Radio button click
    @FindBy(xpath = "(//*[name()='circle'])[13]")
    public WebElement radioemailid;

    public void clickEmailRadioButton() {
        //waitforelementExplicitwait(radioemailid, 10);
        windowhandleParentWindow();
        clickElement(radioemailid);
    }

    //////////////////////////////////////////////////////////

    //3. Enter emailid for login
    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement emailid;

    public void enteremailid(String myemail) {
        clickElement(emailid);
        waitforelementExplicitwait(emailid, 20);
        clicksleepElement(mypasswd);
        typeText(emailid, myemail);
    }

    //////////////////////////////////////////////////////////

    //4.Enter password for login
    @FindBy(xpath = "//input[@data-testid='password-input-box-cta']")
    public WebElement mypasswd;

    public void enterpassword(String mypwd) {
        clickElement(mypasswd);
        waitforelementExplicitwait(mypasswd, 20);
        clicksleepElement(mypasswd);
        typeText(mypasswd, mypwd);
    }

    //////////////////////////////////////////////////////////

    //5. Enter login for My account
    @FindBy(xpath = "//div[@data-testid='login-cta']")
    public WebElement loginbutton2;

    public void clickLoginMyacc() {
        waitforelementExplicitwait(loginbutton2, 20);
        clickElement(loginbutton2);
    }

    //////////////////////////////////////////////////////////


}
