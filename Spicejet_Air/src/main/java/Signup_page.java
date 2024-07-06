package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.SeWrappers;

public class SignUp_Page extends SeWrappers{

    //1. Main page Signup button click for registration
    @FindBy(xpath = "//div[contains(text(),'Signup')]")
    public WebElement signupbutton;

    public void clicksignup() {
        setImplicitWait(10);
        clickElement(signupbutton);
    }

    //////////////////////////////////////////////////////////

    //New window open after click signup button Use WindowHandle
    //2.Click the Title option to select Mr or Mrs
    @FindBy(xpath = "//*[@class='form-control form-select ']")
    public WebElement title;

    public void clicktitle(int num) {
        //waitforelementExplicitwait(title, 20);
        windowhandleParentWindow();
        clickElement(title);
        selectByindexDropDown(title, num);
        actionsDoubleclickElement(title);
    }

    //////////////////////////////////////////////////////////

    //3. Enter First Name
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement Fname;

    public void enterFirstname(String Name) {
        //waitforelementExplicitwait(Fname, 10);
        typeText(Fname, Name);
    }
    //////////////////////////////////////////////////////////

    //4. Enter Last Name
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement Lname;

    public void enterLastname(String LastName) {
        //waitforelementExplicitwait(Lname, 10);
        typeText(Lname, LastName);
    }

    //////////////////////////////////////////////////////////

    //5. Enter DOB calendar

    @FindBy(xpath="//input[@id='dobDate']")
    public WebElement DOB;

    public void enterDOBCalendar(String birthdate) {
        waitforelementExplicitwait(DOB, 10);
        clickElement(DOB);
        typeText(DOB, birthdate);
    }

    //////////////////////////////////////////////////////////

    //6. Enter Mobile Number
    @FindBy(xpath = "(//label[text()='Mobile Number']/following::input)[1]")
    public WebElement mobilenum;

    public void enterMobilenum(String number) {
        waitforelementExplicitwait(mobilenum, 10);
        typeText(mobilenum, number);
    }

    //////////////////////////////////////////////////////////

    //7. Enter emailid
    @FindBy(xpath = "(//label[text()='Email ID']/following::input)[1]")
    public WebElement emailid;

    public void enterEmailId(String email) {
        waitforelementExplicitwait(emailid, 25);
        clickElement(emailid);
        typeText(emailid, email);
    }

    //////////////////////////////////////////////////////////

    //8. Enter Newpassword
    @FindBy(xpath = "//input[@id='new-password']")
    public WebElement newpasswd;

    public void enternewPassword(String Npwd) {
        waitforelementExplicitwait(newpasswd, 10);
        typeText(newpasswd, Npwd);
    }

    //////////////////////////////////////////////////////////

    //9. Enter ConfirmPassword
    @FindBy(xpath = "//input[@id='c-password']")
    public WebElement confirmpasswd;

    public void enterconfirmPassword(String Conpwd) {
        waitforelementExplicitwait(confirmpasswd, 10);
        typeText(confirmpasswd, Conpwd);
    }

    //////////////////////////////////////////////////////////

    //10. Click Terms and conditions
    @FindBy(xpath = "//input[@id='defaultCheck1']")
    public WebElement termsandCoButton;

    public void clicktermsandCo() {
        //waitforelementExplicitwait(termsandCoButton, 10);
        clickElement(termsandCoButton);
    }

    //////////////////////////////////////////////////////////

    //11.Click Submit button for SignUp
    @FindBy(xpath = "//button[normalize-space()='Submit']")
    public WebElement submitButton;

    public void clicksubmitSignup() {
        waitforelementExplicitwait(submitButton, 10);
        clickElement(submitButton);
    }

    //////////////////////////////////////////////////////////
    //12. Verify Account Login successfull
    @FindBy(xpath = "//div[normalize-space()='Hi Muruganandh']")
    public WebElement Myname;

    public void getmyAllDetails(String title) {
        getTextFromElement(Myname);
        getTitle();
        getCurrentUrl();
        isURLReachable(title);
    }
}