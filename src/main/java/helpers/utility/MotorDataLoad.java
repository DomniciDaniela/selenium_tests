package helpers.utility;


import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class MotorDataLoad {

    public static class DataLoadVariables {
        // Main Driver Variables
        public static String sTitle = null;
        public static String sFirstname = null;
        public static String sSurname = null;
        public static String sEmail = null;
        public static String sConfirmEmail = null;
        public static String sMainPhone = null;
        public static String sAdditionalPhone = null;
        public static String sClaims = null;
        public static String sConvictions = null;
        public static String sAdditionalDriver = null;
        public static String sMainDriver = null;
        public static String sVisitReason = null;

        public static String sDOBday = null;
        public static String sDOBmonth = null;
        public static String sDOByear = null;
        public static String sResidentInUKSinceBirth = null;
        public static String sEmploymentStatus = null;
        public static String sOccupation = null;
        public static String sIndustry = null;
        public static String sHaveSecondOccupation = null;
        public static String sSecondOccupation = null;
        public static String sGender = null;
        public static String sMaritalStatus = null;
        public static String sChildrenUnder16 = null;
        public static String sResidentialStatus = null;
        public static String sCarsInHousehold = null;
        public static String sAccessToOtherCars = null;
        public static String sLicenceType = null;
        public static String sHeldLicenceFor = null;
        public static String sNCD = null;
        public static String sRegistrationNumber = null;
        public static String sPostCode = null;
        public static String sFullAddress = null;

        // Vehicle Variables
        public static String sMake = null;
        public static String sModel = null;
        public static String sFuelType = null;
        public static String sTransmissionType = null;
        public static String sRegDay = null;
        public static String sRegMonth = null;
        public static String sRegYear = null;
        public static String sCarID = null;

        public static String sLegalOwner = null;
        public static String sRegisteredKeeper = null;
        public static String sCarUse = null;
        public static String sSecurityDevicesFitted = null;
        public static String sEstimatedValue = null;
        public static String sTrackerFitted = null;
        public static String sEstimatedMileage = null;
        public static String sDifferentPostcodeOvernight = null;
        public static String sOvernightPostcode = null;
        public static String sOvernightLocation = null;
        public static String sPurchaseDay = null;
        public static String sPurchaseMonth = null;
        public static String sPurchaseYear = null;
        public static String sNOTPurchasedYet = null;
        public static String sCoverLevel = null;
        public static String sCarModifiedFlag = null;

        // Claims & Conviction Variables
        public static String sNumberOfClaims = null;
        public static String sClaimType1 = null;
        public static String sClaimDay1 = null;
        public static String sClaimMonth1 = null;
        public static String sClaimYear1 = null;
        public static String sClaimAtFault1 = null;
        public static String sClaimType2 = null;
        public static String sClaimDay2 = null;
        public static String sClaimMonth2 = null;
        public static String sClaimYear2 = null;
        public static String sClaimAtFault2 = null;
        public static String sMD1ConvictionCode = null;
        public static String sMD1ConvictionDay = null;
        public static String sMD1ConvictionMonth = null;
        public static String sMD1ConvictionYear = null;
        public static String sMD1PenaltyPoints = null;
        public static String sMD1BanLength = null;
        public static String sMD2ConvictionCode = null;
        public static String sMD2ConvictionDay = null;
        public static String sMD2ConvictionMonth = null;
        public static String sMD2ConvictionYear = null;
        public static String sMD2PenaltyPoints = null;
        public static String sMD2BanLength = null;

        // Additional Driver Variables
        public static String sAD1Title = null;
        public static String sAD1Firstname = null;
        public static String sAD1Surname = null;
        public static String sAD1Gender = null;
        public static String sAD1DOBDay = null;
        public static String sAD1DOBMonth = null;
        public static String sAD1DOBYear = null;
        public static String sAD1ResidentInUKSinceBirth = null;
        public static String sAD1EmploymentStatus = null;
        public static String sAD1Occupation = null;
        public static String sAD1Industry = null;
        public static String sAD1SecondOccupation = null;
        public static String sAD1MaritalStatus = null;
        public static String sAD1RelationshipToMe = null;
        public static String sAD1LicenceType = null;
        public static String sAD1LicenceHeld = null;
        public static String sAD1Claims = null;
        public static String sAD1Convictions = null;
        public static String sAD1ConvictionCode = null;
        public static String sAD1ConvictionDay = null;
        public static String sAD1ConvictionMonth = null;
        public static String sAD1ConvictionYear = null;
        public static String sAD1PenaltyPoints = null;
        public static String sAD1BanLength = null;
        public static String sAdditionalDriverCount = null;

        // Policy Start Date
        public static String sPolicyStartDay = null;
        public static String sPolicyStartMonth = null;
        public static String sPolicyStartYear = null;
    }

    public static void loadData(WebDriver driver, Integer iRecordNumber) throws Exception {

        //Re-Initialise the data array
        ArrayList<String> DataArray = DataArrayPool.DataArray("MotorTestData").get(iRecordNumber);

        //Customer Details
        DataLoadVariables.sTitle = DataArray.get(0);
        DataLoadVariables.sFirstname = DataArray.get(1);
        DataLoadVariables.sSurname = DataArray.get(2);
        DataLoadVariables.sEmail = DataArray.get(3);
        DataLoadVariables.sConfirmEmail = DataArray.get(4);
        DataLoadVariables.sMainPhone = DataArray.get(5);
        DataLoadVariables.sAdditionalPhone = DataArray.get(6);
        DataLoadVariables.sClaims = DataArray.get(7);
        DataLoadVariables.sConvictions = DataArray.get(8);
        DataLoadVariables.sAdditionalDriver = DataArray.get(9);
        DataLoadVariables.sMainDriver = DataArray.get(10);
        DataLoadVariables.sVisitReason = DataArray.get(11);
        DataLoadVariables.sDOBday = DataArray.get(12);
        DataLoadVariables.sDOBmonth = DataArray.get(13);
        DataLoadVariables.sDOByear = DataArray.get(14);
        DataLoadVariables.sResidentInUKSinceBirth = DataArray.get(15);
        DataLoadVariables.sEmploymentStatus = DataArray.get(16);
        DataLoadVariables.sOccupation = DataArray.get(17);
        DataLoadVariables.sIndustry = DataArray.get(18);
        DataLoadVariables.sHaveSecondOccupation = DataArray.get(19);
        DataLoadVariables.sSecondOccupation = DataArray.get(20);
        DataLoadVariables.sGender = DataArray.get(21);
        DataLoadVariables.sMaritalStatus = DataArray.get(22);
        DataLoadVariables.sChildrenUnder16 = DataArray.get(23);
        DataLoadVariables.sResidentialStatus = DataArray.get(24);
        DataLoadVariables.sCarsInHousehold = DataArray.get(25);
        DataLoadVariables.sAccessToOtherCars = DataArray.get(26);
        DataLoadVariables.sLicenceType = DataArray.get(27);
        DataLoadVariables.sHeldLicenceFor = DataArray.get(28);
        DataLoadVariables.sNCD = DataArray.get(29);
        DataLoadVariables.sRegistrationNumber = DataArray.get(30);
        DataLoadVariables.sPostCode = DataArray.get(31);
        DataLoadVariables.sFullAddress = DataArray.get(32);

        //Vehicle Details
        DataLoadVariables.sMake = DataArray.get(33);
        DataLoadVariables.sModel = DataArray.get(34);
        DataLoadVariables.sFuelType = DataArray.get(35);
        DataLoadVariables.sTransmissionType = DataArray.get(36);
        DataLoadVariables.sRegDay = DataArray.get(37);
        DataLoadVariables.sRegMonth = DataArray.get(38);
        DataLoadVariables.sRegYear = DataArray.get(39);
        DataLoadVariables.sCarID = DataArray.get(40);

        DataLoadVariables.sLegalOwner = DataArray.get(41);
        DataLoadVariables.sRegisteredKeeper = DataArray.get(42);
        DataLoadVariables.sCarUse = DataArray.get(43);
        DataLoadVariables.sSecurityDevicesFitted = DataArray.get(44);
        DataLoadVariables.sEstimatedValue = DataArray.get(45);
        DataLoadVariables.sTrackerFitted = DataArray.get(46);
        DataLoadVariables.sEstimatedMileage = DataArray.get(47);
        DataLoadVariables.sDifferentPostcodeOvernight = DataArray.get(48);
        DataLoadVariables.sOvernightPostcode = DataArray.get(49);
        DataLoadVariables.sOvernightLocation = DataArray.get(50);
        DataLoadVariables.sPurchaseDay = DataArray.get(51);
        DataLoadVariables.sPurchaseMonth = DataArray.get(52);
        DataLoadVariables.sPurchaseYear = DataArray.get(53);
        DataLoadVariables.sNOTPurchasedYet = DataArray.get(54);
        DataLoadVariables.sCoverLevel = DataArray.get(55);
        DataLoadVariables.sCarModifiedFlag = DataArray.get(56);

        DataLoadVariables.sNumberOfClaims = DataArray.get(57);
        DataLoadVariables.sClaimType1 = DataArray.get(58);
        DataLoadVariables.sClaimDay1 = DataArray.get(59);
        DataLoadVariables.sClaimMonth1 = DataArray.get(60);
        DataLoadVariables.sClaimYear1 = DataArray.get(61);
        DataLoadVariables.sClaimAtFault1 = DataArray.get(62);
        DataLoadVariables.sClaimType2 = DataArray.get(63);
        DataLoadVariables.sClaimDay2 = DataArray.get(64);
        DataLoadVariables.sClaimMonth2 = DataArray.get(65);
        DataLoadVariables.sClaimYear2 = DataArray.get(66);
        DataLoadVariables.sClaimAtFault2 = DataArray.get(67);

        //Main Driver Convictions
        DataLoadVariables.sMD1ConvictionCode = DataArray.get(68);
        DataLoadVariables.sMD1ConvictionDay = DataArray.get(69);
        DataLoadVariables.sMD1ConvictionMonth = DataArray.get(70);
        DataLoadVariables.sMD1ConvictionYear = DataArray.get(71);
        DataLoadVariables.sMD1PenaltyPoints = DataArray.get(72);
        DataLoadVariables.sMD1BanLength = DataArray.get(73);
        DataLoadVariables.sMD2ConvictionCode = DataArray.get(74);
        DataLoadVariables.sMD2ConvictionDay = DataArray.get(75);
        DataLoadVariables.sMD2ConvictionMonth = DataArray.get(76);
        DataLoadVariables.sMD2ConvictionYear = DataArray.get(77);
        DataLoadVariables.sMD2PenaltyPoints = DataArray.get(78);
        DataLoadVariables.sMD2BanLength = DataArray.get(79);

        //Additional Driver Info
        DataLoadVariables.sAD1Title = DataArray.get(80);
        DataLoadVariables.sAD1Firstname = DataArray.get(81);
        DataLoadVariables.sAD1Surname = DataArray.get(82);
        DataLoadVariables.sAD1Gender = DataArray.get(83);
        DataLoadVariables.sAD1DOBDay = DataArray.get(84);
        DataLoadVariables.sAD1DOBMonth = DataArray.get(85);
        DataLoadVariables.sAD1DOBYear = DataArray.get(86);
        DataLoadVariables.sAD1ResidentInUKSinceBirth = DataArray.get(87);
        DataLoadVariables.sAD1EmploymentStatus = DataArray.get(88);
        DataLoadVariables.sAD1Occupation = DataArray.get(89);
        DataLoadVariables.sAD1Industry = DataArray.get(90);
        DataLoadVariables.sAD1SecondOccupation = DataArray.get(91);
        DataLoadVariables.sAD1MaritalStatus = DataArray.get(92);
        DataLoadVariables.sAD1RelationshipToMe = DataArray.get(93);
        DataLoadVariables.sAD1LicenceType = DataArray.get(94);
        DataLoadVariables.sAD1LicenceHeld = DataArray.get(95);
        DataLoadVariables.sAD1Claims = DataArray.get(96);
        DataLoadVariables.sAD1Convictions = DataArray.get(97);
        DataLoadVariables.sAD1ConvictionCode = DataArray.get(98);
        DataLoadVariables.sAD1ConvictionDay = DataArray.get(99);
        DataLoadVariables.sAD1ConvictionMonth = DataArray.get(100);
        DataLoadVariables.sAD1ConvictionYear = DataArray.get(101);
        DataLoadVariables.sAD1PenaltyPoints = DataArray.get(102);
        DataLoadVariables.sAD1BanLength = DataArray.get(103);

        DataLoadVariables.sAdditionalDriverCount = DataArray.get(104);

        DataLoadVariables.sPolicyStartDay = DataArray.get(105);
        DataLoadVariables.sPolicyStartMonth = DataArray.get(106);
        DataLoadVariables.sPolicyStartYear = DataArray.get(107);
    }

}
