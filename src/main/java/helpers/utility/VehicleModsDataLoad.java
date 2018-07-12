package helpers.utility;


import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class VehicleModsDataLoad {

    public static class VehicleModVariables {
        //Main Driver Variables
        public static String sAccessories = null;
        public static String sEngineTransmission = null;
        public static String sLighting = null;
        public static String sPaintworkStickers = null;
        public static String sSpoilersBodyMods = null;
        public static String sSuspensionSteeringBrakes = null;
        public static String sWheelsTyres = null;
        public static String sOther = null;

        //Accessories
        public static String sAirCon = null;
        public static String sBullBars = null;
        public static String sDashboard = null;
        public static String sLockingWheelNuts = null;
        public static String sRemovedSeats = null;
        public static String sRoofRack = null;
        public static String sSportsSteeringWheel = null;
        public static String sTintedWindows = null;
        public static String sUpholsteryChanges = null;
        public static String sWheelchairLift = null;
        public static String sPedalConfig = null;
        public static String sCarPhones = null;
        public static String sHandControls = null;
        public static String sParkingSensors = null;
        public static String sReplacementSeats = null;
        public static String sSatNav = null;
        public static String sSunroof = null;
        public static String sTowbar = null;
        public static String sWheelchairClamps = null;

        //Engine Transmission
        public static String sAirFilter = null;
        public static String sBoredOutEngine = null;
        public static String sExhaustSystem = null;
        public static String sLPGConversion = null;
        public static String sNitrous = null;
        public static String sStandardEngineReplacement = null;
        public static String sTransmissionChanges = null;
        public static String sBlueprinting = null;
        public static String sChipping = null;
        public static String sGearingChange = null;
        public static String sMiscEngineAlterations = null;
        public static String sNonStandardEngine = null;
        public static String sSupercharging = null;
        public static String sTurbocharging = null;

        //Lighting
        public static String sDrivingLights = null;
        public static String sHighLevelBrakeLights = null;
        public static String sSpotLights = null;
        public static String sFogLamps = null;
        public static String sRallyLights = null;

        //Paintwork/Stickers
        public static String sBadgesShowingSpeed = null;
        public static String sMurals = null;
        public static String sNonStandardRespray = null;
        public static String sStripes = null;
        public static String sDecals = null;
        public static String sNonStandardPaintWork = null;
        public static String sSignWriting = null;

        //Body Modifications
        public static String sAdditionalWindows = null;
        public static String sBonnetBulge = null;
        public static String sFlaredWings = null;
        public static String sRearBootSpoiler = null;
        public static String sRearValance = null;
        public static String sSideSkirts = null;
        public static String sBodyKit = null;
        public static String sFlaredWheelArches = null;
        public static String sFrontSpoiler = null;
        public static String sRearRoofSpoiler = null;
        public static String sRollCage = null;
        public static String sStrengtheningBrackets = null;

        //Suspension/Steering/Brakes
        public static String sDualControls = null;
        public static String sUpratedBrakes = null;
        public static String sSuspensionChanges = null;

        //Wheels & Tyres
        public static String sAlloyWheelsAftermarket = null;
        public static String sWheelSpacers = null;
        public static String sWiderTyres = null;
        public static String sAlloyWheelsManufacturerUpgrade = null;
        public static String sWheelTrims = null;
        public static String sWiderWheels = null;

        //Other
        public static String sOtherNotListed = null;

    }

    public static void loadData(WebDriver driver, Integer iRecordNumber) throws Exception {

        //Re-Initialise the data array
        ArrayList<String> DataArray = DataArrayPool.DataArray("VehicleMods").get(iRecordNumber);

        //Customer Details
        VehicleModVariables.sAccessories = DataArray.get(0);
        VehicleModVariables.sEngineTransmission = DataArray.get(1);
        VehicleModVariables.sLighting = DataArray.get(2);
        VehicleModVariables.sPaintworkStickers = DataArray.get(3);
        VehicleModVariables.sSpoilersBodyMods = DataArray.get(4);
        VehicleModVariables.sSuspensionSteeringBrakes = DataArray.get(5);
        VehicleModVariables.sWheelsTyres = DataArray.get(6);
        VehicleModVariables.sOther = DataArray.get(7);

        VehicleModVariables.sAirCon = DataArray.get(8);
        VehicleModVariables.sBullBars = DataArray.get(9);
        VehicleModVariables.sDashboard = DataArray.get(10);
        VehicleModVariables.sLockingWheelNuts = DataArray.get(11);
        VehicleModVariables.sRemovedSeats = DataArray.get(12);
        VehicleModVariables.sRoofRack = DataArray.get(13);
        VehicleModVariables.sSportsSteeringWheel = DataArray.get(14);
        VehicleModVariables.sTintedWindows = DataArray.get(15);
        VehicleModVariables.sUpholsteryChanges = DataArray.get(16);
        VehicleModVariables.sWheelchairLift = DataArray.get(17);
        VehicleModVariables.sPedalConfig = DataArray.get(18);
        VehicleModVariables.sCarPhones = DataArray.get(19);
        VehicleModVariables.sHandControls = DataArray.get(20);
        VehicleModVariables.sParkingSensors = DataArray.get(21);
        VehicleModVariables.sReplacementSeats = DataArray.get(22);
        VehicleModVariables.sSatNav = DataArray.get(23);
        VehicleModVariables.sSunroof = DataArray.get(24);
        VehicleModVariables.sTowbar = DataArray.get(25);
        VehicleModVariables.sWheelchairClamps = DataArray.get(26);
        VehicleModVariables.sAirFilter = DataArray.get(27);
        VehicleModVariables.sBoredOutEngine = DataArray.get(28);
        VehicleModVariables.sExhaustSystem = DataArray.get(29);
        VehicleModVariables.sLPGConversion = DataArray.get(30);
        VehicleModVariables.sNitrous = DataArray.get(31);
        VehicleModVariables.sStandardEngineReplacement = DataArray.get(32);
        VehicleModVariables.sTransmissionChanges = DataArray.get(33);
        VehicleModVariables.sBlueprinting = DataArray.get(34);
        VehicleModVariables.sChipping = DataArray.get(35);
        VehicleModVariables.sGearingChange = DataArray.get(36);
        VehicleModVariables.sMiscEngineAlterations = DataArray.get(37);
        VehicleModVariables.sNonStandardEngine = DataArray.get(38);
        VehicleModVariables.sSupercharging = DataArray.get(39);
        VehicleModVariables.sTurbocharging = DataArray.get(40);

        VehicleModVariables.sDrivingLights = DataArray.get(41);
        VehicleModVariables.sHighLevelBrakeLights = DataArray.get(42);
        VehicleModVariables.sSpotLights = DataArray.get(43);
        VehicleModVariables.sFogLamps = DataArray.get(44);
        VehicleModVariables.sRallyLights = DataArray.get(45);
        VehicleModVariables.sBadgesShowingSpeed = DataArray.get(46);
        VehicleModVariables.sMurals = DataArray.get(47);
        VehicleModVariables.sNonStandardRespray = DataArray.get(48);
        VehicleModVariables.sStripes = DataArray.get(49);
        VehicleModVariables.sDecals = DataArray.get(50);
        VehicleModVariables.sNonStandardPaintWork = DataArray.get(51);
        VehicleModVariables.sSignWriting = DataArray.get(52);
        VehicleModVariables.sAdditionalWindows = DataArray.get(53);
        VehicleModVariables.sBonnetBulge = DataArray.get(54);
        VehicleModVariables.sFlaredWings = DataArray.get(55);
        VehicleModVariables.sRearBootSpoiler = DataArray.get(56);

        VehicleModVariables.sRearValance = DataArray.get(57);
        VehicleModVariables.sSideSkirts = DataArray.get(58);
        VehicleModVariables.sBodyKit = DataArray.get(59);
        VehicleModVariables.sFlaredWheelArches = DataArray.get(60);
        VehicleModVariables.sFrontSpoiler = DataArray.get(61);
        VehicleModVariables.sRearRoofSpoiler = DataArray.get(62);
        VehicleModVariables.sRollCage = DataArray.get(63);
        VehicleModVariables.sStrengtheningBrackets = DataArray.get(64);
        VehicleModVariables.sDualControls = DataArray.get(65);
        VehicleModVariables.sUpratedBrakes = DataArray.get(66);
        VehicleModVariables.sSuspensionChanges = DataArray.get(67);

        //Main Driver Convictions
        VehicleModVariables.sAlloyWheelsAftermarket = DataArray.get(68);
        VehicleModVariables.sWheelSpacers = DataArray.get(69);
        VehicleModVariables.sWiderTyres = DataArray.get(70);
        VehicleModVariables.sAlloyWheelsManufacturerUpgrade = DataArray.get(71);
        VehicleModVariables.sWheelTrims = DataArray.get(72);
        VehicleModVariables.sWiderWheels = DataArray.get(73);
        VehicleModVariables.sOtherNotListed = DataArray.get(74);

    }

}
