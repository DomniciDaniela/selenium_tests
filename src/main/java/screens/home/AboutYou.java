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

public class AboutYou {

    /**
     * Helper method to wait for page to load
     */
    public static void waitForScreen() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(TestDataUtils.PageURLs.ABOUT_YOU));
    }

    /**
     * Helper method to select 'Title'
     */
    public static void selectTitle(String dropdownValue) throws Exception {
        Select dropdown = new Select(driver.findElement(By.id("title")));
        dropdown.selectByVisibleText(dropdownValue);
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
            Utils.clickWebElementAfterWait(gender, 2);
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
            Utils.clickWebElementAfterWait(gender, 2);
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
     * Helper method to select 'MaritalStatus'
     */
    public static void selectMaritalStatus(String dropdownValue) throws Exception {
        Select dropdown = new Select(driver.findElement(By.id("maritalStatus")));
        dropdown.selectByVisibleText(dropdownValue);
    }

    /**
     * Helper method to set 'Occupation'
     */
    public static void setOcupation(String ocupation) throws Exception {
        WebElement occupationOther = driver.findElement(By.id("occupation"));
        Utils.typeText(occupationOther, ocupation);
    }

    /**
     * Helper method to set 'Phone'
     */
    public static void setMainPhoneNumber(String number) throws Exception {
        WebElement phone = driver.findElement(By.id("phoneNight"));
        Utils.typeText(phone, number);
    }

    /**
     * Helper method to set 'Additional Phone'
     */
    public static void setAdditionalPhoneNumber(String number) throws Exception {
        WebElement phone = driver.findElement(By.id("phoneDay"));
        Utils.typeText(phone, number);
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
     * Helper method to click 'First Buyer' - Yes flag
     */
    public static void clickFirstBuyerYes() throws Exception {
        WebElement buyer = driver.findElement(By.id("areYouAFirstTimeBuyerFlag_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(buyer);
            Utils.clickWebElementJS(buyer);
        } else {
            Utils.clickWebElementAfterWait(buyer, 2);
        }
    }

    /**
     * Helper method to click 'First Buyer' - No flag
     */
    public static void clickFirstBuyerNo() throws Exception {
        WebElement buyer = driver.findElement(By.id("areYouAFirstTimeBuyerFlag_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(buyer);
            Utils.clickWebElementJS(buyer);
        } else {
            Utils.clickWebElementAfterWait(buyer, 2);
        }
    }

    /**
     * Helper method to set 'Cover Start Date'
     */
    public static void setCoverStartDate(String day, String month, String year) throws Exception {
        WebElement doc = driver.findElement(By.id("coverStartDate.day"));
        WebElement moc = driver.findElement(By.id("coverStartDate.month"));
        WebElement yoc = driver.findElement(By.id("coverStartDate.year"));
        Utils.typeText(doc, day);
        Utils.typeText(moc, month);
        Utils.typeText(yoc, year);
    }

    /**
     * Helper method to click 'Previous Flood Claim' - Yes flag
     */
    public static void clickPreviousFloodClaimYes() throws Exception {
        WebElement claim = driver.findElement(By.id("previousFloodClaimFlag_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(claim);
            Utils.clickWebElementJS(claim);
        } else {
            Utils.clickWebElementAfterWait(claim, 2);
        }
    }

    /**
     * Helper method to click 'Previous Flood Claim' - No flag
     */
    public static void clickPreviousFloodClaimNo() throws Exception {
        WebElement claim = driver.findElement(By.id("previousFloodClaimFlag_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(claim);
            Utils.clickWebElementJS(claim);
        } else {
            Utils.clickWebElementAfterWait(claim, 2);
        }
    }

    /**
     * Helper method to click 'Previous Subsidence Claim' - Yes flag
     */
    public static void clickPreviousSubsidenceClaimYes() throws Exception {
        WebElement claim = driver.findElement(By.id("previousSubsidenceClaimFlag_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(claim);
            Utils.clickWebElementJS(claim);
        } else {
            Utils.clickWebElementAfterWait(claim, 2);
        }
    }

    /**
     * Helper method to click 'Previous Subsidence Claim' - No flag
     */
    public static void clickPreviousSubsidenceClaimNo() throws Exception {
        WebElement claim = driver.findElement(By.id("previousSubsidenceClaimFlag_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(claim);
            Utils.clickWebElementJS(claim);
        } else {
            Utils.clickWebElementAfterWait(claim, 2);
        }
    }

    /**
     * Helper method to select 'Number of Claims'
     */
    public static void selectNumberOfClaims(String dropdownValue) throws Exception {
        Select dropdown = new Select(driver.findElement(By.id("numClaims")));
        dropdown.selectByVisibleText(dropdownValue);
    }

    /**
     * Helper method to click 'Joint Policy Holder' - Yes flag
     */
    public static void clickJointPolicyHolderYes() throws Exception {
        WebElement claim = driver.findElement(By.id("jointPolicyholder_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(claim);
            Utils.clickWebElementJS(claim);
        } else {
            Utils.clickWebElementAfterWait(claim, 2);
        }
    }

    /**
     * Helper method to click 'Joint Policy Holder' - No flag
     */
    public static void clickJointPolicyHolderNo() throws Exception {
        WebElement claim = driver.findElement(By.id("jointPolicyholder_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(claim);
            Utils.clickWebElementJS(claim);
        } else {
            Utils.clickWebElementAfterWait(claim, 2);
        }
    }

    /**
     * Helper method to select the reason for visit
     */
    public static void selectReasonForVisit(String dropdownValue) throws Exception {
        Utils.scrollIntoViewJS(driver.findElement(By.id("sourceCode")));

        Select dropdown = new Select(driver.findElement(By.id("sourceCode")));
        dropdown.selectByVisibleText(dropdownValue);
    }

    /**
     * Helper method to click 'Confirm Assumptions' - Yes flag
     */
    public static void clickConfirmAssumptionsYes() throws Exception {
        WebElement claim = driver.findElement(By.id("confirmAssumptionsFlag_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(claim);
            Utils.clickWebElementJS(claim);
        } else {
            Utils.clickWebElementAfterWait(claim, 2);
        }
    }

    /**
     * Helper method to click 'Confirm Assumptions' - No flag
     */
    public static void clickConfirmAssumptionsNo() throws Exception {
        WebElement claim = driver.findElement(By.id("confirmAssumptionsFlag_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(claim);
            Utils.clickWebElementJS(claim);
        } else {
            Utils.clickWebElementAfterWait(claim, 2);
        }
    }

    /**
     * Helper method to enter details within "About you" page
     */

    /**
     * Helper method to populate all form fields within 'AboutYou' page
     */
    public static void enterYourDetails() throws Exception {
        selectTitle(HomeDataLoad.DataLoadVariables.sTitle);

        // Check for the Cookie Prompt and close if this is shown
        try {
            driver.switchTo().parentFrame();
            Utils.closeCookieBanner();
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            System.out.println("No cookie prompt was shown and therefore ignored");
        }

        setFirstName(HomeDataLoad.DataLoadVariables.sFirstname);
        setLastName(HomeDataLoad.DataLoadVariables.sSurname);

        // Select gender (M or F)
        if (HomeDataLoad.DataLoadVariables.sGender.equalsIgnoreCase(TestDataUtils.Flags.MALE)) {
            clickGenderMale();
        } else {
            clickGenderFemale();
        }

        setBirthday(HomeDataLoad.DataLoadVariables.sDOBday, HomeDataLoad.DataLoadVariables.sDOBmonth, HomeDataLoad.DataLoadVariables.sDOByear);
        selectMaritalStatus(HomeDataLoad.DataLoadVariables.sMaritalStatus);
        setOcupation(HomeDataLoad.DataLoadVariables.sOccupation);
        setMainPhoneNumber(HomeDataLoad.DataLoadVariables.sMainPhone);
        setAdditionalPhoneNumber(HomeDataLoad.DataLoadVariables.sAdditionalPhone);
        setEmail(HomeDataLoad.DataLoadVariables.sEmail);
        setConfirmEmail(HomeDataLoad.DataLoadVariables.sConfirmEmail);

        Utils.setPostCode(HomeDataLoad.DataLoadVariables.sPostCode);
        Utils.clickFindAddress();
        Utils.selectAddress(HomeDataLoad.DataLoadVariables.sFullAddress);

        // First buyer? (Y or N)
        if (HomeDataLoad.DataLoadVariables.sFirstBuyer.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickFirstBuyerYes();
        } else {
            clickFirstBuyerNo();
        }

        // Flood claims (Y or N)
        if (HomeDataLoad.DataLoadVariables.sFloodClaims.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickPreviousFloodClaimYes();
        } else {
            clickPreviousFloodClaimNo();
        }

        // Subsidence claims (Y or N)
        if (HomeDataLoad.DataLoadVariables.sSubsidenceClaims.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickPreviousSubsidenceClaimYes();
        } else {
            clickPreviousSubsidenceClaimNo();
        }

        selectNumberOfClaims(HomeDataLoad.DataLoadVariables.sHomeClaims);

        // Joint Holder (Y or N)
        if (HomeDataLoad.DataLoadVariables.sJointPolicyHolder.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickJointPolicyHolderYes();
        } else {
            clickJointPolicyHolderNo();
        }

        selectReasonForVisit(HomeDataLoad.DataLoadVariables.sVisitReason);

        clickConfirmAssumptionsYes();
    }
}