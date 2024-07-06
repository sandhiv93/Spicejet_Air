package com.spicejet.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.spicejet.utils.Reports;
import com.spicejet.utils.SJWrappers;
import com.spicejet.utils.SJWrappers;
import com.spicejet.utils.SeWrappers;

public class ExtraTaskTest extends SeWrappers{

    SJWrappers sj=new SJWrappers();
    SeWrappers se = new SeWrappers();
    LoginTest_P_DataPVDR lp = new LoginTest_P_DataPVDR();

    @Test(priority=6)
    public void fieldsAvailableCheking(){
        try{
            Reports.setTCDesc("Fields Available of SpiceJet functionality ");
            //launchBrowser();
            sj.extrataskWrapper();
        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Fail to SignUp");
            Reports.reportStep("FAIL", "Problem while FieldsAvailable Cheking");
        }
    }

    @AfterClass
    public void closeBrowser(){
        try{
            driver.close();
            Reports.reportStep("PASS", "Browser closed successfully");
        }
        catch(Exception e){
            System.out.println("Problem in closing the browser");
            Reports.reportStep("FAIL", "Problem in closing the browser");
            e.printStackTrace();
        }
    }
}
