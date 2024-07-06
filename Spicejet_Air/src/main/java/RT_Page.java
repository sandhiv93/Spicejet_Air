package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.SeWrappers;

public class RT_Page extends SeWrappers{

    //1. In Main page click RoundTrip option
    @FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[2]")
    public WebElement roundtripradio;

    public void clickRoundTripbutton() {
        setImplicitWait(15);
        clickElement(roundtripradio);
    }

    //////////////////////////////////////////////////////////

    //2. In Main page click FROM place
    @FindBy(xpath = "//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")
    public WebElement from;

    public void enterFromPlace(String place1) {
        waitforelementExplicitwait(from, 15);
        clickElement(from);
        typeText(from, place1);
    }

    //////////////////////////////////////////////////////////

    //3. In Main page click TO place
    @FindBy(xpath = "//div[@data-testid='to-testID-destination']//input[@type='text']")
    public WebElement to;

    public void enterToPlace(String place2) {
        waitforelementExplicitwait(to, 20);
        clickElement(to);
        typeText(to, place2);
    }

    //////////////////////////////////////////////////////////

    //4. In Main page pick depature date
    @FindBy(xpath = "//div[text()='Departure Date']")
    public WebElement departureDate;
    public void selectDepaDate() throws InterruptedException {
        actionsDoubleclickElement(departureDate);
    }

    @FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'])[63]")
    //Feb02
    public WebElement reqdate;
    public void selectReqDate() throws InterruptedException {
        clickElement(reqdate);
    }


    // In main page pick Return date
    @FindBy(xpath = "//div[text()='Return Date']")
    public WebElement returnDate;
    public void selectReturnDate() {
        waitforelementFluentwait(returnDate, 10, 20);
        actionsDoubleclickElement(returnDate);
    }

    @FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41'])[70]")
    //Feb10
    public WebElement retreqdate;
    public void selectReturnreqDate() {
        clickElement(retreqdate);
    }

    //////////////////////////////////////////////////////////

    //5. In Main page clicksearchFlight
    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")
    public WebElement searchFlights;

    public void clicksearchFlight() throws InterruptedException {
        //waitforelementExplicitwait(searchFlights, 05);
        clickElement(searchFlights);
    }

    //////////////////////////////////////////////////////////

    //6. Next page click continue button
    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[5]/div/div/div[3]/div[2]")
    public WebElement nxtpgcontinueButton;

    public void clickcontinueButton() throws InterruptedException {
        waitforelementExplicitwait(nxtpgcontinueButton, 10);
        clickElement(nxtpgcontinueButton);
    }

    //////////////////////////////////////////////////////////

    //7. Next page Enter personal details
    @FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")
    public WebElement title;
    public void clicktitle(String value) {
        clickElement(title);
        selectByValueDropDown(title, value);
    }

    @FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[3]/div[2]/div/div/div[2]/input")
    public WebElement Fnameclear;
    public void clearFirstname() {
        actionsDoubleclickElement(Fnameclear);
        selectText(Fnameclear);
        waitforelementFluentwait(Fnameclear, 10, 20);
        deleteText(Fnameclear);
    }
    @FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[3]/div[2]/div/div/div[2]/input")
    public WebElement Fname;
    public void enterFname(String fname) throws InterruptedException {
        clickElement(Fname);
        waitforelementExplicitwait(Fname, 20);
        typeText(Fname, fname);
    }

    @FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[3]/div[3]/div/div/div[2]/input")
    public WebElement Lnameclear;
    public void clearLastname() {
        actionsDoubleclickElement(Lnameclear);
        selectText(Lnameclear);
        waitforelementFluentwait(Fnameclear, 10, 20);
        deleteText(Lnameclear);
    }

    @FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[3]/div[3]/div/div/div[2]/input")
    public WebElement Lname;
    public void enterLname(String lname) throws InterruptedException {
        clickElement(Lname);
        waitforelementExplicitwait(Lname, 20);
        typeText(Lname, lname);
    }

    @FindBy(xpath = "//*[@data-testid='contact-number-input-box']")
    public WebElement contactboxclear;
    public void clearcontactBox() {
        actionsDoubleclickElement(contactboxclear);
        selectText(contactboxclear);
        waitforelementFluentwait(contactboxclear, 10, 20);
        deleteText(contactboxclear);
    }
    @FindBy(xpath = "//*[@data-testid='contact-number-input-box']")
    public WebElement contactbox;
    public void entercontactNumber(String number) throws InterruptedException {
        clickElement(contactbox);
        waitforelementExplicitwait(contactbox, 20);
        typeText(contactbox, number);
    }

    @FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[4]/div[1]/div/div/div[2]/input")
    public WebElement mailidclear;
    public void clearmailid() {
        actionsDoubleclickElement(mailidclear);
        selectText(mailidclear);
        waitforelementFluentwait(mailidclear, 10, 20);
        deleteText(mailidclear);
    }
    @FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[4]/div[1]/div/div/div[2]/input")
    public WebElement mailid;
    public void enteremailid(String email) throws InterruptedException {
        clickElement(mailid);
        waitforelementExplicitwait(mailid, 20);
        typeText(mailid , email);
    }

    @FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[4]/div[3]/div/div/div[2]/input")
    public WebElement townname;
    public void entertownName(String city) throws InterruptedException {
        clickElement(townname);
        Thread.sleep(3000);
        typeText(townname, city);
    }

    @FindBy(xpath = "//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']//div[@class='css-1dbjc4n r-zso239']")
    public WebElement checkBox;
    public void clickcheckBox() {
        clickElement(checkBox);
    }
    //////////////////////////////////////////////////////////

    //8.Click continue button in Main page
    @FindBy(xpath = "//*[@id=\"travellers-view\"]/div[2]/div/div/div[2]")
    public WebElement mainContinuebutton;

    public void clickContinue() throws InterruptedException {
        setImplicitWait(15);
        clickElement(mainContinuebutton);
        Thread.sleep(3000);
    }

    //////////////////////////////////////////////////////////

    //9.Click again continue button in next Main page
    @FindBy(xpath = "//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]")
    public WebElement main2Continuebutton;

    public void clickContinue2() throws InterruptedException {

        clickElement(main2Continuebutton);
    }

    //////////////////////////////////////////////////////////

    //10.Skip the seat selecting from popupwindow
    @FindBy(xpath = "//span[text()='Skip this to skip comfort.']")
    public WebElement skipskip;

    public void clickSkipSkip()throws InterruptedException  {
        Thread.sleep(5000);
        clickElement(skipskip);
    }
}
