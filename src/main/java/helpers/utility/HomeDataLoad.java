package helpers.utility;


import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class HomeDataLoad {

    public static class DataLoadVariables {
        // Home Owner Variables
        public static String sTitle = null;
        public static String sFirstname = null;
        public static String sSurname = null;
        public static String sGender = null;
        public static String sDOBday = null;
        public static String sDOBmonth = null;
        public static String sDOByear = null;
        public static String sMaritalStatus = null;
        public static String sOccupation = null;
        public static String sMainPhone = null;
        public static String sAdditionalPhone = null;
        public static String sEmail = null;
        public static String sConfirmEmail = null;
        public static String sPostCode = null;
        public static String sFullAddress = null;
        public static String sFirstBuyer = null;
        public static String sStartCoverDay = null;
        public static String sStartCoverMonth = null;
        public static String sStartCoverYear = null;

        public static String sFloodClaims = null;
        public static String sSubsidenceClaims = null;
        public static String sHomeClaims = null;
        public static String sJointPolicyHolder = null;
        public static String sVisitReason = null;

        public static String sPropertyType = null;
        public static String sListedAsBuilding = null;

        public static String sConstructionYear = null;
        public static String sBedroomsNO = null;
        public static String sChildrenUnder16 = null;
        public static String sAdults = null;

        public static String sOwnershipType = null;
        public static String sWindowsSecured = null;

        // Joint Holder Variables
        public static String sJointTitle = null;
        public static String sJointFirstname = null;
        public static String sJointSurname = null;
        public static String sJointGender = null;
        public static String sJointMaritalStatus = null;
        public static String sJointOccupation = null;
        public static String sRelationship = null;
        public static String sJointDOBday = null;
        public static String sJointDOBmonth = null;
        public static String sJointDOByear = null;

        // Home Insurance Variables
        public static String sStandardBuildingCover = null;
        public static String sPlusBuildingCover = null;
        public static String sNoBuildingCover = null;
        public static String sBuildingExcess = null;
        public static String sNCD = null;

        public static String sStandardContentCover = null;
        public static String sPlusContentCover = null;
        public static String sNoContentCover = null;
        public static String sContentExcess = null;
        public static String sCostReplacement = null;
        public static String sCostPersonalPossession = null;
        public static String sSpecifiedItem = null;
        public static String sItemType = null;
        public static String sItemDescription = null;
        public static String sItemValue = null;
        public static String sSameAddressAsInsuredAddress = null;
        public static String sMoveToInsuredAddress = null;
        public static String sNewPostCode = null;
        public static String sNewAddress = null;

        // More Details
        public static String sPreviousAddress = null;
        public static String sPreviousPostCode = null;
        public static String sPreviousFullAddress = null;
        public static String sCurrentInsurer = null;
        public static String sPolicyNumber = null;
    }

    public static void loadData(WebDriver driver, Integer iRecordNumber) throws Exception {

        //Re-Initialise the data array
        ArrayList<String> DataArray = DataArrayPool.DataArray("HomeTestData").get(iRecordNumber);

        // Customer Details
        DataLoadVariables.sTitle = DataArray.get(0);
        DataLoadVariables.sFirstname = DataArray.get(1);
        DataLoadVariables.sSurname = DataArray.get(2);
        DataLoadVariables.sGender = DataArray.get(3);
        DataLoadVariables.sDOBday = DataArray.get(4);
        DataLoadVariables.sDOBmonth = DataArray.get(5);
        DataLoadVariables.sDOByear = DataArray.get(6);
        DataLoadVariables.sMaritalStatus = DataArray.get(7);
        DataLoadVariables.sOccupation = DataArray.get(8);
        DataLoadVariables.sMainPhone = DataArray.get(9);
        DataLoadVariables.sAdditionalPhone = DataArray.get(10);
        DataLoadVariables.sEmail = DataArray.get(11);
        DataLoadVariables.sConfirmEmail = DataArray.get(12);
        DataLoadVariables.sPostCode = DataArray.get(13);
        DataLoadVariables.sFullAddress = DataArray.get(14);
        DataLoadVariables.sFirstBuyer = DataArray.get(15);
        DataLoadVariables.sStartCoverDay = DataArray.get(16);
        DataLoadVariables.sStartCoverMonth = DataArray.get(17);
        DataLoadVariables.sStartCoverYear = DataArray.get(18);
        DataLoadVariables.sFloodClaims =  DataArray.get(19);
        DataLoadVariables.sSubsidenceClaims =  DataArray.get(20);
        DataLoadVariables.sHomeClaims =  DataArray.get(21);
        DataLoadVariables.sJointPolicyHolder =  DataArray.get(22);
        DataLoadVariables.sVisitReason = DataArray.get(23);

        DataLoadVariables.sPropertyType = DataArray.get(24);
        DataLoadVariables.sListedAsBuilding = DataArray.get(25);
        DataLoadVariables.sConstructionYear = DataArray.get(26);
        DataLoadVariables.sBedroomsNO = DataArray.get(27);
        DataLoadVariables.sChildrenUnder16 = DataArray.get(28);
        DataLoadVariables.sAdults = DataArray.get(65);
        DataLoadVariables.sOwnershipType = DataArray.get(29);
        DataLoadVariables.sWindowsSecured = DataArray.get(30);

        // Joint Holder Details
        DataLoadVariables.sJointTitle = DataArray.get(31);
        DataLoadVariables.sJointFirstname = DataArray.get(32);
        DataLoadVariables.sJointSurname = DataArray.get(33);
        DataLoadVariables.sJointGender = DataArray.get(34);
        DataLoadVariables.sJointMaritalStatus = DataArray.get(35);
        DataLoadVariables.sJointOccupation = DataArray.get(36);
        DataLoadVariables.sRelationship = DataArray.get(37);
        DataLoadVariables.sJointDOBday = DataArray.get(38);
        DataLoadVariables.sJointDOBmonth = DataArray.get(39);
        DataLoadVariables.sJointDOByear = DataArray.get(40);

        // Policy
        DataLoadVariables.sStandardBuildingCover = DataArray.get(41);
        DataLoadVariables.sPlusBuildingCover = DataArray.get(42);
        DataLoadVariables.sNoBuildingCover = DataArray.get(43);
        DataLoadVariables.sBuildingExcess = DataArray.get(44);
        DataLoadVariables.sNCD = DataArray.get(45);
        DataLoadVariables.sStandardContentCover = DataArray.get(46);
        DataLoadVariables.sPlusContentCover = DataArray.get(47);
        DataLoadVariables.sNoContentCover = DataArray.get(48);
        DataLoadVariables.sContentExcess = DataArray.get(49);
        DataLoadVariables.sCostReplacement = DataArray.get(50);
        DataLoadVariables.sCostPersonalPossession = DataArray.get(51);
        DataLoadVariables.sSpecifiedItem = DataArray.get(52);
        DataLoadVariables.sItemType = DataArray.get(53);
        DataLoadVariables.sItemDescription = DataArray.get(54);
        DataLoadVariables.sItemValue = DataArray.get(55);
        DataLoadVariables.sSameAddressAsInsuredAddress = DataArray.get(56);
        DataLoadVariables.sMoveToInsuredAddress = DataArray.get(58);
        DataLoadVariables.sNewPostCode = DataArray.get(58);
        DataLoadVariables.sNewAddress = DataArray.get(59);

        // More Details
        DataLoadVariables.sPreviousAddress = DataArray.get(60);
        DataLoadVariables.sPreviousPostCode = DataArray.get(61);
        DataLoadVariables.sPreviousFullAddress = DataArray.get(62);
        DataLoadVariables.sCurrentInsurer = DataArray.get(63);
        DataLoadVariables.sPolicyNumber = DataArray.get(64);
    }

}
