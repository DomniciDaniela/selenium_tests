package screens.home;

import helpers.TestDataUtils;
import helpers.Utils;
import helpers.utility.ConfigLoad;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static helpers.TestBase.driver;

public class QuoteDetails {

    /**
     * Helper method to wait for page to load
     */
    public static void waitForScreen() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(TestDataUtils.PageURLs.QUOTE_DETAILS));
    }

    /**
     * Helper method to comfirm the details provided
     */
    public static void clickCorrectDeclaration() throws Exception {
        WebElement element = driver.findElement(By.id("detailsCorrectDeclaration"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 2);
        }
    }

    /**
     * Helper method to agree terms and conditions
     */
    public static void clickTermsAndConditions() throws Exception {
        WebElement element = driver.findElement(By.id("confirmDetailsFlag"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 2);
        }
    }
}
