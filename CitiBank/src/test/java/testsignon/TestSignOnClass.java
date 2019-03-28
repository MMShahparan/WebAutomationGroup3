package testsignon;

import base.CommonAPI;
import signon.SignOnClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSignOnClass extends CommonAPI {


    String cbdataPath = "/Users/MSM/IdeaProjects/WebAutomationGroup3/CitiBank/src/test/resources/cbdata.xls";

    SignOnClass SignOn;
    String homeUrl = "https://online.citi.com/" ;

    @BeforeClass
    public void initializing(){
        driver.get(homeUrl);
        SignOn = PageFactory.initElements(driver, SignOnClass.class);
    }

    @Test
    public void testuserID (){
        SignOn.userID();
    }

    @Test
    public void testpassword (){
        SignOn.password();
    }


}
