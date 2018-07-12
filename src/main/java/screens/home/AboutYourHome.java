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

public class AboutYourHome {

    /**
     * Helper method to wait for page to load
     */
    public static void waitForScreen() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(TestDataUtils.PageURLs.ABOUT_YOUR_HOME));
    }

    /**
     * Helper method to select 'Property Type'
     */
    public static void selectPropertyType(String dropdownValue) throws Exception {
        Select dropdown = new Select(driver.findElement(By.id("propertyType")));
        dropdown.selectByVisibleText(dropdownValue);
    }

    /**
     * Helper method to click 'Listed As Building' - Yes flag
     */
    public static void clickListedAsBuildingYes() throws Exception {
        WebElement element = driver.findElement(By.id("listedBuildingFlag_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 2);
        }
    }

    /**
     * Helper method to click 'Listed As Building' - No flag
     */
    public static void clickListedAsBuildingNo() throws Exception {
        WebElement element = driver.findElement(By.id("listedBuildingFlag_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 2);
        }
    }

    /**
     * Helper method to set 'Year of construction'
     */
    public static void setConstructionYear(String year) throws Exception {
        WebElement constructionYear = driver.findElement(By.id("constructionYear"));
        Utils.typeTextAfterWait(constructionYear, 3, year);
    }

    /**
     * Helper method to select 'Number of Bedrooms'
     */
    public static void selectNumberOfBedrooms(String dropdownValue) throws Exception {
        Select dropdown = new Select(driver.findElement(By.id("numberOfBedrooms")));
        dropdown.selectByVisibleText(dropdownValue);
    }

    /**
     * Helper method to select 'No of children'
     */
    public static void selectNumberOfChildren(String dropdownValue) throws Exception {
        Select dropdown = new Select(driver.findElement(By.id("numberOfChildren")));
        dropdown.selectByVisibleText(dropdownValue);
    }

    /**
     * Helper method to select 'No of adults'
     */
    public static void selectNumberOfAdults(String dropdownValue) throws Exception {
        Select dropdown = new Select(driver.findElement(By.id("numberOfAdults")));
        dropdown.selectByVisibleText(dropdownValue);
    }

    /**
     * Helper method to select 'Ownership Type'
     */
    public static void selectOwnershipType(String dropdownValue) throws Exception {
        Select dropdown = new Select(driver.findElement(By.id("ownershipType")));
        dropdown.selectByVisibleText(dropdownValue);
    }

    /**
     * Helper method to click 'Windows locked' - Yes flag
     */
    public static void clickWindowsLockedYes() throws Exception {
        WebElement element = driver.findElement(By.id("windowLocksFitted_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 2);
        }
    }

    /**
     * Helper method to click 'Windows locked' - No flag
     */
    public static void clickWindowsLockedNo() throws Exception {
        WebElement element = driver.findElement(By.id("windowLocksFitted_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 2);
        }
    }

    public static boolean isBuildingPopupDisplayed() throws Exception {
        WebElement popup = driver.findElement(By.id("confirmNextButton_c"));
        return Utils.isWebElementIsDisplayed(popup, 2);
    }

    /**
     * Helper method to populate all form fields within 'About Your Home' page
     */
    public static void enterHomeDetails() throws Exception {
        selectPropertyType(HomeDataLoad.DataLoadVariables.sPropertyType);

        // Listed as Building (Y or N)
        if (HomeDataLoad.DataLoadVariables.sListedAsBuilding.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickListedAsBuildingYes();
        } else {
            clickListedAsBuildingNo();
        }

        setConstructionYear(HomeDataLoad.DataLoadVariables.sConstructionYear);
        selectNumberOfBedrooms(HomeDataLoad.DataLoadVariables.sBedroomsNO);
        selectNumberOfChildren(HomeDataLoad.DataLoadVariables.sChildrenUnder16);

        if (driver.getCurrentUrl().contains(TestDataUtils.PageURLs.SHEILAS_WHEELS)) {
            selectNumberOfAdults(HomeDataLoad.DataLoadVariables.sAdults);
        }

        selectOwnershipType(HomeDataLoad.DataLoadVariables.sOwnershipType);

        // Windows secured (Y or N)
        if (HomeDataLoad.DataLoadVariables.sWindowsSecured.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickWindowsLockedYes();
        } else {
            clickWindowsLockedNo();
        }
    }
}
