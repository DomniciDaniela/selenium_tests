package home;

import helpers.TestDataUtils;
import helpers.Utils;
import helpers.utility.HomeDataLoad;
import helpers.utility.MotorDataLoad;
import org.junit.Assert;
import screens.CardDetails;
import screens.PaymentConfirmation;
import screens.PaymentOptions;
import screens.home.AboutYourHome;
import screens.home.JointPolicyHolder;
import screens.home.YourCover;
import screens.motor.*;

public class GenerateQuotes {

    public enum Protection {
        FULL_PROTECTION, JUST_IN_CASE_PROTECTION, MLP_PROTECTION, NO_PROTECTION
    }

    public enum Breakdowns {
        ROAD_ASSISTANCE, RA_HOME_RESCUE, FULL_COVER, NO_COVER
    }

    public enum HomeCover {
        FAMILY_COVER, HOME_EMERGENCY, TRAVEL_INSURANCE, PEST_COVER, WINTER_SPORTS
    }

    /**
     * Helper methods for tests to avoid code duplication
     */
    public static void youAndYourInsuranceElementsPageVisibility() throws Exception {
        YouAndYourInsurance.waitForScreen();

        Assert.assertTrue("Your details - page title is not displayed", YouAndYourInsurance.isYourDetailsDisplayed());
        Assert.assertTrue("Title dropdown is not displayed", YouAndYourInsurance.isTitleDropDownDisplayed());
        Assert.assertTrue("FirstName field is not displayed", YouAndYourInsurance.isFirstNameFieldDisplayed());
        Assert.assertTrue("FirstName field is not displayed", YouAndYourInsurance.isLastNameFieldDisplayed());
        Assert.assertTrue("Email field is not displayed", YouAndYourInsurance.isEmailFieldDisplayed());
        Assert.assertTrue("ConfirmEmail field is not displayed", YouAndYourInsurance.isConfirmEmailFieldDisplayed());
        Assert.assertTrue("MainPhoneNumber field is not displayed", YouAndYourInsurance.isMainPhoneFieldDisplayed());
        Assert.assertTrue("AdditionalPhoneNumber field is not displayed", YouAndYourInsurance.isAdditionalPhoneFieldDisplayed());
        Assert.assertTrue("MotorClaims-YES is not displayed", YouAndYourInsurance.isClaimYesDisplayed());
        Assert.assertTrue("MotorClaims-No is not displayed", YouAndYourInsurance.isClaimNoDisplayed());
        Assert.assertTrue("MotorConvictions-YES is not displayed", YouAndYourInsurance.isConvictionsYesDisplayed());
        Assert.assertTrue("MotorConvictions-No is not displayed", YouAndYourInsurance.isConvictionsNoDisplayed());
        Assert.assertTrue("AdditionalDivers-YES is not displayed", YouAndYourInsurance.isAdditionalDriversYesDisplayed());
        Assert.assertTrue("AdditionalDivers-No is not displayed", YouAndYourInsurance.isAdditionalDriversNoDisplayed());
        Assert.assertTrue("Reason of Visit dropdown is not displayed", YouAndYourInsurance.isReasonOfVisitDropdownDisplayed());
        Assert.assertTrue("PrivacyNotice link is not displayed", YouAndYourInsurance.isPrivacyNoticeDisplayed());
        Assert.assertTrue("Next button is not displayed", YouAndYourInsurance.isNextDisplayed());
    }

    /**
     * Helper method to generate Motor Quote based on TestData input file
     */
    public static void generateMotorQuote(boolean selectAddon) throws Exception {
        YouAndYourInsurance.waitForScreen();
        YouAndYourInsurance.enterYourDetails();

        Utils.clickNext();

        AboutYou.waitForScreen();
        AboutYou.enterYourDetails();

        Utils.clickNext();

        if (MotorDataLoad.DataLoadVariables.sRegistrationNumber.isEmpty()) {
            try {
                YourCarSearch.waitForScreen();
            } catch (Exception e) {
                Utils.clickNext();
                YourCarSearch.waitForScreen();
            }
            YourCarSearch.enterCarDetails();

            Utils.clickNext();
        }

        try {
            AboutYourCar.waitForScreen();
        } catch (Exception e) {
            Utils.clickNext();
            AboutYourCar.waitForScreen();
        }
        AboutYourCar.enterCarDetails();

        Utils.clickNext();

        if (MotorDataLoad.DataLoadVariables.sClaims.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            try {
                AboutYourClaims.waitForScreen();
            } catch (Exception e) {
                Utils.clickNext();
                AboutYourClaims.waitForScreen();
            }
            AboutYourClaims.enterClaimDetails();
            Utils.clickNext();
        }

        if (MotorDataLoad.DataLoadVariables.sConvictions.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            try {
                AboutYourConvictions.waitForScreen();
            } catch (Exception e) {
                Utils.clickNext();
                AboutYourConvictions.waitForScreen();
            }
            AboutYourConvictions.enterConvictionDetails();

            Utils.clickNext();
        }

        if (MotorDataLoad.DataLoadVariables.sAdditionalDriver.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
            try {
                AdditionalDrivers.waitForScreen();
            } catch (Exception e) {
                Utils.clickNext();
                AdditionalDrivers.waitForScreen();
            }
            AdditionalDrivers.enterAdditionalDriverDetails();

            Utils.clickADNext();

            if (!MotorDataLoad.DataLoadVariables.sMainDriver.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                ChooseMainDriver.waitForScreen();
                ChooseMainDriver.clickMainDriver1();

                Utils.clickNext();
            }
        }

        try {
            YourQuote.waitForScreen();
        } catch (Exception e) {
            if (MotorDataLoad.DataLoadVariables.sAdditionalDriver.equalsIgnoreCase(TestDataUtils.Flags.YES)) {
                Utils.clickADNext();
            } else {
                Utils.clickNext();
            }
            YourQuote.waitForScreen();
        }
        String monthlyCost = Utils.getMonthlyCost();
        String annualCost = Utils.getAnnualCost();

        if (selectAddon) {
            selectProtection(Protection.FULL_PROTECTION);
            Thread.sleep(3000);
            Assert.assertNotEquals("FULL_PROTECTION - The monthly cost is not updated", monthlyCost, Utils.getMonthlyCost());
            Assert.assertNotEquals("FULL_PROTECTION - The annual cost is not updated", annualCost, Utils.getAnnualCost());

            selectProtection(Protection.JUST_IN_CASE_PROTECTION);
            Thread.sleep(3000);
            Assert.assertNotEquals("JUST_IN_CASE_PROTECTION - The monthly cost is not updated", monthlyCost, Utils.getMonthlyCost());
            Assert.assertNotEquals("JUST_IN_CASE_PROTECTION - The annual cost is not updated", annualCost, Utils.getAnnualCost());

            selectProtection(Protection.MLP_PROTECTION);
            Thread.sleep(3000);
            Assert.assertNotEquals("MLP_PROTECTION - The monthly cost is not updated", monthlyCost, Utils.getMonthlyCost());
            Assert.assertNotEquals("MLP_PROTECTION - The annual cost is not updated", annualCost, Utils.getAnnualCost());
        } else {
            selectProtection(Protection.NO_PROTECTION);
            Thread.sleep(3000);
            Assert.assertEquals("NO_PROTECTION - The monthly cost is not updated", monthlyCost, Utils.getMonthlyCost());
            Assert.assertEquals("NO_PROTECTION - The annual cost is not updated", annualCost, Utils.getAnnualCost());
        }

        Utils.clickNext();

        // Dismiss MLP popup
        if (!selectAddon) {
            if (YourQuote.isMLPPopupDisplayed()) {
                Utils.clickNoThanks();
            }
        }

        BreakdownsOptions.waitForScreen();

        String breakdownMonthlyCost = Utils.getMonthlyCost();
        String breakdownAnnualCost = Utils.getAnnualCost();

        if (selectAddon) {
            selectCover(Breakdowns.ROAD_ASSISTANCE);
            Thread.sleep(3000);
            Assert.assertNotEquals("ROAD_ASSISTANCE - The monthly cost is not updated", breakdownMonthlyCost, Utils.getMonthlyCost());
            Assert.assertNotEquals("ROAD_ASSISTANCE - The annual cost is not updated", breakdownAnnualCost, Utils.getAnnualCost());

            selectCover(Breakdowns.RA_HOME_RESCUE);
            Thread.sleep(3000);
            Assert.assertNotEquals("RA_HOME_RESCUE - The monthly cost is not updated", breakdownMonthlyCost, Utils.getMonthlyCost());
            Assert.assertNotEquals("RA_HOME_RESCUE - The annual cost is not updated", breakdownAnnualCost, Utils.getAnnualCost());

            selectCover(Breakdowns.FULL_COVER);
            Thread.sleep(3000);
            Assert.assertNotEquals("FULL_COVER - The monthly cost is not updated", breakdownMonthlyCost, Utils.getMonthlyCost());
            Assert.assertNotEquals("FULL_COVER - The annual cost is not updated", breakdownAnnualCost, Utils.getAnnualCost());
        } else {
            selectCover(Breakdowns.NO_COVER);
            Thread.sleep(3000);
            Assert.assertEquals("NO_COVER - The monthly cost is not updated", breakdownMonthlyCost, Utils.getMonthlyCost());
            Assert.assertEquals("NO_COVER - The annual cost is not updated", breakdownAnnualCost, Utils.getAnnualCost());

        }

        Utils.clickNext();

        if (MotorDataLoad.DataLoadVariables.sRegistrationNumber.isEmpty()) {
            MoreDetails.waitForScreen();
            MoreDetails.setRegistrationNumber(TestDataUtils.MoreDetails.REGISTRATION_NUMBER);

            Utils.clickNext();
        }

        QuoteDetails.waitForScreen();
        QuoteDetails.clickConfirmDetails();
        QuoteDetails.clickProvideProof();
        QuoteDetails.clickTermsAndConditions();

        Utils.clickNext();

        // update to monthly as well
        PaymentOptions.waitForScreen();
        PaymentOptions.clickAnnualPayment();
        PaymentOptions.clickBillingAddressSameAsPolicyYes();
        PaymentOptions.clickCardOwnerNo();

        Utils.clickNext();
        // Sometimes the following warning is visible and the user has to click 'Next' again
        // WARNING. Please don't use the back or forward buttons on your browser as you may lose your quote information.
        try {
            CardDetails.waitForScreen();
        } catch (Exception e) {
            Utils.clickNext();
            CardDetails.waitForScreen();
        }

        CardDetails.enterCardDetails();
        CardDetails.clickBuyButton();

        // Sometimes there is an error when trying to complete the payment
        // We have been unable to complete your card payment. This can be for one of a number of reasons including your card failing the 3D Secure security checks or a lack of funds.
        // Please check your card details, choose another card or
        try {
            PaymentConfirmation.waitForScreen();
        } catch (Exception e) {
            CardDetails.enterCardDetails();
            CardDetails.clickBuyButton();
            PaymentConfirmation.waitForScreen();
        }
    }

    private static void selectProtection(Protection protection) throws Exception {
        switch (protection) {
            case FULL_PROTECTION:
                YourQuote.selectFullProtection();
                break;

            case JUST_IN_CASE_PROTECTION:
                YourQuote.selectJustInCase();
                break;

            case MLP_PROTECTION:
                YourQuote.selectMLP();
                break;

            case NO_PROTECTION:
                YourQuote.selectNoCover();
                break;
        }
    }

    public static void selectHomeCover(HomeCover cover) throws Exception {
        switch (cover) {
            case FAMILY_COVER:
                screens.home.YourQuote.selectFamilyProtection();
                break;

            case HOME_EMERGENCY:
                screens.home.YourQuote.selectHomeEmergency();
                break;

            case TRAVEL_INSURANCE:
                screens.home.YourQuote.selectTravelInsurance();
                if (screens.home.YourQuote.isTravelPopupDisplayed()) {
                    Utils.clickCloseButton();
                }
                break;

            case PEST_COVER:
                screens.home.YourQuote.selectPestCover();
                break;

            case WINTER_SPORTS:
                screens.home.YourQuote.selectWinterSportCover();
                if (screens.home.YourQuote.isWinterSportsPopupDisplayed()) {
                    Utils.clickCloseButton();
                }
                break;
        }
    }

    private static void selectCover(Breakdowns breakdown) throws Exception {
        switch (breakdown) {
            case ROAD_ASSISTANCE:
                BreakdownsOptions.selectRoadsideAssisstance();
                break;

            case RA_HOME_RESCUE:
                BreakdownsOptions.selectRAAndHomeRescue();
                break;

            case FULL_COVER:
                BreakdownsOptions.selectFullCover();
                break;

            case NO_COVER:
                BreakdownsOptions.selectNoCover();
                break;
        }
    }

    /**
     * Helper method to generate Home Quote based on TestData input file
     */
    public static void generateHomeQuote(boolean selectAddon) throws Exception {
        screens.home.AboutYou.waitForScreen();
        screens.home.AboutYou.enterYourDetails();

        Utils.clickNext();

        AboutYourHome.waitForScreen();
        AboutYourHome.enterHomeDetails();

        if (HomeDataLoad.DataLoadVariables.sJointPolicyHolder.equalsIgnoreCase(TestDataUtils.Flags.YES)) {

            Utils.clickAltNext();

            if (AboutYourHome.isBuildingPopupDisplayed()) {
                Utils.clickContinueButton();
            }

            JointPolicyHolder.waitForScreen();
            JointPolicyHolder.selectTitle(HomeDataLoad.DataLoadVariables.sJointTitle);
            JointPolicyHolder.setFirstName(HomeDataLoad.DataLoadVariables.sJointFirstname);
            JointPolicyHolder.setLastName(HomeDataLoad.DataLoadVariables.sJointSurname);

            if (HomeDataLoad.DataLoadVariables.sJointGender.equalsIgnoreCase(TestDataUtils.Flags.MALE)) {
                JointPolicyHolder.clickGenderMale();
            } else {
                JointPolicyHolder.clickGenderFemale();
            }

            JointPolicyHolder.selectMaritalStatus(HomeDataLoad.DataLoadVariables.sJointMaritalStatus);
            JointPolicyHolder.setOcupation(HomeDataLoad.DataLoadVariables.sJointOccupation);
            JointPolicyHolder.selectRelationship(HomeDataLoad.DataLoadVariables.sRelationship);
            JointPolicyHolder.setBirthday(HomeDataLoad.DataLoadVariables.sJointDOBday, HomeDataLoad.DataLoadVariables.sJointDOBmonth,
                    HomeDataLoad.DataLoadVariables.sJointDOByear);
        }

        Utils.clickNext();
        // Sometimes the following warning is visible and the user has to click 'Next' again
        // WARNING. Please don't use the back or forward buttons on your browser as you may lose your quote information.
        try {
            YourCover.waitForScreen();
        } catch (Exception e) {
            Utils.clickNext();
            YourCover.waitForScreen();
        }

        YourCover.selectCover();
        Utils.clickNext();

        // Sometimes the following warning is visible and the user has to click 'Next' again
        // WARNING. Please don't use the back or forward buttons on your browser as you may lose your quote information.
        try {
            screens.home.YourQuote.waitForScreen();
        } catch (Exception e) {
            Utils.clickNext();
            screens.home.YourQuote.waitForScreen();
        }

        String monthlyCost = Utils.getMonthlyCost();
        String annualCost = Utils.getAnnualCost();

        if (selectAddon) {
            selectHomeCover(HomeCover.FAMILY_COVER);
            Thread.sleep(3000);
            Assert.assertEquals("FAMILY_COVER - The monthly cost is not updated", monthlyCost, Utils.getMonthlyCost());
            Assert.assertEquals("FAMILY_COVER - The annual cost is not updated", annualCost, Utils.getAnnualCost());

            selectHomeCover(HomeCover.HOME_EMERGENCY);
            Thread.sleep(3000);
            Assert.assertEquals("HOME_EMERGENCY - The monthly cost is not updated", monthlyCost, Utils.getMonthlyCost());
            Assert.assertEquals("HOME_EMERGENCY - The annual cost is not updated", annualCost, Utils.getAnnualCost());

            selectHomeCover(HomeCover.TRAVEL_INSURANCE);
            Thread.sleep(3000);
            Assert.assertNotEquals("TRAVEL_INSURANCE - The monthly cost is not updated", monthlyCost, Utils.getMonthlyCost());
            Assert.assertNotEquals("TRAVEL_INSURANCE - The annual cost is not updated", annualCost, Utils.getAnnualCost());

            selectHomeCover(HomeCover.PEST_COVER);
            Thread.sleep(3000);
            Assert.assertNotEquals("PEST_COVER - The monthly cost is not updated", monthlyCost, Utils.getMonthlyCost());
            Assert.assertNotEquals("PEST_COVER - The annual cost is not updated", annualCost, Utils.getAnnualCost());

            selectHomeCover(HomeCover.WINTER_SPORTS);
            Thread.sleep(3000);
            Assert.assertNotEquals("WINTER_SPORTS - The monthly cost is not updated", monthlyCost, Utils.getMonthlyCost());
            Assert.assertNotEquals("WINTER_SPORTS - The annual cost is not updated", annualCost, Utils.getAnnualCost());
        }

        Utils.clickNext();

        if (!selectAddon) {
            if (screens.home.YourQuote.isHelpPopupDisplayed()) {
                Utils.clickNoThanks();
            }
        }

        screens.home.MoreDetails.waitForScreen();
        screens.home.MoreDetails.enterMoreDetails();

        Utils.clickNext();
        screens.home.QuoteDetails.waitForScreen();
        screens.home.QuoteDetails.clickCorrectDeclaration();
        screens.home.QuoteDetails.clickTermsAndConditions();

        Utils.clickNext();
        payAnnualPolicy();
    }

    public static void payAnnualPolicy() throws Exception {
        PaymentOptions.waitForScreen();
        PaymentOptions.clickAnnualPayment();
        PaymentOptions.clickBillingAddressSameAsPolicyYes();
        PaymentOptions.clickCardOwnerNo();

        Utils.clickNext();
        // Sometimes the following warning is visible and the user has to click 'Next' again
        // WARNING. Please don't use the back or forward buttons on your browser as you may lose your quote information.
        try {
            CardDetails.waitForScreen();
        } catch (Exception e) {
            Utils.clickNext();
            CardDetails.waitForScreen();
        }

        CardDetails.enterCardDetails();
        CardDetails.clickBuyButton();

        // Sometimes there is an error when trying to complete the payment
        // We have been unable to complete your card payment. This can be for one of a number of reasons including your card failing the 3D Secure security checks or a lack of funds.
        // Please check your card details, choose another card or
        try {
            PaymentConfirmation.waitForScreen();
        } catch (Exception e) {
            CardDetails.enterCardDetails();
            CardDetails.clickBuyButton();
            PaymentConfirmation.waitForScreen();
        }
    }
}
