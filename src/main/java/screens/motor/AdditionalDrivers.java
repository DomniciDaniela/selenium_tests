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

public class AdditionalDrivers {

    /**
     * Helper method to wait for page to load
     */
    public static void waitForScreen() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(TestDataUtils.PageURLs.ADDITIONAL_DRIVERS));
    }

    /**
     * Helper method to select 'Title'
     */
    public static void selectTitle(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("title"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to set 'FirstName'
     */
    public static void setFirstName(String firstName) throws Exception {
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        Utils.typeText(firstNameField, firstName);
    }

    /**
     * Helper method to set 'LastName'
     */
    public static void setLastName(String lastName) throws Exception {
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        Utils.typeText(lastNameField, lastName);
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
     * Helper method to set 'Birthday'
     */
    public static void setBirthday(String day, String month, String year) throws Exception {
        WebElement dob = driver.findElement(By.id("input-dob.day"));
        WebElement mob = driver.findElement(By.id("input-dob.month"));
        WebElement yob = driver.findElement(By.id("input-dob.year"));
        Utils.typeText(dob, day);
        Utils.typeText(mob, month);
        Utils.typeText(yob, year);
    }

    /**
     * Helper method to set 'UK Residence' - Yes
     */
    public static void clickResidenceYes() throws Exception {
        WebElement ukResident = driver.findElement(By.id("ukResident_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(ukResident);
            Utils.clickWebElementJS(ukResident);
        } else {
            Utils.clickWebElementAfterWait(ukResident, 3);
        }
    }

    /**
     * Helper method to set 'UK Residence' - No
     */
    public static void clickResidenceNo() throws Exception {
        WebElement ukResident = driver.findElement(By.id("ukResident_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(ukResident);
            Utils.clickWebElementJS(ukResident);
        } else {
            Utils.clickWebElementAfterWait(ukResident, 3);
        }
    }

    /**
     * Helper method to select 'UK residence month'
     */
    public static void selectResidenceMonth(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("uk_resident_month"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to select 'UK residence month'
     */
    public static void selectResidenceYear(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("uk_resident_year"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to select 'EmploymentStatus'
     */
    public static void selectEmploymentStatus(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("employmentStatus"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
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
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(occupation);
            Utils.clickWebElementJS(occupation);
        } else {
            Utils.clickWebElementAfterWait(occupation, 3);
        }
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
            Utils.clickWebElementAfterWait(occupation, 3);
        }
    }

    /**
     * Helper method to set 'Occupation'
     */
    public static void setSecondOccupation(String ocupation) throws Exception {
        WebElement occupationOther = driver.findElement(By.id("secondaryOccupation"));
        Utils.typeText(occupationOther, ocupation);
    }

    /**
     * Helper method to select 'Relationship'
     */
    public static void selectRelationship(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("relationship"));
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
        /*Select dropdown = new Select(driver.findElement(By.id("licenseType")));
        dropdown.selectByVisibleText(dropdownValue);*/
        WebElement  element = driver.findElement(By.id("licenseType"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
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
     * Helper method to click 'Claim' - Yes
     */
    public static void clickClaimYes() throws Exception {
        WebElement fault = driver.findElement(By.id("claimsFlag_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(fault);
            Utils.clickWebElementJS(fault);
        } else {
            Utils.clickWebElementAfterWait(fault, 3);
        }
    }

    /**
     * Helper method to click 'Claim' - No
     */
    public static void clickClaimNo() throws Exception {
        WebElement fault = driver.findElement(By.id("claimsFlag_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(fault);
            Utils.clickWebElementJS(fault);
        } else {
            Utils.clickWebElementAfterWait(fault, 3);
        }
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

    /**
     * Helper method to click 'Conviction' - Yes
     */
    public static void clickConvictionYes() throws Exception {
        WebElement fault = driver.findElement(By.id("convictionsFlag_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(fault);
            Utils.clickWebElementJS(fault);
        } else {
            Utils.clickWebElementAfterWait(fault, 3);
        }
    }

    /**
     * Helper method to click 'Conviction' - No
     */
    public static void clickConvictionNo() throws Exception {
        WebElement fault = driver.findElement(By.id("convictionsFlag_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(fault);
            Utils.clickWebElementJS(fault);
        } else {
            Utils.clickWebElementAfterWait(fault, 3);
        }
    }

    /**
     * Helper method to set 'Conviction code'
     */
    public static void setConvictionCode(String code) throws Exception {
        WebElement conviction = driver.findElement(By.id("convictionsSubform:conviction"));
        Utils.typeText(conviction, code);
    }

    /**
     * Helper method to set the claim date
     */
    public static void convictionDate(String day, String month, String year) throws Exception {
        WebElement doc = driver.findElement(By.id("convictionsSubform:convictionDate.day"));
        WebElement moc = driver.findElement(By.id("convictionsSubform:convictionDate.month"));
        WebElement yoc = driver.findElement(By.id("convictionsSubform:convictionDate.year"));
        Utils.typeText(doc, day);
        Utils.typeText(moc, month);
        Utils.typeText(yoc, year);
    }

    /**
    * Helper method to set 'Penalty points '
    */
    public static void setPenaltyPoints(String points) throws Exception {
        WebElement penaltyPoints = driver.findElement(By.id("convictionsSubform:penaltyPoints"));
        Utils.typeText(penaltyPoints, points);
    }

    /**
     * Helper method to set 'Ban length'
     */
    public static void setBanLength(String months) throws Exception {
        WebElement months1 = driver.findElement(By.id("convictionsSubform:banLength"));
        Utils.typeText(months1, months);
    }

    /**
     * Helper method to click 'Conviction Clear' button
     */
    public static void clickConvictionClearButton() throws Exception {
        WebElement clear = driver.findElement(By.id("convictionsSubform:clearConvictionButton"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(clear);
            Utils.clickWebElementJS(clear);
        } else {
            Utils.clickWebElementAfterWait(clear, 3);
        }
    }

    /**
     * Helper method to click 'Save Conviction' button
     */
    public static void clickConvictionSaveButton() throws Exception {
        WebElement save = driver.findElement(By.id("convictionsSubform:addConvictionButton"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(save);
            Utils.clickWebElementJS(save);
        } else {
            Utils.clickWebElementAfterWait(save, 3);
        }
    }

    /**
     * Helper method to enter Additional driver's details
     * @throws Exception
     */
    public static void enterAdditionalDriverDetails() throws Exception {
        selectTitle(MotorDataLoad.DataLoadVariables.sAD1Title);
        setFirstName(MotorDataLoad.DataLoadVariables.sAD1Firstname);
        setLastName(MotorDataLoad.DataLoadVariables.sAD1Surname);

        // Gender Male/Female AD1
        if (MotorDataLoad.DataLoadVariables.sAD1Gender.equalsIgnoreCase(TestDataUtils.Flags.MALE)) {
            clickGenderMale();
        } else {
           clickGenderFemale();
        }

        setBirthday(MotorDataLoad.DataLoadVariables.sAD1DOBDay, MotorDataLoad.DataLoadVariables.sAD1DOBMonth, MotorDataLoad.DataLoadVariables.sAD1DOBYear);

        // UK residence
        if (MotorDataLoad.DataLoadVariables.sAD1ResidentInUKSinceBirth.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickResidenceYes();
        } else {
            clickResidenceNo();

            // TODO put data in table and also in MotorDataLoad class
            selectResidenceMonth("");
            selectResidenceYear("");
        }

        selectEmploymentStatus(MotorDataLoad.DataLoadVariables.sAD1EmploymentStatus);

        //Occupation Status
        setOcupation(MotorDataLoad.DataLoadVariables.sAD1Occupation);
        setIndustry(MotorDataLoad.DataLoadVariables.sAD1Industry);

        // check for second job
        if (MotorDataLoad.DataLoadVariables.sAD1SecondOccupation.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickSecondOccupationYes();

            setSecondOccupation(MotorDataLoad.DataLoadVariables.sAD1SecondOccupation);
        } else {
            clickSecondOccupationNo();
        }

        // select marital status
        selectMaritalStatus(MotorDataLoad.DataLoadVariables.sAD1MaritalStatus);
        selectRelationship(MotorDataLoad.DataLoadVariables.sAD1RelationshipToMe);
        selectLicenseType(MotorDataLoad.DataLoadVariables.sAD1LicenceType);
        selectLicenseHold(MotorDataLoad.DataLoadVariables.sAD1LicenceHeld);

        if (MotorDataLoad.DataLoadVariables.sAD1Claims.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickClaimYes();

            selectClaimType(MotorDataLoad.DataLoadVariables.sClaimType1);
            claimDate(MotorDataLoad.DataLoadVariables.sClaimDay1, MotorDataLoad.DataLoadVariables.sClaimMonth1, MotorDataLoad.DataLoadVariables.sClaimYear1);
            clickFaultClaimNo();
          /*  // TODO Add flags for faultclaim
            if ("faultclaim".equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                clickFaultClaimYes();
            } else {
                clickFaultClaimNo();
            }*/
            clickClaimSaveButton();
        } else {
            clickClaimNo();
        }

        if (MotorDataLoad.DataLoadVariables.sAD1Convictions.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickConvictionYes();

            setConvictionCode(MotorDataLoad.DataLoadVariables.sAD1ConvictionCode);
            convictionDate(MotorDataLoad.DataLoadVariables.sAD1ConvictionDay, MotorDataLoad.DataLoadVariables.sAD1ConvictionMonth, MotorDataLoad.DataLoadVariables.sAD1ConvictionYear);
            setPenaltyPoints(MotorDataLoad.DataLoadVariables.sAD1PenaltyPoints);
            setBanLength(MotorDataLoad.DataLoadVariables.sAD1BanLength);

            clickConvictionSaveButton();
        } else {
            clickConvictionNo();
        }

    }
}