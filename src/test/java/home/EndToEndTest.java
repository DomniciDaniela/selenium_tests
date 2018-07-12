package home;

import helpers.TestBase;
import helpers.TestDataUtils;
import helpers.Utils;
import helpers.utility.ConfigLoad;
import helpers.utility.HomeDataLoad;
import org.junit.Test;

import static helpers.utility.ConfigLoad.ConfigLoadVariables.sBrowser;

public class EndToEndTest extends TestBase {

    // https://myesure.atlassian.net/browse/QBB-1 - Dynamic Pricing - Removal of Recalculate button
    @Test
    public void testGenerateHomeQuote_Esure_NoJoint_NoBuildingCover_NoSpecialItem() throws Exception {
        HomeDataLoad.loadData(driver, 2);

        // Open browser
        launchBrowser(sBrowser);

        // Navigate to insurance page
        if (ConfigLoad.ConfigLoadVariables.sIsDev.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            Utils.navigatoTo(TestDataUtils.WebApplications.ESURE_HOME_DEV);
        } else {
            Utils.navigatoTo(TestDataUtils.WebApplications.ESURE_HOME);
        }

        // Test verification
        GenerateQuotes.generateHomeQuote(true);
    }

    @Test
    public void testGenerateHomeQuote_Esure_JointAdded_NoBuildingCover_NoSpecialItem() throws Exception {
        HomeDataLoad.loadData(driver, 3);

        // Open browser
        launchBrowser(sBrowser);

        // Navigate to insurance page
        if (ConfigLoad.ConfigLoadVariables.sIsDev.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            Utils.navigatoTo(TestDataUtils.WebApplications.ESURE_HOME_DEV);
        } else {
            Utils.navigatoTo(TestDataUtils.WebApplications.ESURE_HOME);
        }

        // Test verification
        GenerateQuotes.generateHomeQuote(false);
    }

    @Test
    public void testGenerateHomeQuote_SW_NoJoint_NoBuildingCover_NoSpecialItem() throws Exception {
        HomeDataLoad.loadData(driver, 2);

        // Open browser
        launchBrowser(sBrowser);
      // Navigate to insurance page
       if (ConfigLoad.ConfigLoadVariables.sIsDev.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_HOME_DEV);
       } else {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_HOME);
        }

        // Test verification
        GenerateQuotes.generateHomeQuote(true);
    }

    @Test
    public void testGenerateHomeQuote_SW_JointAdded_NoBuildingCover_NoSpecialItem() throws Exception {
        HomeDataLoad.loadData(driver, 3);

        // Open browser
        launchBrowser(sBrowser);

        // Navigate to insurance page
        if (ConfigLoad.ConfigLoadVariables.sIsDev.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_HOME_DEV);
        } else {
            Utils.navigatoTo(TestDataUtils.WebApplications.SHEILAS_WHEELS_HOME);
        }

        // Test verification
        GenerateQuotes.generateHomeQuote(false);
    }
}
