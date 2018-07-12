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

public class YouAndYourInsurance {

    /**
     * Helper method to wait for page to load
     */
    public static void waitForScreen() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(TestDataUtils.PageURLs.YOU_AND_YOUR_INSURANCE));
    }

    /**
     * Helper method to verify if 'Your Details' is displayed
     *
     * @return true/false
     */
    public static boolean isYourDetailsDisplayed() throws Exception {
        WebElement yourDetails = driver.findElement(By.className("section-titles"));
        return Utils.isWebElementIsDisplayed(yourDetails, 10);
    }

    /**
     * Helper method to verify if 'Title' is displayed
     *
     * @return true/false
     */
    public static boolean isTitleDropDownDisplayed() throws Exception {
        WebElement title = driver.findElement(By.id("title"));
        return Utils.isWebElementIsDisplayed(title, 10);
    }

    /**
     * Helper method to verify if 'FirstName' is displayed
     *
     * @return true/false
     */
    public static boolean isFirstNameFieldDisplayed() throws Exception {
        WebElement firstName = driver.findElement(By.id("firstName"));
        return Utils.isWebElementIsDisplayed(firstName, 10);
    }

    /**
     * Helper method to verify if 'LastName' is displayed
     *
     * @return true/false
     */
    public static boolean isLastNameFieldDisplayed() throws Exception {
        WebElement lastName = driver.findElement(By.id("lastName"));
        return Utils.isWebElementIsDisplayed(lastName, 10);
    }

    /**
     * Helper method to verify if 'Email' is displayed
     *
     * @return true/false
     */
    public static boolean isEmailFieldDisplayed() throws Exception {
        WebElement email = driver.findElement(By.id("email"));
        return Utils.isWebElementIsDisplayed(email, 10);
    }

    /**
     * Helper method to verify if 'Confirm Email' is displayed
     *
     * @return true/false
     */
    public static boolean isConfirmEmailFieldDisplayed() throws Exception {
        WebElement confirmEmail = driver.findElement(By.id("confirmEmail"));
        return Utils.isWebElementIsDisplayed(confirmEmail, 10);
    }

    /**
     * Helper method to verify if 'Main Phone' is displayed
     *
     * @return true/false
     */
    public static boolean isMainPhoneFieldDisplayed() throws Exception {
        WebElement phone = driver.findElement(By.id("phoneNight"));
        return Utils.isWebElementIsDisplayed(phone, 10);
    }

    /**
     * Helper method to verify if 'Additional Phone' is displayed
     *
     * @return true/false
     */
    public static boolean isAdditionalPhoneFieldDisplayed() throws Exception {
        WebElement phone = driver.findElement(By.id("phoneDay"));
        return Utils.isWebElementIsDisplayed(phone, 10);
    }

    /**
     * Helper method to verify if 'Claim Yes' is displayed
     *
     * @return true/false
     */
    public static boolean isClaimYesDisplayed() throws Exception {
        WebElement claim = driver.findElement(By.id("claimsFlag_0"));
        return Utils.isWebElementIsDisplayed(claim, 10);
    }

    /**
     * Helper method to verify if 'Claim No' is displayed
     *
     * @return true/false
     */
    public static boolean isClaimNoDisplayed() throws Exception {
        WebElement claim = driver.findElement(By.id("claimsFlag_1"));
        return Utils.isWebElementIsDisplayed(claim, 10);
    }

    /**
     * Helper method to verify if 'Convictions Yes' is displayed
     *
     * @return true/false
     */
    public static boolean isConvictionsYesDisplayed() throws Exception {
        WebElement conviction = driver.findElement(By.id("convictionsFlag_0"));
        return Utils.isWebElementIsDisplayed(conviction, 10);
    }

    /**
     * Helper method to verify if 'Convictions No' is displayed
     *
     * @return true/false
     */
    public static boolean isConvictionsNoDisplayed() throws Exception {
        WebElement conviction = driver.findElement(By.id("convictionsFlag_1"));
        return Utils.isWebElementIsDisplayed(conviction, 10);
    }

    /**
     * Helper method to verify if 'Additional drivers - Yes' is displayed
     *
     * @return true/false
     */
    public static boolean isAdditionalDriversYesDisplayed() throws Exception {
        WebElement additionalDrivers = driver.findElement(By.id("noOfAdditionalDrivers_0"));
        return Utils.isWebElementIsDisplayed(additionalDrivers, 10);
    }

    /**
     * Helper method to verify if 'Additional drivers - No' is displayed
     *
     * @return true/false
     */
    public static boolean isAdditionalDriversNoDisplayed() throws Exception {
        WebElement additionalDrivers = driver.findElement(By.id("noOfAdditionalDrivers_1"));
        return Utils.isWebElementIsDisplayed(additionalDrivers, 10);
    }

    /**
     * Helper method to verify if 'Additional driver is the main driver - Yes' is displayed
     *
     * @return true/false
     */
    public static boolean isAdditionalDriverMainYesDisplayed() throws Exception {
        WebElement additionalDrivers = driver.findElement(By.id("mainDriverFlag_0"));
        return Utils.isWebElementIsDisplayed(additionalDrivers, 10);
    }

    /**
     * Helper method to verify if 'Additional driver is the main driver - No' is displayed
     *
     * @return true/false
     */
    public static boolean isAdditionalDriverMainNoDisplayed() throws Exception {
        WebElement additionalDrivers = driver.findElement(By.id("mainDriverFlag_0"));
        return Utils.isWebElementIsDisplayed(additionalDrivers, 10);
    }

    /**
     * Helper method to verify if 'Reason of visit' is displayed
     *
     * @return true/false
     */
    public static boolean isReasonOfVisitDropdownDisplayed() throws Exception {
        WebElement reason = driver.findElement(By.id("sourceCode"));
        return Utils.isWebElementIsDisplayed(reason, 10);
    }

    /**
     * Helper method to verify if 'Privacy Notice' is displayed
     *
     * @return true/false
     */
    public static boolean isPrivacyNoticeDisplayed() throws Exception {
        WebElement privacyNotice = driver.findElement(By.linkText("Privacy Notice"));
        return Utils.isWebElementIsDisplayed(privacyNotice, 10);
    }

    /**
     * Helper method to verify if 'Next' button is displayed
     *
     * @return true/false
     */
    public static boolean isNextDisplayed() throws Exception {
        WebElement next = driver.findElement(By.id("next"));
        return Utils.isWebElementIsDisplayed(next, 10);
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
     * Helper method to set 'Email'
     */
    public static void setEmail(String email) throws Exception {
        WebElement emailField = driver.findElement(By.id("email"));
        Utils.typeText(emailField, email);
    }

    /**
     * Helper method to set 'ConfirmEmail'
     */
    public static void setConfirmEmail(String email) throws Exception {
        WebElement emailField = driver.findElement(By.id("confirmEmail"));
        Utils.typeText(emailField, email);
    }

    /**
     * Helper method to set 'Phone'
     */
    public static void setMainPhoneNumber(String number) throws Exception {
        WebElement phone = driver.findElement(By.id("phoneNight"));
        Utils.typeText(phone, number);
    }

    /**
     * Helper method to set 'No Motor Claims'
     */
    public static void clickNoMotorClaims() throws Exception {
        WebElement claim = driver.findElement(By.id("label_claimsFlag_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(claim);
        }
        Utils.clickWebElementJS(claim);
    }

    /**
     * Helper method to set 'No Motor Convictions'
     */
    public static void clickNoMotorConvictions() throws Exception {
        WebElement claim = driver.findElement(By.id("label_convictionsFlag_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(claim);
            Utils.clickWebElementJS(claim);
        } else {
        Utils.clickWebElementAfterWait(claim, 3);
        }
    }

    /**
     * Helper method to set 'No Additional Driver'
     */
    public static void clickNoAdditionalDriver() throws Exception {
        WebElement claim = driver.findElement(By.id("label_noOfAdditionalDrivers_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(claim);
            Utils.clickWebElementJS(claim);
        } else {
        Utils.clickWebElementAfterWait(claim, 3);
        }
    }

    /**
     * Helper method to set 'Yes Motor Claims'
     */
    public static void clickYesMotorClaims() throws Exception {
        WebElement claim = driver.findElement(By.id("label_claimsFlag_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(claim);
            Utils.clickWebElementJS(claim);
        } else {
        Utils.clickWebElementAfterWait(claim, 3);}
    }

    /**
     * Helper method to set 'Yes Motor Convictions'
     */
    public static void clickYesMotorConvictions() throws Exception {
        WebElement claim = driver.findElement(By.id("label_convictionsFlag_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(claim);
            Utils.clickWebElementJS(claim);
        } else {
        Utils.clickWebElementAfterWait(claim, 3);}
    }

    /**
     * Helper method to set 'Yes Additional Driver'
     */
    public static void clickYesAdditionalDriver() throws Exception {
        WebElement additionalDrivers = driver.findElement(By.id("label_noOfAdditionalDrivers_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(additionalDrivers);
            Utils.clickWebElementJS(additionalDrivers);
        } else {
        Utils.clickWebElementAfterWait(additionalDrivers, 3);}
    }

    /**
     * Helper method to set 'Additional Driver' as the main driver
     */
    public static void clickAdditionalDriverMainYes() throws Exception {
        WebElement additionalDrivers = driver.findElement(By.id("label_mainDriverFlag_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(additionalDrivers);
            Utils.clickWebElementJS(additionalDrivers);
        } else {
            Utils.clickWebElementAfterWait(additionalDrivers, 3);}
    }

    /**
     * Helper method to set 'Additional Driver' as not the main driver
     */
    public static void clickAdditionalDriverMainNo() throws Exception {
        WebElement additionalDrivers = driver.findElement(By.id("label_mainDriverFlag_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(additionalDrivers);
            Utils.clickWebElementJS(additionalDrivers);
        } else {
            Utils.clickWebElementAfterWait(additionalDrivers, 3);}
    }

    /**
     * Helper method to select the reason for visit
     */
    public static void selectReasonForVisit(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("sourceCode"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to populate all form fields within 'YouAndYourInsurance' page
     */
    public static void enterYourDetails() throws Exception {
        //Check for the Cookie Prompt and close if this is shown
        try {
            driver.switchTo().parentFrame();
            Utils.closeCookieBanner();
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            System.out.println("No cookie prompt was shown and therefore ignored");
        }

        selectTitle(MotorDataLoad.DataLoadVariables.sTitle);

        setFirstName(MotorDataLoad.DataLoadVariables.sFirstname);
        setLastName(MotorDataLoad.DataLoadVariables.sSurname);
        setEmail(MotorDataLoad.DataLoadVariables.sEmail);
        setConfirmEmail(MotorDataLoad.DataLoadVariables.sConfirmEmail);
        setMainPhoneNumber(MotorDataLoad.DataLoadVariables.sMainPhone);

        // Declare claims(Y or N)
        if (MotorDataLoad.DataLoadVariables.sClaims.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickYesMotorClaims();
        } else {
            clickNoMotorClaims();
        }

        // Declare convictions(Y or N)
        if (MotorDataLoad.DataLoadVariables.sConvictions.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickYesMotorConvictions();
        } else {
            clickNoMotorConvictions();
        }

        // Declare Additional Drivers (Y or N)
        if (MotorDataLoad.DataLoadVariables.sAdditionalDriver.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickYesAdditionalDriver();

            // Set the additional driver as the Main Driver? (Y or N)
            if (MotorDataLoad.DataLoadVariables.sMainDriver.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                clickAdditionalDriverMainYes();
            } else {
                clickAdditionalDriverMainNo();
            }

        } else {
            clickNoAdditionalDriver();
        }

        //What prompted your visit?zz
        selectReasonForVisit(MotorDataLoad.DataLoadVariables.sVisitReason);
    }

}
