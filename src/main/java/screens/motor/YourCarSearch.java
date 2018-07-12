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

public class YourCarSearch {

    /**
     * Helper method to wait for page to load
     *
     * @throws Exception
     */
    public static void waitForScreen() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(TestDataUtils.PageURLs.YOUR_CAR_SEARCH));
    }

    /**
     * Helper method to select 'Car Make'
     */
    public static void selectCarMake(String dropdownValue) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("makeType")));

        WebElement  element = driver.findElement(By.id("makeType"));

        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to select 'Model'
     */
    public static void selectModel(String dropdownValue) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("modelType")));

        WebElement  element = driver.findElement(By.id("modelType"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to select 'FuelType'
     */
    public static void selectFuelType(String dropdownValue) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fuelType")));

        WebElement  element = driver.findElement(By.id("fuelType"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to select 'FuelType'
     */
    public static void selectTransmitionType(String dropdownValue) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("transmissionType")));

        WebElement  element = driver.findElement(By.id("transmissionType"));

        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to set 'Registration Date'
     */
    public static void setRegistrationDate(String day, String month, String year) throws Exception {
        WebElement registrationDay = driver.findElement(By.id("registrationDate.day"));
        WebElement registrationMonth = driver.findElement(By.id("registrationDate.month"));
        WebElement registrationYear = driver.findElement(By.id("registrationDate.year"));
        Utils.typeText(registrationDay, day);
        Utils.typeText(registrationMonth, month);
        Utils.typeText(registrationYear, year);
    }


    /**
     * Helper method to click 'Find cars' button
     */
    public static void clickFindCars() throws Exception {
        WebElement findVehicle = driver.findElement(By.id("findVehicle"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(findVehicle);
            Utils.clickWebElementJS(findVehicle);
        } else {
            Utils.clickWebElementAfterWait(findVehicle, 3);
        }
    }

    /**
     * Helper method to select 'CarType'
     */
    public static void selectCarType(String dropdownValue) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("carType")));

        WebElement  element = driver.findElement(By.id("carType"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to populate all form fields within 'YourCarSearch' page
     */
    public static void enterCarDetails() throws Exception {
        selectCarMake(MotorDataLoad.DataLoadVariables.sMake);
        selectModel(MotorDataLoad.DataLoadVariables.sModel);
        selectFuelType(MotorDataLoad.DataLoadVariables.sFuelType);
        selectTransmitionType(MotorDataLoad.DataLoadVariables.sTransmissionType);
        setRegistrationDate(MotorDataLoad.DataLoadVariables.sRegDay, MotorDataLoad.DataLoadVariables.sRegMonth, MotorDataLoad.DataLoadVariables.sRegYear);

        clickFindCars();

        selectCarType(MotorDataLoad.DataLoadVariables.sCarID);
    }
}
