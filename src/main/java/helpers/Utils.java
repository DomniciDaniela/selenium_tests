package helpers;

import helpers.utility.ConfigLoad;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static helpers.TestBase.driver;

public class Utils {

    /**
     * Helper method to wait for a given webElement and check it's displayed
     *
     * @param webElement        - WebElement webElement
     * @param waitTimeInSeconds - number of seconds to wait the webElement
     * @return - true or false
     */
    public static boolean isWebElementIsDisplayed(WebElement webElement, int waitTimeInSeconds) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, waitTimeInSeconds);
        wait.until(ExpectedConditions.visibilityOf(webElement));

        return webElement.isDisplayed();
    }

    /**
     * Helper method to wait for a given webElement and click it after it's displayed
     *
     * @param webElement        - WebElement webElement
     * @param waitTimeInSeconds - number of seconds to wait the object
     */
    public static void clickWebElementAfterWait(WebElement webElement, int waitTimeInSeconds) throws Exception {
        if (isWebElementIsDisplayed(webElement, waitTimeInSeconds)) {
            webElement.click();
        } else {
            throw new Exception("Cannot find WebElement " + webElement);
        }
    }

    /**
     * Helper method to type text on a given element
     *
     * @param webElement - WebElement webElement
     * @param text       - text to be typed
     */
    public static void typeText(WebElement webElement, String text) throws Exception {
        if (webElement.isDisplayed()) {
            webElement.clear();
            webElement.sendKeys(text);
        } else {
            throw new Exception("Cannot find the WebElement " + webElement);
        }
    }

    /**
     * Helper method to wait for a given webElement and type the given text after it's displayed
     *
     * @param webElement        - WebElement webElement
     * @param text              - text to be typed
     * @param waitTimeInSeconds - number of seconds to wait the webElement
     */
    public static void typeTextAfterWait(WebElement webElement, int waitTimeInSeconds, String text) throws Exception {
        if (isWebElementIsDisplayed(webElement, waitTimeInSeconds)) {
            webElement.clear();
            webElement.sendKeys(text);
        } else {
            throw new Exception("Cannot find the WebElement " + webElement);
        }
    }

    /**
     * Helper method to wait for a given webElement and get text after it's displayed
     *
     * @param webElement        - WebElement webElement
     * @param waitTimeInSeconds - number of seconds to wait the webElement
     */
    public static String getTextAfterWait(WebElement webElement, int waitTimeInSeconds) throws Exception {
        if (isWebElementIsDisplayed(webElement, waitTimeInSeconds)) {
            return webElement.getText();
        } else {
            throw new Exception("Cannot find the WebElement " + webElement);
        }
    }

    /**
     * Helper method to navigate to a specific page
     */
    public static void navigatoTo(String url) throws Exception {
        driver.navigate().to(url);
    }

    /**
     * Helper method to click 'Next' button
     */
    public static void clickNext() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("next")));

        WebElement next = driver.findElement(By.id("next"));
        try {
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) &&
                    ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.clickWebElementJS(next);
            } else {
                Utils.clickWebElementAfterWait(next, 3);
            }
        } catch (Exception e) {
            Utils.clickWebElementAfterWait(next, 3);
        }
    }

    /**
     * Helper method to click 'Next' button
     */
    public static void clickAltNext() throws Exception {
        WebElement next = driver.findElement(By.cssSelector("#next_alt"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) &&
                ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.clickWebElementJS(next);
        } else {
            Utils.clickWebElementAfterWait(next, 3);
        }
    }

    /**
     * Helper method to click 'Next' button
     */
    public static void clickADNext() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("add_driver_next_false")));

        WebElement next = driver.findElement(By.id("add_driver_next_false"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) &&
                ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.clickWebElementJS(next);
        } else {
            Utils.clickWebElementAfterWait(next, 3);
        }
    }

    /**
     * Helper method to click 'Back' button
     */
    public static void clickBack() throws Exception {
        WebElement next = driver.findElement(By.id("back"));
        clickWebElementAfterWait(next, 3);
    }

    /**
     * Helper method to click Escape
     */
    public static void clickEscape() throws Exception {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).build().perform();
    }

    /**
     * Helper method to scroll to element using JS
     */
    public static void scrollIntoViewJS(WebElement element) throws Exception {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    /**
     * Helper method to scroll to element using JS
     */
    public static void clickWebElementJS(WebElement element) throws Exception {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", element);
    }

    /**
     * Helper method to click 'No Thanks' button
     */
    public static void clickNoThanks() throws Exception {
        WebElement button = driver.findElement(By.id("noThanksButton"));
        clickWebElementJS(button);
    }

    /**
     * Helper method to click 'Yes please' button
     */
    public static void clickYesPlease() throws Exception {
        WebElement button = driver.findElement(By.id("yesPleaseButton"));
        clickWebElementAfterWait(button, 2);
    }

    /**
     * Helper method to get the monthly cost
     */
    public static String getMonthlyCost() throws Exception {
        WebElement cost = driver.findElement(By.id("premiumAmountInstallments"));
        return getTextAfterWait(cost, 10);
    }

    /**
     * Helper method to get the annual cost
     */
    public static String getAnnualCost() throws Exception {
        WebElement cost = driver.findElement(By.id("premiumAmount"));
        return getTextAfterWait(cost, 10);
    }

    /**
     * Helper method to close cookie
     */
    public static void closeCookieBanner() throws Exception {
        WebElement element = driver.findElement(By.id("ensCloseBanner"));
        Utils.clickWebElementJS(element);
    }

    /**
     * Helper method to click 'Find Address' button
     */
    public static void clickFindAddress() throws Exception {
        WebElement findButton = driver.findElement(By.id("findAddress"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            moveToWebElement(findButton);
            clickWebElementJS(findButton);
        } else {
            clickWebElementAfterWait(findButton, 2);
        }
    }

    /**
     * Helper method to select 'Address'
     */
    public static void selectAddress(String dropdownValue) throws Exception {
        WebElement element = driver.findElement(By.id("addressList"));
        moveToWebElement(element);
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(dropdownValue);
    }

    /**
     * Helper method to set 'PostCode'
     */
    public static void setPostCode(String postCode) throws Exception {
        WebElement code = driver.findElement(By.id("postCode"));
        Utils.typeTextAfterWait(code, 3, postCode);
    }

    /**
     * Helper method to click 'Close' button
     */
    public static void clickCloseButton() throws Exception {
        WebElement button;
        try{
            button = driver.findElement(By.cssSelector("#context-help-testPopUp-panel > div:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"));
            clickWebElementJS(button);
        } catch (Exception e) {
            button = driver.findElement(By.cssSelector("#context-help-possessionPopUp-panel > div:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"));
            clickWebElementJS(button);
        }
    }

    /**
     * Helper method to click 'Continue' button
     */
    public static void clickContinueButton() throws Exception {
        WebElement button = driver.findElement(By.id("confirmContinue"));
        clickWebElementJS(button);
    }

    /**
     * Helper method to move to the element
     *
     * @param element
     */
    public static void moveToWebElement(WebElement element) {
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
    }

    /**
     * Helper method to set the dropdown value on Safari
     *
     * @param element
     */
    public static void setDropdownValueSafari(WebElement element, String dropdownValue) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        try {
            executor.executeScript("const textToFind = '" + dropdownValue + "';" +
                    "const dd = arguments[0];" +
                    "dd.selectedIndex = [...dd.options].findIndex (option => option.text === textToFind);", element);
        } catch (Exception e) {
            executor.executeScript("arguments[0].selectedIndex=" + 6 + ";", element);
        }
    }
}
