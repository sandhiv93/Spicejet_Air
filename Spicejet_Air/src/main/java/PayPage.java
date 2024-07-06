package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.SeWrappers;

public class PayPage extends SeWrappers{

    //Dummy payment Data's

    //1. Click card and enter number
    @FindBy(xpath="//iframe[@class='card_number_iframe']")
    public WebElement FrameCard;
    @FindBy(xpath="//input[@id='card_number']")
    public WebElement cardno;

    public void clickandEntercardNumframe(String cardnum) {
        waitforelementExplicitwait(FrameCard, 10);
        frameByWebElement(FrameCard);
        waitforelementExplicitwait(cardno, 10);
        typeText(cardno, cardnum);
        switchToDefaultContent();
    }


    /////////////////////////////////////////////////

    //2. Enter card name
    @FindBy(xpath="//*[@class='name_on_card_iframe']")
    public WebElement frameName;
    @FindBy(xpath="//*[@placeholder='Cardholder Name']")
    public WebElement cardname;

    public void clickandEntercardNameframe(String myname) {
        waitforelementExplicitwait(frameName, 10);
        frameByWebElement(frameName);
        waitforelementExplicitwait(cardname, 10);
        typeText(cardname, myname);
        switchToDefaultContent();
    }

    /////////////////////////////////////////////////

    //3. Enter card Month name
    @FindBy(xpath="//*[@class='card_exp_month_iframe']")
    public WebElement frameMonth;
    @FindBy(xpath="//*[@placeholder='MM']")
    public WebElement expmonth;

    public void clickandEntercardMonthframe(String month) {
        waitforelementExplicitwait(frameMonth, 10);
        frameByWebElement(frameMonth);
        waitforelementExplicitwait(expmonth, 10);
        typeText(expmonth, month);
        switchToDefaultContent();
    }

    /////////////////////////////////////////////////

    //4. Enter card Year
    @FindBy(xpath="//*[@class='card_exp_year_iframe']")
    public WebElement frameYear;
    @FindBy(xpath="//*[@placeholder='YY']")
    public WebElement expYear;

    public void clickandEnterYearframe(String year) {
        frameByWebElement(frameYear);
        waitforelementExplicitwait(frameYear, 10);
        typeText(expYear, year);
        switchToDefaultContent();
    }

    /////////////////////////////////////////////////

    //5. Enter card CVV
    @FindBy(xpath="//*[@class='security_code_iframe']")
    public WebElement frameCVV;
    @FindBy(xpath="//*[@placeholder='123']")
    public WebElement cvvNum;

    public void clickandEnterCVVframe(String cvvnum) {
        waitforelementExplicitwait(frameCVV, 10);
        frameByWebElement(frameCVV);
        waitforelementExplicitwait(cvvNum, 10);
        typeText(cvvNum, cvvnum);
        switchToDefaultContent();
    }


    /////////////////////////////////////////////////


    //6. Click paybutton
    @FindBy(xpath="//*[@class='css-1dbjc4n r-2ka9w3 r-zr9zts']//*[contains(text(),'Proceed to pay')]")
    public WebElement clickPayBtn;

    public void clickPaybutton() {
        waitforelementExplicitwait(clickPayBtn, 10);
        clickElement(clickPayBtn);
    }
}
