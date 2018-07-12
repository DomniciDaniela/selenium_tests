package screens.motor;

import helpers.TestDataUtils;
import helpers.Utils;
import helpers.utility.ConfigLoad;
import helpers.utility.MotorDataLoad;
import helpers.utility.VehicleModsDataLoad;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static helpers.TestBase.driver;

public class AboutYourCar {
    /**
     * Helper method to wait for page to load
     */
    public static void waitForScreen() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.urlContains(TestDataUtils.PageURLs.ABOUT_YOUR_CAR));
    }

    /**
     * Helper method to select 'Legal Owner'
     */
    public static void selectLegalOwner(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("legalOwner"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to select 'RegisteredKeeper'
     */
    public static void selectRegiteredKeeper(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("registeredKeeper"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to select 'CarUsage'
     */
    public static void selectCarUsage(String dropdownValue) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("carUsage")));

        WebElement  element = driver.findElement(By.id("carUsage"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to select 'SecurityDevice'
     */
    public static void selectSecurityDevice(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("securityDevice"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to set 'CarValue'
     */
    public static void setCarValue(String carValue) throws Exception {
        WebElement value = driver.findElement(By.id("carValueRaw"));
        Utils.typeText(value, carValue);
    }

    /**
     * Helper method to click 'Tracking Device' - Yes flag
     */
    public static void clickTrackingDeviceYes() throws Exception {
        WebElement track = driver.findElement(By.id("label_trackerFitted_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(track);
            Utils.clickWebElementJS(track);
        } else {
            Utils.clickWebElementAfterWait(track, 3);
        }
    }

    /**
     * Helper method to click 'Tracking Device' - No flag
     */
    public static void clickTrackingDeviceNo() throws Exception {
        WebElement track = driver.findElement(By.id("label_trackerFitted_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(track);
            Utils.clickWebElementJS(track);
        } else {
            Utils.clickWebElementAfterWait(track, 3);
        }
    }

    /**
     * Helper method to select 'Car Mileage'
     */
    public static void selectCarMileage(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("annualMileage"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to click 'Car kept overnight' - Yes flag
     */
    public static void clickDifferentPostcodeYes() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("label_differentPostcode_0")));

        WebElement track = driver.findElement(By.id("label_differentPostcode_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(track);
            Utils.clickWebElementJS(track);
        } else {
            Utils.clickWebElementAfterWait(track, 3);
        }
    }

    /**
     * Helper method to click 'Car kept overnight' - No flag
     */
    public static void clickDifferentPostcodeNo() throws Exception {
       WebElement element = driver.findElement(By.id("label_differentPostcode_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Thread.sleep(200);
            Utils.moveToWebElement(element);
            Utils.clickWebElementJS(element);
        } else {
            Utils.clickWebElementAfterWait(element, 3);
        }
    }

    /**
     * Helper method to select 'OvernightLocation'
     */
    public static void selectOvernightLocation(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("overnightLocation"));
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
    public static void setPurchaseDate(String day, String month, String year) throws Exception {
        WebElement purchaseDay = driver.findElement(By.id("carPurchaseDate.day"));
        WebElement purchaseMonth = driver.findElement(By.id("carPurchaseDate.month"));
        WebElement purchaseYear = driver.findElement(By.id("carPurchaseDate.year"));
        Utils.typeText(purchaseDay, day);
        Utils.typeText(purchaseMonth, month);
        Utils.typeText(purchaseYear, year);
    }

    /**
     * Helper method to select 'CoverLevel'
     */
    public static void selectCoverLevel(String dropdownValue) throws Exception {
        WebElement  element = driver.findElement(By.id("coverRequired"));
        if (ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.SAFARI)) {
            Utils.setDropdownValueSafari(element, dropdownValue);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(dropdownValue);
        }
    }

    /**
     * Helper method to click 'Car Modified' - Yes flag
     */
    public static void clickCarModifiedYes() throws Exception {
        WebElement track = driver.findElement(By.id("hasMods_0"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(track);
            Utils.clickWebElementJS(track);
        } else {
            Utils.clickWebElementAfterWait(track, 3);
        }
    }

    /**
     * Helper method to click 'Car Modified' - No flag
     */
    public static void clickCarModifiedNo() throws Exception {
        WebElement track = driver.findElement(By.id("hasMods_1"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(track);
            Utils.clickWebElementJS(track);
        } else {
            Utils.clickWebElementAfterWait(track, 3);
        }
    }

    /**
     * Helper method to click 'Accessories'
     */
    public static void clickAccessories() throws Exception {
        WebElement mods = driver.findElement(By.id("modsAccordianPanel_container-1-label"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(mods);
            Utils.clickWebElementJS(mods);
        } else {
            Utils.clickWebElementAfterWait(mods, 3);
        }

    }

    /**
     * Helper method to click 'EngineTransmission'
     */
    public static void clickEngineTransmission() throws Exception {
        WebElement mods = driver.findElement(By.id("modsAccordianPanel_container-2-label"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(mods);
            Utils.clickWebElementJS(mods);
        } else {
            Utils.clickWebElementAfterWait(mods, 3);
        }
    }

    /**
     * Helper method to click 'Lighting'
     */
    public static void clickLighting() throws Exception {
        WebElement mods = driver.findElement(By.id("modsAccordianPanel_container-3-label"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(mods);
            Utils.clickWebElementJS(mods);
        } else {
            Utils.clickWebElementAfterWait(mods, 3);
        }
    }

    /**
     * Helper method to click 'Stickers'
     */
    public static void clickStickers() throws Exception {
        WebElement mods = driver.findElement(By.id("modsAccordianPanel_container-4-label"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(mods);
            Utils.clickWebElementJS(mods);
        } else {
            Utils.clickWebElementAfterWait(mods, 3);
        }

    }

    /**
     * Helper method to click 'Spoilers'
     */
    public static void clickSpoilers() throws Exception {
        WebElement mods = driver.findElement(By.id("modsAccordianPanel_container-5-label"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(mods);
            Utils.clickWebElementJS(mods);
        } else {
            Utils.clickWebElementAfterWait(mods, 3);
        }
    }

    /**
     * Helper method to click 'Suspension'
     */
    public static void clickSuspension() throws Exception {
        WebElement mods = driver.findElement(By.id("modsAccordianPanel_container-6-label"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(mods);
            Utils.clickWebElementJS(mods);
        } else {
            Utils.clickWebElementAfterWait(mods, 3);
        }
    }

    /**
     * Helper method to click 'Wheels'
     */
    public static void clickWheels() throws Exception {
        WebElement mods = driver.findElement(By.id("modsAccordianPanel_container-7-label"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(mods);
            Utils.clickWebElementJS(mods);
        } else {
            Utils.clickWebElementAfterWait(mods, 3);
        }
    }

    /**
     * Helper method to click 'Wheels'
     */
    public static void clickOther() throws Exception {
        WebElement mods = driver.findElement(By.id("modsAccordianPanel_container-8-label"));
        if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
            Utils.moveToWebElement(mods);
            Utils.clickWebElementJS(mods);
        } else {
            Utils.clickWebElementAfterWait(mods, 3);
        }

    }

    /**
     * Helper method to select Accessories
     */
    public static void selectAccessories() throws Exception {
        if (VehicleModsDataLoad.VehicleModVariables.sAirCon.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod52"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sPedalConfig.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod170"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sBullBars.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod6"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sCarPhones.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod7"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sDashboard.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod9"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sHandControls.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod18"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sLockingWheelNuts.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod21"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sParkingSensors.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod112"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sRemovedSeats.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod172"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sReplacementSeats.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod30"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sRoofRack.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod166"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sSatNav.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod72"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sSportsSteeringWheel.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod32"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sSunroof.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod36"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sTintedWindows.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod77"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sTowbar.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod39"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sUpholsteryChanges.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod42"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sWheelchairClamps.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod174"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else {
            WebElement mods = driver.findElement(By.id("mod175"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        }
    }

    /**
     * Helper method to select EngineTransmission
     */
    public static void selectEngineTransmission() throws Exception {
        if (VehicleModsDataLoad.VehicleModVariables.sAirFilter.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod53"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sBlueprinting.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod3"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
            Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sBoredOutEngine.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod5"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sChipping.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod8"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sExhaustSystem.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod13"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sGearingChange.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod57"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sLPGConversion.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod69"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sMiscEngineAlterations.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod22"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sNitrous.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod61"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sNonStandardEngine.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod24"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sStandardEngineReplacement.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod34"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sSupercharging.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod37"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sTransmissionChanges.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod40"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else {
            WebElement mods = driver.findElement(By.id("mod41"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        }
    }

    /**
     * Helper method to select Lighting
     */
    public static void selectLighting() throws Exception {
        if (VehicleModsDataLoad.VehicleModVariables.sDrivingLights.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod11"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sFogLamps.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod16"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sHighLevelBrakeLights.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod19"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sRallyLights.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod26"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else {
            WebElement mods = driver.findElement(By.id("mod33"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        }
    }

    /**
     * Helper method to select Lighting
     */
    public static void selectStickers() throws Exception {
        if (VehicleModsDataLoad.VehicleModVariables.sBadgesShowingSpeed.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod48"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sDecals.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod10"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sMurals.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod23"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sNonStandardPaintWork.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod62"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
            Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sNonStandardRespray.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod25"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
            Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sSignWriting.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod125"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else {
            WebElement mods = driver.findElement(By.id("mod35"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        }
    }

    /**
     * Helper method to select Spoiler Modifications
     */
    public static void selectSpoilerModification() throws Exception {
        if (VehicleModsDataLoad.VehicleModVariables.sAdditionalWindows.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod51"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sBodyKit.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod49"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sBonnetBulge.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod4"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sFlaredWheelArches.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod14"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sFlaredWings.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod15"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sFrontSpoiler.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod17"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sRearBootSpoiler.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod28"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sRearRoofSpoiler.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod27"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sRearValance.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod29"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sSideSkirts.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod31"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else {
            WebElement mods = driver.findElement(By.id("mod173"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        }
    }

    /**
     * Helper method to select Suspension
     */
    public static void selectSuspension() throws Exception {
        if (VehicleModsDataLoad.VehicleModVariables.sDualControls.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod12"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sSuspensionChanges.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod38"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
            Utils.clickWebElementAfterWait(mods, 3);
            }
        } else {
            WebElement mods = driver.findElement(By.id("mod43"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        }
    }

    /**
     * Helper method to select Lighting
     */
    public static void selectWheels() throws Exception {
        if (VehicleModsDataLoad.VehicleModVariables.sAlloyWheelsAftermarket.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod58"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sAlloyWheelsManufacturerUpgrade.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod59"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sWheelSpacers.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod153"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sWheelTrims.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod45"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else if (VehicleModsDataLoad.VehicleModVariables.sWheelsTyres.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod46"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        } else {
            WebElement mods = driver.findElement(By.id("mod47"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        }
    }

    /**
     * Helper method to select Other
     */
    public static void selectOther() throws Exception {
        if (VehicleModsDataLoad.VehicleModVariables.sOtherNotListed.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            WebElement mods = driver.findElement(By.id("mod171"));
            if (ConfigLoad.ConfigLoadVariables.sResponsiveMode.equalsIgnoreCase(TestDataUtils.Flags.YES) && ConfigLoad.ConfigLoadVariables.sBrowser.equalsIgnoreCase(TestDataUtils.Browser.CHROME)) {
                Utils.moveToWebElement(mods);
                Utils.clickWebElementJS(mods);
            } else {
                Utils.clickWebElementAfterWait(mods, 3);
            }
        }
    }

    /**
     * Helper method to populate all form fields within 'AboutYourCar' page
     */
    public static void enterCarDetails() throws Exception {
        selectLegalOwner(MotorDataLoad.DataLoadVariables.sLegalOwner);
        selectRegiteredKeeper(MotorDataLoad.DataLoadVariables.sRegisteredKeeper);
        Thread.sleep(500); // for the emulator
        selectCarUsage(MotorDataLoad.DataLoadVariables.sCarUse);
        selectSecurityDevice(MotorDataLoad.DataLoadVariables.sSecurityDevicesFitted);
        setCarValue(MotorDataLoad.DataLoadVariables.sEstimatedValue);

        // Declare tracker fitted (Y or N)
        if (MotorDataLoad.DataLoadVariables.sTrackerFitted.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickTrackingDeviceYes();
        } else {
            clickTrackingDeviceNo();
        }

        selectCarMileage(MotorDataLoad.DataLoadVariables.sEstimatedMileage);

        // Declare overnight car keeping (Y or N)
        if (MotorDataLoad.DataLoadVariables.sDifferentPostcodeOvernight.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickDifferentPostcodeYes();
        } else {
            clickDifferentPostcodeNo();
        }

        selectOvernightLocation(MotorDataLoad.DataLoadVariables.sOvernightLocation);
        setPurchaseDate(MotorDataLoad.DataLoadVariables.sPurchaseDay, MotorDataLoad.DataLoadVariables.sPurchaseMonth, MotorDataLoad.DataLoadVariables.sPurchaseYear);

        selectCoverLevel(MotorDataLoad.DataLoadVariables.sCoverLevel);

        // Declare car modifications(Y or N)
        if (MotorDataLoad.DataLoadVariables.sCarModifiedFlag.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            clickCarModifiedYes();

            if (VehicleModsDataLoad.VehicleModVariables.sAccessories.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                clickAccessories();
                selectAccessories();
            } else if (VehicleModsDataLoad.VehicleModVariables.sEngineTransmission.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                clickEngineTransmission();
                selectEngineTransmission();
            } else if (VehicleModsDataLoad.VehicleModVariables.sLighting.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                clickLighting();
                selectLighting();
            } else if (VehicleModsDataLoad.VehicleModVariables.sPaintworkStickers.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                clickStickers();
                selectStickers();
            } else if (VehicleModsDataLoad.VehicleModVariables.sSpoilersBodyMods.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                clickSpoilers();
                selectSpoilerModification();
            } else if (VehicleModsDataLoad.VehicleModVariables.sSuspensionSteeringBrakes.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                clickSuspension();
                selectSuspension();
            } else if (VehicleModsDataLoad.VehicleModVariables.sWheelsTyres.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                clickWheels();
                selectWheels();
            } else if (VehicleModsDataLoad.VehicleModVariables.sOther.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                clickOther();
                selectOther();
            }

        } else {
            clickCarModifiedNo();
        }
    }

}
