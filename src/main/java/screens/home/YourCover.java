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

public class YourCover {

    /**
     * Helper method to wait for page to load
     */
    public static void waitForScreen() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(TestDataUtils.PageURLs.YOUR_COVER));
    }

    public static boolean isStandardBuildingCoverDisplayed() {
        try {
            WebElement cover = driver.findElement(By.id("buildingsCovers_1"));
            return cover.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Helper method to click 'Standard Building Cover' flag
     */
    public static void clickStandardBuildingCover() throws Exception {
        WebElement element = driver.findElement(By.id("buildingsCovers_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 3);
        }
    }

    /**
     * Helper method to click 'Standard Plus Cover' flag
     */
    public static void clickStandardPlusCover() throws Exception {
        WebElement element = driver.findElement(By.id("buildingsCovers_2"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 3);
        }
    }

    /**
     * Helper method to click 'Not required' flag
     */
    public static void clickNoCover() throws Exception {
        WebElement element = driver.findElement(By.id("buildingsCovers_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 3);
        }
    }

    /**
     * Helper method to select 'Building Voluntary Excess'
     */
    public static void selectBuildingVoluntaryExcess(String dropdownValue) throws Exception {
        Select dropdown = new Select(driver.findElement(By.id("buildingVoluntaryExcess")));
        dropdown.selectByValue(dropdownValue);
    }

    /**
     * Helper method to click 'Standard Building Cover' flag
     */
    public static void clickStandardContentsCover() throws Exception {
        WebElement element = driver.findElement(By.id("contentsCovers_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 3);
        }
    }

    /**
     * Helper method to click 'Standard Plus Cover' flag
     */
    public static void clickStandardPlusContentCover() throws Exception {
        WebElement element = driver.findElement(By.id("contentsCovers_2"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 3);
        }
    }

    /**
     * Helper method to click 'Not required' flag
     */
    public static void clickNoContentCover() throws Exception {
        WebElement element = driver.findElement(By.id("contentsCovers_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 3);
        }
    }
    /**
     * Helper method to select 'NCD - No Claim Discount'
     */
    public static void selectNCD(String dropdownValue) throws Exception {
        Select dropdown = new Select(driver.findElement(By.id("ncd")));
        dropdown.selectByVisibleText(dropdownValue);
    }

    /**
     * Helper method to select 'Content Voluntary Excess'
     */
    public static void selectContentVoluntaryExcess(String dropdownValue) throws Exception {
        Select dropdown = new Select(driver.findElement(By.id("contentVolExcess")));
        dropdown.selectByValue(dropdownValue);
    }

    /**
     * Helper method to set 'Content Home Price'
     */
    public static void setContentHomePrice(String price) throws Exception {
        WebElement content = driver.findElement(By.id("contentHome"));
        Utils.typeTextAfterWait(content, 3, price);
    }

    /**
     * Helper method to set 'Content Away'
     */
    public static void setContentAway(String price) throws Exception {
        WebElement content = driver.findElement(By.id("contentAway"));
        Utils.typeTextAfterWait(content, 3, price);
    }

    /**
     * Helper method to click 'Specified content' - Yes flag
     */
    public static void clickSpecifiedContentYes() throws Exception {
        WebElement element = driver.findElement(By.id("contentsSpecifiedItems_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 3);
        }
    }

    /**
     * Helper method to click 'Specified content' - No flag
     */
    public static void clickSpecifiedContentNo() throws Exception {
        WebElement element = driver.findElement(By.id("contentsSpecifiedItems_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 3);
        }
    }

    /**
     * Helper method to select 'Specified Item Type'
     */
    public static void selectSpecifiedItemType(String dropdownValue) throws Exception {
        Select dropdown = new Select(driver.findElement(By.id("specifiedItemType")));
        dropdown.selectByVisibleText(dropdownValue);
    }

    /**
     * Helper method to set 'Specified Item Description'
     */
    public static void setItemDescription(String description) throws Exception {
        WebElement item = driver.findElement(By.id("itemDescription"));
        Utils.typeTextAfterWait(item, 3, description);
    }

    /**
     * Helper method to set 'Specified Item Value'
     */
    public static void setItemValue(String value) throws Exception {
        WebElement item = driver.findElement(By.id("itemValue"));
        Utils.typeTextAfterWait(item, 3, value);
    }

    /**
     * Helper method to click 'Specified content' - No flag
     */
    public static void clickAddSpecifiedItem() throws Exception {
        WebElement button = driver.findElement(By.id("addSpecifiedItemsButton"));
        Utils.clickWebElementAfterWait(button, 2);
    }

    /**
     * Helper method to click 'Address Same As Insured Address' - Yes flag
     */
    public static void clickAddressSameAsInsuredAddressYes() throws Exception {
        WebElement element = driver.findElement(By.id("riskAddressSameAsInsuredAddressFlag_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 3);
        }
    }

    /**
     * Helper method to click 'Address Same As Insured Address' - No flag
     */
    public static void clickAddressSameAsInsuredAddressNo() throws Exception {
        WebElement element = driver.findElement(By.id("riskAddressSameAsInsuredAddressFlag_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 3);
        }
    }

    /**
     * Helper method to click 'Move To Insured Address' - Yes flag
     */
    public static void clickMoveToInsuredAddressYes() throws Exception {
        WebElement element = driver.findElement(By.id("movingToInsuredAddressFlag_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 3);
        }
    }

    /**
     * Helper method to click 'Move To Insured Address' - No flag
     */
    public static void clickMoveToInsuredAddressNo() throws Exception {
        WebElement element = driver.findElement(By.id("movingToInsuredAddressFlag_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 3);
        }
    }

    /**
     * Helper method to select cover
     */
    public static void selectCover() throws Exception {
        // Set building cover
        if (isStandardBuildingCoverDisplayed()) {
            if (HomeDataLoad.DataLoadVariables.sStandardBuildingCover.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                clickStandardBuildingCover();
                selectBuildingVoluntaryExcess(HomeDataLoad.DataLoadVariables.sBuildingExcess);
            } else if (HomeDataLoad.DataLoadVariables.sPlusBuildingCover.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                clickStandardPlusCover();
                selectBuildingVoluntaryExcess(HomeDataLoad.DataLoadVariables.sBuildingExcess);
            } else {
                clickNoCover();
            }
        }

        // Set content cover
        if (HomeDataLoad.DataLoadVariables.sStandardContentCover.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickStandardContentsCover();
            enterDetailsBasedOnCover(false);
        } else if (HomeDataLoad.DataLoadVariables.sPlusContentCover.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickStandardPlusContentCover();
            enterDetailsBasedOnCover(false);
        } else {
            clickNoContentCover();
            enterDetailsBasedOnCover(true);
        }
    }

    /**
     * Helper method to set the cover details based on its type
     * @param noCover - true/false
     */
    private static void enterDetailsBasedOnCover(boolean noCover) throws Exception {
        if (!noCover) {
            Thread.sleep(300); // for the emulator
            selectNCD(HomeDataLoad.DataLoadVariables.sNCD);
            Thread.sleep(300); // for the emulator
            selectContentVoluntaryExcess(HomeDataLoad.DataLoadVariables.sContentExcess);
            setContentHomePrice(HomeDataLoad.DataLoadVariables.sCostReplacement);
            setContentAway(HomeDataLoad.DataLoadVariables.sCostPersonalPossession);
            if (HomeDataLoad.DataLoadVariables.sSpecifiedItem.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                clickSpecifiedContentYes();
                selectSpecifiedItemType(HomeDataLoad.DataLoadVariables.sItemType);
                setItemDescription(HomeDataLoad.DataLoadVariables.sItemDescription);
                setItemValue(HomeDataLoad.DataLoadVariables.sItemValue);
            } else {
                clickSpecifiedContentNo();
            }
        }

        if (HomeDataLoad.DataLoadVariables.sSameAddressAsInsuredAddress.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickAddressSameAsInsuredAddressYes();
        } else {
            clickAddressSameAsInsuredAddressNo();

            if (HomeDataLoad.DataLoadVariables.sMoveToInsuredAddress.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                clickMoveToInsuredAddressYes();
                Utils.setPostCode(HomeDataLoad.DataLoadVariables.sNewPostCode);
                Utils.clickFindAddress();
                Utils.selectAddress(HomeDataLoad.DataLoadVariables.sNewAddress);
            } else {
                clickMoveToInsuredAddressNo();
            }
        }
    }
}
