package screens.motor;

import helpers.TestDataUtils;
import helpers.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static helpers.TestBase.driver;

public class MoreDetails {

    /**
     * Helper method to wait for page to load
     */
    public static void waitForScreen() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(TestDataUtils.PageURLs.MORE_DETAILS));
    }

    /**
     * Helper method to set 'Registration Number'
     */
    public static void setRegistrationNumber(String number) throws Exception {
        WebElement registration = driver.findElement(By.id("registrationNumber"));
        Utils.typeText(registration, number);
    }
}
