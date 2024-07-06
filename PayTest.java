package com.spicejet.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.spicejet.utils.Reports;
import com.spicejet.utils.SJWrappers;
import com.spicejet.utils.SeWrappers;

public class PayTest extends SeWrappers {

    SeWrappers se=new SeWrappers();
    SJWrappers sj = new SJWrappers();
    Reports repo = new Reports();
    LoginTest_P_DataPVDR loginpass = new LoginTest_P_DataPVDR();
    OWTest ow = new OWTest();
    RTTest rt = new RTTest();

    @Test(priority=5)
    public void payTest(){
        try{
            Reports.setTCDesc("Validating PaymentPage of SpiceJet functionality with dummy credentials");
            ow.oneWayTrip();
            //rt.roundTrip();
            sj.paymentwrapper("5421210500936745", "Anandh", "11", "28" ,"382");
            se.screenshot("Payment Done");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Fail to Payment");
            Reports.reportStep("FAIL", "Problem while Payment");
        }
    }

    @AfterMethod
    public void closeBrowser()	{
        try{
            driver.close();
            Reports.reportStep("PASS", "Browser closed successfully");
        }
        catch(Exception ex){
            System.out.println("Problem in closing the browser");
            Reports.reportStep("FAIL", "Problem in closing the browser");
            ex.printStackTrace();
        }
    }
}