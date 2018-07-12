package helpers.utility;


import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class ConfigLoad {

    public static class ConfigLoadVariables {

        // Main Driver Variables
        public static String sEnvironment = null;
        public static String sIsDev = null;
        public static String sBrowser = null;
        public static String sResponsiveMode = null;
        public static String sEmulator = null;
    }

    public static void loadConfig(WebDriver driver, Integer iRecordNumber) throws Exception {

        //Re-Initialise the data array
        ArrayList<String> DataArray = DataArrayPool.DataArray("TestConfig").get(iRecordNumber);

        //Customer Details
        ConfigLoadVariables.sEnvironment = DataArray.get(0);
        ConfigLoadVariables.sIsDev = DataArray.get(1);
        ConfigLoadVariables.sBrowser = DataArray.get(2);
        ConfigLoadVariables.sResponsiveMode = DataArray.get(3);
        ConfigLoadVariables.sEmulator = DataArray.get(4);
    }

}
