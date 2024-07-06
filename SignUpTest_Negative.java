package com.spicejet.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.spicejet.utils.Reports;
import com.aventstack.extentreports.model.Report;
import com.spicejet.utils.SJWrappers;
import com.spicejet.utils.SeWrappers;
public class SignUpTest_Negative extends SeWrappers{

    SeWrappers se=new SeWrappers();
    SJWrappers sj = new SJWrappers();
    Reports repo = new Reports();

    @Test
    public void signUpWithInValidCredentials(){
        try{
            Reports.setTCDesc("SignUp of SpiceJet functionality with Invalid credentials");
            //launchBrowser();
            sj.signupwrapper(1, "Anandh", "Srinivasan", "02/29/1996", "9876543210", "abc123@gmail.com", "Spicejet", "Spicejet", " ");
            se.screenshot("NegativeTC_InValidName");
            Thread.sleep(2000);
            Assert.assertFalse(false);

        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Fail to SignUp");
            Reports.reportStep("FAIL", "Problem while SignUp");
        }
    }
    @AfterMethod
    public void closeBrowser(){
        try{
            driver.quit();
            Reports.reportStep("PASS", "Browser closed successfully");
        }
        catch(Exception ex){
            System.out.println("Problem in closing the browser");
            Reports.reportStep("FAIL", "Problem in closing the browser");
            ex.printStackTrace();
        }
    }

}
