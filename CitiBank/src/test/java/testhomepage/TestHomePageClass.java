package testhomepage;

import base.CommonAPI;
import homepage.HomePageClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.DataReader;

public class TestHomePageClass extends CommonAPI {

    String cbdataPath = "/Users/MSM/IdeaProjects/WebAutomationGroup3/CitiBank/src/test/resources/cbdata.xls";

    HomePageClass homePageClass;
    String homeUrl = "https://online.citi.com/" ;

    @BeforeClass
    public void initializing(){
        driver.get(homeUrl);
        homePageClass = PageFactory.initElements(driver, HomePageClass.class);

    }

    @Test
    public void testInputId(){
        homePageClass.searchInput();
    }

    @Test
    public void clickAtm(){

        homePageClass.clickBranchLink();
    }


    @Test
    public void testIfDataReaderWorks() {
        DataReader dr = new DataReader();
        String[] data = dr.getExcelData(this.cbdataPath, 0);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

    }


    @Test
    public void creditCard(){
        homePageClass.clickcreditCard();
    }











}
