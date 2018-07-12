package screens.motor;

import helpers.TestDataUtils;
import helpers.Utils;
import helpers.utility.ConfigLoad;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static helpers.TestBase.driver;

public class ChooseMainDriver {

    /**
     * Helper method to wait for page to load
     */
    public static void waitForScreen() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(TestDataUtils.PageURLs.CHOOSE_MAIN_DRIVER));
    }
    /**
     * Helper method to select the main driver
     */
    public static void clickMainDriver1() throws Exception {
        WebElement mainDriver = driver.findElement(By.id("chooseMainDriver_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(mainDriver);
            Utils.clickWebElementJS(mainDriver);
        } else {
            Utils.clickWebElementAfterWait(mainDriver, 3);
        }
    }

}
