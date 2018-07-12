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

public class AboutYou {

    /**
     * Helper method to wait for page to load
     */
    public static void waitForScreen() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(TestDataUtils.PageURLs.ABOUT_YOU));
    }

    /**
     * Helper method to set 'Birthday'
     */
    public static void setBirthday(String day, String month, String year) throws Exception {
        WebElement dob = driver.findElement(By.id("input-dob.day"));
        WebElement mob = driver.findElement(By.id("input-dob.month"));
        WebElement yob = driver.findElement(By.id("input-dob.year"));
        Utils.typeTextAfterWait(dob,10, day);
        Utils.typeTextAfterWait(mob,10, month);
        Utils.typeTextAfterWait(yob,10, year);
    }

    /**
     * Helper method to set 'UK Residence' - Yes
     */
    public static void clickResidenceYes() throws Exception {
        WebElement ukResident = driver.findElement(By.id("label_ukResident_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            Utils.moveToWebElement(ukResident);
            Utils.clickWebElementJS(ukResident);
        } else {
            Utils.clickWebElementAfterWait(ukResident, 3);}
    }

    /**
     * Helper method to set 'UK Residence' - No
     */
    public static void clickResidenceNo() throws Exception {
        WebElement ukResident = driver.findElement(By.id("label_ukResident_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            Utils.moveToWebElement(ukResident);
            Utils.clickWebElementJS(ukResident);
        } else {
            Utils.clickWebElementAfterWait(ukResident, 3);}
    }

    /**
     * Helper method to select 'EmploymentStatus'
     */
    public static void selectEmploymentStatus(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("employmentStatus"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
            Thread.sleep(200);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to set 'Occupation'
     */
    public static void setOcupation(String ocupation) throws Exception {
        WebElement occupationOther = driver.findElement(By.id("occupationOther"));
        Utils.typeText(occupationOther, ocupation);
    }

    /**
     * Helper method to set 'Industry'
     */
    public static void setIndustry(String industry) throws Exception {
        WebElement industry1 = driver.findElement(By.id("industry"));
        Utils.typeText(industry1, industry);
    }

    /**
     * Helper method to click 'Second occupation' - Yes
     */
    public static void clickSecondOccupationYes() throws Exception {
        WebElement occupation = driver.findElement(By.id("secondaryOccupationFlag_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            Utils.moveToWebElement(occupation);
            Utils.clickWebElementJS(occupation);
        } else {
            Utils.clickWebElementAfterWait(occupation, 3);}
    }

    /**
     * Helper method to click 'Second occupation' - No
     */
    public static void clickSecondOccupationNo() throws Exception {
        WebElement occupation = driver.findElement(By.id("secondaryOccupationFlag_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(occupation);
            Utils.clickWebElementJS(occupation);
        } else {
            Utils.clickWebElementAfterWait(occupation, 3);}
    }

    /**
     * Helper method to set 'Occupation'
     */
    public static void setSecondOccupation(String ocupation) throws Exception {
        WebElement occupationOther = driver.findElement(By.id("secondaryOccupation"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(occupationOther);
        }
        Utils.typeText(occupationOther, ocupation);
    }

    /**
     * Helper method to set 'Gender' - Male
     */
    public static void clickGenderMale() throws Exception {
        WebElement gender = driver.findElement(By.id("label_gender_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(gender);
            Utils.clickWebElementJS(gender);
        } else {
            Utils.clickWebElementAfterWait(gender, 3);
        }
    }

    /**
     * Helper method to set 'UK Residence' - Female
     */
    public static void clickGenderFemale() throws Exception {
        WebElement gender = driver.findElement(By.id("label_gender_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(gender);
            Utils.clickWebElementJS(gender);
        } else {
            Utils.clickWebElementAfterWait(gender, 3);
        }
    }

    /**
     * Helper method to select 'MaritalStatus'
     */
    public static void selectMaritalStatus(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("maritalStatus"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to select 'No of children'
     */
    public static void selectMotorChildren(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("motorNumberOfChildren"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to select 'ResidentialStatus'
     */
    public static void selectResidentialStatus(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("residentialStatus"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to select 'Cars in household'
     */
    public static void selectCarsHold(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("numberOfHouseholdCars"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to select 'Other cars'
     */
    public static void selectOtherCarsUsage(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("useOtherCars"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to select 'LicenseType'
     */
    public static void selectLicenseType(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("licenseType"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByValue(dropdownValue);
        }
    }

    /**
     * Helper method to select 'LicenseHold'
     */
    public static void selectLicenseHold(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("licenceHeldYearList"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to select 'NCD'
     */
    public static void selectNCD(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("ncd"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to set 'RegistrationNumber'
     */
    public static void setRegistrationNumber(String number) throws Exception {
        WebElement registrationNumber = driver.findElement(By.id("registrationNumber"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(registrationNumber);
        }
        Utils.typeText(registrationNumber, number);
    }

    /**
     * Helper method to set 'PostCode'
     */
    public static void setPostCode(String postCode) throws Exception {
        WebElement code = driver.findElement(By.id("postCode"));
        Utils.typeTextAfterWait(code, 3, postCode);
    }

    /**
     * Helper method to click 'Find Address' button
     */
    public static void clickFindAddress() throws Exception {
        WebElement findButton = driver.findElement(By.id("findAddress"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(findButton);
            Utils.clickWebElementJS(findButton);
        } else {
            Utils.clickWebElementAfterWait(findButton, 3);
        }
    }

    /**
     * Helper method to set  'Cover declaration' - Yes flag
     */
    public static void clickCoverDeclararionYes() throws Exception {
        WebElement declaration = driver.findElement(By.id("label_coverDeclarations_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(declaration);
            Utils.clickWebElementJS(declaration);
        } else {
            Utils.clickWebElementAfterWait(declaration, 3);
        }
    }

    /**
     * Helper method to set  'Cover declaration' - Yes flag
     */
    public static void clickCoverDeclararionNo() throws Exception {
        WebElement declaration = driver.findElement(By.id("label_coverDeclarations_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(declaration);
            Utils.clickWebElementJS(declaration);
        } else {
            Utils.clickWebElementAfterWait(declaration, 3);
        }
    }

    /**
     * Helper method to set 'Additional Cover declaration' - Yes
     */
    public static void clickAdditionalCoverDeclararionYes() throws Exception {
        WebElement declaration = driver.findElement(By.id("label_additionalCoverDeclarations_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(declaration);
            Utils.clickWebElementJS(declaration);
        } else {
            Utils.clickWebElementAfterWait(declaration, 3);
        }
    }

    /**
     * Helper method to set 'Additional Cover declaration' - No
     */
    public static void clickAdditionalCoverDeclararionNo() throws Exception {
        WebElement declaration = driver.findElement(By.id("label_additionalCoverDeclarations_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(declaration);
            Utils.clickWebElementJS(declaration);
        } else {
            Utils.clickWebElementAfterWait(declaration, 3);
        }
    }

    /**
     * Helper method to populate all form fields within 'AboutYou' page
     */
    public static void enterYourDetails() throws Exception {
        setBirthday(MotorDataLoad.DataLoadVariables.sDOBday, MotorDataLoad.DataLoadVariables.sDOBmonth, MotorDataLoad.DataLoadVariables.sDOByear);

        // Declare UK residence (Y or N)
        if (MotorDataLoad.DataLoadVariables.sResidentInUKSinceBirth.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickResidenceYes();
        } else {
            clickResidenceNo();
        }

        selectEmploymentStatus(MotorDataLoad.DataLoadVariables.sEmploymentStatus);

        boolean aRetired;
        aRetired = MotorDataLoad.DataLoadVariables.sEmploymentStatus.equalsIgnoreCase(TestDataUtils.Flags.RETIRED);

        if (aRetired == false) {
            //Occupation Status
            Thread.sleep(200); // for emulation mode
            setOcupation(MotorDataLoad.DataLoadVariables.sOccupation);
            setIndustry(MotorDataLoad.DataLoadVariables.sIndustry);

            Utils.clickEscape();

            // If second occupation exists, click yes and enter the description, else click no
            if (MotorDataLoad.DataLoadVariables.sHaveSecondOccupation.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                clickSecondOccupationYes();
                setSecondOccupation(MotorDataLoad.DataLoadVariables.sSecondOccupation);
            } else {
                clickSecondOccupationNo();
            }
        }

        // Select gender (M or F)
        if (MotorDataLoad.DataLoadVariables.sGender.equalsIgnoreCase(TestDataUtils.Flags.MALE)) {
            clickGenderMale();
        } else {
            clickGenderFemale();
        }

        selectMaritalStatus(MotorDataLoad.DataLoadVariables.sMaritalStatus);
        selectMotorChildren(MotorDataLoad.DataLoadVariables.sChildrenUnder16);
        selectResidentialStatus(MotorDataLoad.DataLoadVariables.sResidentialStatus);
        selectCarsHold(MotorDataLoad.DataLoadVariables.sCarsInHousehold);
        selectOtherCarsUsage(MotorDataLoad.DataLoadVariables.sAccessToOtherCars);
        selectLicenseType(MotorDataLoad.DataLoadVariables.sLicenceType);
        selectLicenseHold(MotorDataLoad.DataLoadVariables.sHeldLicenceFor);
        selectNCD(MotorDataLoad.DataLoadVariables.sNCD);

        setRegistrationNumber(MotorDataLoad.DataLoadVariables.sRegistrationNumber);

        Thread.sleep(2000); // for emulation mode
        setPostCode(MotorDataLoad.DataLoadVariables.sPostCode);

        clickFindAddress();
        Utils.selectAddress(MotorDataLoad.DataLoadVariables.sFullAddress);

        clickCoverDeclararionYes();
        clickAdditionalCoverDeclararionYes();
    }

}
