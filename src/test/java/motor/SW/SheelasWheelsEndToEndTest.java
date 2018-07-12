package motor.SW;

import helpers.TestBase;
import helpers.TestDataUtils;
import helpers.Utils;
import helpers.utility.ConfigLoad;
import helpers.utility.MotorDataLoad;
import helpers.utility.VehicleModsDataLoad;
import home.GenerateQuotes;
import org.junit.Test;

import static helpers.utility.ConfigLoad.ConfigLoadVariables.sBrowser;

public class SheelasWheelsEndToEndTest extends TestBase {

    // https://myesure.atlassian.net/browse/QBB-1 - Dynamic Pricing - Removal of Recalculate button
    @Test
    public void testGenerateMotorQuote_SW_StandardQuote_NoRegistration_NoAdditionalDrivers_NoConviction_NoClaim() throws Exception {
        // Load data
        MotorDataLoad.loadData(driver, 2);

        // Open browser
        launchBrowser(sBrowser);

        // Navigate to insurance page
        if (ConfigLoad.ConfigLoadVariables.sIsDev.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_MOTOR_DEV);
        } else {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_MOTOR);
        }

        // Test verification
        GenerateQuotes.generateMotorQuote(false);
    }

    @Test
    public void testGenerateMotorQuote_SW_StandardQuote_1Conviction_NoClaim() throws Exception {
        // Load data
        MotorDataLoad.loadData(driver, 3);

        // Open browser
        launchBrowser(sBrowser);

        // Navigate to insurance page
        if (ConfigLoad.ConfigLoadVariables.sIsDev.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_MOTOR_DEV);
        } else {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_MOTOR);
        }

        // Test verification
        GenerateQuotes.generateMotorQuote(true);
    }

    @Test
    public void testGenerateMotorQuote_SW_StandardQuote_1AdditionalDriver_1Claim_1Conviction() throws Exception {
        // Load data
        MotorDataLoad.loadData(driver, 4);

        // Open browser
        launchBrowser(sBrowser);

        // Navigate to insurance page
        if (ConfigLoad.ConfigLoadVariables.sIsDev.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_MOTOR_DEV);
        } else {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_MOTOR);
        }

        // Test verification
        GenerateQuotes.generateMotorQuote(true);
    }

    @Test
    public void testGenerateMotorQuote_SW_StandardQuote_NoClaim_NoConviction_1AdditionalDriver_MainDriverNo() throws Exception {
        // Load data
        MotorDataLoad.loadData(driver, 5);

        // Open browser
        launchBrowser(sBrowser);

        // Navigate to insurance page
        if (ConfigLoad.ConfigLoadVariables.sIsDev.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_MOTOR_DEV);
        } else {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_MOTOR);
        }
        // Test verification
        GenerateQuotes.generateMotorQuote(true);
    }

    @Test
    public void testGenerateMotorQuote_SW_CarModifiedYes_WheelsModifications() throws Exception {
        // Load data
        MotorDataLoad.loadData(driver, 6);
        VehicleModsDataLoad.loadData(driver, 2);

        // Open browser
        launchBrowser(sBrowser);

        // Navigate to insurance page
        if (ConfigLoad.ConfigLoadVariables.sIsDev.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_MOTOR_DEV);
        } else {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_MOTOR);
        }

        // Test verification
        GenerateQuotes.generateMotorQuote(false);
    }

    @Test
    public void testGenerateMotorQuote_SW_CarModifiedYes_AccessoriesAdded() throws Exception {
        // Load data
        MotorDataLoad.loadData(driver, 9);
        VehicleModsDataLoad.loadData(driver, 9);

        // Open browser
        launchBrowser(sBrowser);

        // Navigate to insurance page
        if (ConfigLoad.ConfigLoadVariables.sIsDev.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_MOTOR_DEV);
        } else {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_MOTOR);
        }

        // Test verification
        GenerateQuotes.generateMotorQuote(true);
    }
}
