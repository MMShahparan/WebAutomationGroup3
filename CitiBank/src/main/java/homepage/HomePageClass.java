package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePageClass extends CommonAPI {

    @FindBy(css = "#navUtility > div > div > ul > li:nth-child(2) > a")
    WebElement serchInpuID;

    public void searchInput(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"searchInput");
        serchInpuID.click();
    }

    @FindBy(linkText = "ATM / Branch" )
    WebElement branchLink;

    public void clickBranchLink(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"clickBranchLink");
        branchLink.click();
    }

    @FindBy(xpath = "//div[@id='subnav']/div/div/nav/ul/li/a[text()='Credit Cards']")
    WebElement creditCard;
    public void clickcreditCard(){
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())+"-> "+"clickcreditCard");
        creditCard.click();
    }
}

