package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.SeWrappers;

public class extraTaskPage extends SeWrappers{


    @FindBy(xpath="//*[@data-testid='check-in-horizontal-nav-tabs']")
    public WebElement checkIn;
    public void clickcheckInn() {
        clickElement(checkIn);

    }

    ////////////////////////////////

    @FindBy(xpath="//*[@data-testid='flight status-horizontal-nav-tabs']")
    public WebElement flightStatus;
    public void clickflightstatus(){
        clickElement(flightStatus);
    }

    ////////////////////////////////

    @FindBy(xpath="//*[@data-testid='manage booking-horizontal-nav-tabs']")
    WebElement manageBooking;
    public void clickmanageBook() {
        clickElement(manageBooking);
    }
}