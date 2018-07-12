package screens.motor;

import helpers.TestDataUtils;
import helpers.Utils;
import helpers.utility.ConfigLoad;
import helpers.utility.MotorDataLoad;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static helpers.TestBase.driver;

public class AboutYourConvictions {

    /**
     * Helper method to wait for page to load
     */
    public static void waitForScreen() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(TestDataUtils.PageURLs.ABOUT_YOUR_CONVICTIONS));
    }

    /**
     * Helper method to set 'Conviction code'
     */
    public static void setConvictionCode(String code) throws Exception {
        WebElement conviction = driver.findElement(By.id("conviction"));
        Utils.typeText(conviction, code);
    }
    /**
     * Helper method to set the claim date
     */
    public static void convictionDate(String day, String month, String year) throws Exception {
        WebElement doc = driver.findElement(By.id("convictionDate.day"));
        WebElement moc = driver.findElement(By.id("convictionDate.month"));
        WebElement yoc = driver.findElement(By.id("convictionDate.year"));
        Utils.typeText(doc, day);
        Utils.typeText(moc, month);
        Utils.typeText(yoc, year);
    }

    /**
     * Helper method to set 'Penalty points '
     */
    public static void setPenaltyPoints(String points) throws Exception {
        WebElement penaltyPoints = driver.findElement(By.id("penaltyPoints"));
        Utils.typeText(penaltyPoints, points);
    }

    /**
     * Helper method to set 'Ban length'
     */
    public static void setBanLength(String months) throws Exception {
        WebElement months1 = driver.findElement(By.id("banLength"));
        Utils.typeText(months1, months);
    }

    /**
     * Helper method to click 'Conviction Clear' button
     */
    public static void clickConvictionClearButton() throws Exception {
        WebElement clear = driver.findElement(By.id("clearConvictionButton"));
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
        WebElement save = driver.findElement(By.id("addConvictionButton"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(save);
            Utils.clickWebElementJS(save);
        } else {
            Utils.clickWebElementAfterWait(save, 3);
        }
    }

    public static void enterConvictionDetails() throws Exception {
        setConvictionCode(MotorDataLoad.DataLoadVariables.sMD1ConvictionCode);
        convictionDate(MotorDataLoad.DataLoadVariables.sMD1ConvictionDay, MotorDataLoad.DataLoadVariables.sMD1ConvictionMonth, MotorDataLoad.DataLoadVariables.sMD1ConvictionYear);
        setPenaltyPoints(MotorDataLoad.DataLoadVariables.sMD1PenaltyPoints);
        setBanLength(MotorDataLoad.DataLoadVariables.sMD1BanLength);

        clickConvictionSaveButton();
    }
}
