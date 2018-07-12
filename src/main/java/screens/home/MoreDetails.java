package screens.home;

import helpers.TestDataUtils;
import helpers.Utils;
import helpers.utility.ConfigLoad;
import helpers.utility.HomeDataLoad;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static helpers.TestBase.driver;

public class MoreDetails {

    /**
     * Helper method to wait for page to load
     */
    public static void waitForScreen() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(TestDataUtils.PageURLs.MORE_DETAILS_ABOUT_YOUR_COVER));
    }

    /**
     * Helper method to set 'Registration Number'
     */
    public static void setRegistrationNumber(String number) throws Exception {
        WebElement registration = driver.findElement(By.id("registrationNumber"));
        Utils.typeText(registration, number);
    }

    /**
     * Helper method to click 'Previous Address ' - Yes flag
     */
    public static void clickPreviousAddressYes() throws Exception {
        WebElement element = driver.findElement(By.id("previousAddressesFlag_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 3);
        }
    }

    /**
     * Helper method to click 'Previous Address ' - No flag
     */
    public static void clickPreviousAddressNo() throws Exception {
        WebElement element = driver.findElement(By.id("previousAddressesFlag_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 3);
        }
    }

    /**
     * Helper method to select 'Previous Insurer'
     */
    public static void selectPreviousInsurer(String dropdownValue) throws Exception {
        Select dropdown = new Select(driver.findElement(By.id("prevInsurer")));
        dropdown.selectByVisibleText(dropdownValue);
    }

    /**
     * Helper method to set 'Policy Number'
     */
    public static void setPolicyNumber(String number) throws Exception {
        WebElement policy = driver.findElement(By.id("currentInsurerPolicyNo"));
        Utils.typeText(policy, number);
    }

    /**
     * Helper method to enter the details within "More Details" page
     */
    public static void enterMoreDetails() throws Exception {
        if(HomeDataLoad.DataLoadVariables.sPreviousAddress.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickPreviousAddressYes();
        } else {
            clickPreviousAddressNo();

            Utils.setPostCode(HomeDataLoad.DataLoadVariables.sPreviousPostCode);
            Utils.clickFindAddress();
            Utils.selectAddress(HomeDataLoad.DataLoadVariables.sPreviousFullAddress);
        }

        selectPreviousInsurer(HomeDataLoad.DataLoadVariables.sCurrentInsurer);
        setPolicyNumber(HomeDataLoad.DataLoadVariables.sPolicyNumber);
    }

}
