package screens.motor;

import helpers.TestDataUtils;
import helpers.Utils;
import helpers.utility.ConfigLoad;
import helpers.utility.MotorDataLoad;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static helpers.TestBase.driver;

public class AboutYourClaims {

    /**
     * Helper method to wait for page to load
     */
    public static void waitForScreen() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(TestDataUtils.PageURLs.ABOUT_YOUR_CLAIMS));
    }

    /**
     * Helper method to select 'Relationship'
     */
    public static void selectClaimType(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("claimType"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to set the claim date
     */
    public static void claimDate(String day, String month, String year) throws Exception {
        WebElement doc = driver.findElement(By.id("claimDate.day"));
        WebElement moc = driver.findElement(By.id("claimDate.month"));
        WebElement yoc = driver.findElement(By.id("claimDate.year"));
        Utils.typeText(doc, day);
        Utils.typeText(moc, month);
        Utils.typeText(yoc, year);
    }

    /**
     * Helper method to click 'Fault Claim' - Yes
     */
    public static void clickFaultClaimYes() throws Exception {
        WebElement fault = driver.findElement(By.id("afaultClaimFlag_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(fault);
            Utils.clickWebElementJS(fault);
        } else {
            Utils.clickWebElementAfterWait(fault, 3);
        }
    }

    /**
     * Helper method to click 'Fault Claim' - No
     */
    public static void clickFaultClaimNo() throws Exception {
        WebElement fault = driver.findElement(By.id("afaultClaimFlag_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(fault);
            Utils.clickWebElementJS(fault);
        } else {
            Utils.clickWebElementAfterWait(fault, 3);
        }
    }

    /**
     * Helper method to click 'Claim Clear' button
     */
    public static void clickClaimClearButton() throws Exception {
        WebElement clear = driver.findElement(By.id("clearClaimButton"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(clear);
            Utils.clickWebElementJS(clear);
        } else {
            Utils.clickWebElementAfterWait(clear, 3);
        }
    }

    /**
     * Helper method to click 'Save Clear' button
     */
    public static void clickClaimSaveButton() throws Exception {
        WebElement save = driver.findElement(By.id("addClaimButton"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(save);
            Utils.clickWebElementJS(save);
        } else {
            Utils.clickWebElementAfterWait(save, 3);
        }
    }

    public static void enterClaimDetails() throws Exception {
        selectClaimType(MotorDataLoad.DataLoadVariables.sClaimType1);
        claimDate(MotorDataLoad.DataLoadVariables.sClaimDay1, MotorDataLoad.DataLoadVariables.sClaimMonth1, MotorDataLoad.DataLoadVariables.sClaimYear1);
        clickFaultClaimNo();
        clickClaimSaveButton();
    }
}
