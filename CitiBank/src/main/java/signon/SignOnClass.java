package signon;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SignOnClass extends CommonAPI {

    @FindBy(xpath = "//input[@id='usernameMasked']")
    WebElement userID;

    public void userID(){
//        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName())+"-> "+"UserID");
        driver.findElement(By.xpath("//input[@id='usernameMasked']")).sendKeys("testuserid");
    }

    @FindBy(css = "#password")
    WebElement password;
    public void password(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"password");
        password.sendKeys("testpassword");

    }
}
