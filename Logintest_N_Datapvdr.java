package com.spicejet.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.spicejet.utils.Reports;
import com.spicejet.utils.SJWrappers;
import com.spicejet.utils.SeWrappers;

public class LoginTest_N_DataPVDR extends SeWrappers{

    SeWrappers se=new SeWrappers();
    SJWrappers sj = new SJWrappers();
    Reports repo = new Reports();

    @DataProvider(name="XLData")
    public Object[][] readExcel() throws IOException {
        Object[][] data = null;
        XSSFWorkbook workbook = null;

        DataFormatter dataFormatter = new DataFormatter();

        try{
            workbook= new XSSFWorkbook(new FileInputStream("D:\\EclipseIDE\\pj1_framework\\FileLogin.xlsx"));
            XSSFSheet sheet= workbook.getSheet("LoginInValid");
            XSSFRow row= sheet.getRow(0);

            int noOfRows=sheet.getPhysicalNumberOfRows();

            int noOfCells= row.getPhysicalNumberOfCells();

            data= new Object[noOfRows-1][noOfCells];

            for(int i=1; i<noOfRows;i++){
                for(int j=0; j<noOfCells;j++){
                    XSSFCell cell = sheet.getRow(i).getCell(j);
                    String cellValue = dataFormatter.formatCellValue(cell);
                    data[i - 1][j] = cellValue;
                }
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            workbook.close();
        }
        return data;
    }

    //

    @Test(dataProvider="XLData")
    public void loginWithInValidCredentials(String Emailid, String password){
        try{
            Reports.setTCDesc("Negative tc for SpiceJet LoginPage functionality with Invalid credentials");
            //se.launchBrowser();
            sj.loginwrapper(Emailid, password);
            se.screenshot("LoginTest_N_DataPVDR");
            Thread.sleep(2000);
            Assert.assertFalse(false);
        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Fail to Login");
            Reports.reportStep("FAIL", "Problem while Login");
        }
    }

    @AfterMethod
    public void closeBrowser(){
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
