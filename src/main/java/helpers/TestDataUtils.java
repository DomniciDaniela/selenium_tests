package helpers;

import helpers.utility.ConfigLoad;

public class TestDataUtils {

    public static class PageURLs {
        public static final String ABOUT_YOU = "aboutYou.xhtml";
        public static final String ABOUT_YOUR_CAR = "aboutYourCar.xhtml";
        public static final String ABOUT_YOUR_CLAIMS = "aboutYourClaims.xhtml";
        public static final String ABOUT_YOUR_CONVICTIONS = "aboutYourConvictions.xhtml";
        public static final String ABOUT_YOUR_HOME = "aboutYourHome.xhtml";
        public static final String ADDITIONAL_DRIVERS = "aboutYourAdditionalDrivers.xhtml";
        public static final String BREAKDOWN_OPTIONS = "breakdownOptions.xhtml";
        public static final String CARD_DETAILS = "cardInformation.xhtml";
        public static final String CHOOSE_MAIN_DRIVER = "chooseMainDriver.xhtml";
        public static final String DIRECT_DEBIT = "directDebitInformation.xhtml";
        public static final String MORE_DETAILS = "moreDetails.xhtml";
        public static final String MORE_DETAILS_ABOUT_YOUR_COVER = "moreDetailsAboutYourCover.xhtml";
        public static final String NO_QUOTE = "referNoReturnBroker.xhtml";
        public static final String PAYMENT_CONFIRMATION = "paymentConfirmation.xhtml";
        public static final String PAYMENT_OPTIONS = "paymentOptions.xhtml";
        public static final String QUOTE_DETAILS = "quoteDetails.xhtml";
        public static final String YOU_AND_YOUR_INSURANCE = "youAndYourInsurance.xhtml";
        public static final String YOUR_CAR_SEARCH = "yourCarSearch.xhtml";
        public static final String YOUR_COVER = "yourCover.xhtml";
        public static final String YOUR_JOINT_POLICY_HOLDER = "yourJointPolicyholder.xhtml";
        public static final String YOUR_QUOTE = "yourQuote.xhtml";

        public static final String SHEILAS_WHEELS = "ltst";
    }

    public static class Flags {
        public static final String MALE = "M";
        public static final String RETIRED = "Retired";
        public static final String YES = "Y";

    }

    public static class MoreDetails {
        public static final String REGISTRATION_NUMBER = "ABC123";
    }

    public static class WebApplications {
        public static final String ESURE_HOME = "https://etst" + ConfigLoad.ConfigLoadVariables.sEnvironment + ".es-dte.co.uk/new/home";
        public static final String ESURE_MOTOR = "https://etst"+ ConfigLoad.ConfigLoadVariables.sEnvironment + ".es-dte.co.uk/new/motor";
        public static final String FIRST_ALTERNATIVE_MOTOR = "https://ftst" + ConfigLoad.ConfigLoadVariables.sEnvironment + ".es-dte.co.uk/new/motor";
        public static final String SHEILAS_WHEELS_HOME = "https://ltst" + ConfigLoad.ConfigLoadVariables.sEnvironment + ".es-dte.co.uk/new/home";
        public static final String SHEILAS_WHEELS_MOTOR = "https://ltst"+ ConfigLoad.ConfigLoadVariables.sEnvironment + ".es-dte.co.uk/new/motor";

        public static final String ESURE_HOME_DEV = "https://edev" + ConfigLoad.ConfigLoadVariables.sEnvironment + ".es-dte.co.uk/new/home";
        public static final String ESURE_MOTOR_DEV = "https://edev"+ ConfigLoad.ConfigLoadVariables.sEnvironment + ".es-dte.co.uk/new/motor";
        public static final String FIRST_ALTERNATIVE_MOTOR_DEV = "https://fdev" + ConfigLoad.ConfigLoadVariables.sEnvironment + ".es-dte.co.uk/new/motor?optimizely_opt_out=true";
        public static final String SHEILAS_WHEELS_HOME_DEV = "https://ldev" + ConfigLoad.ConfigLoadVariables.sEnvironment + ".es-dte.co.uk/new/home";
        public static final String SHEILAS_WHEELS_MOTOR_DEV= "https://ldevt"+ ConfigLoad.ConfigLoadVariables.sEnvironment + ".es-dte.co.uk/new/motor";
    }

    public static class Browser {
        public static final String CHROME = "chrome";
        public static final String SAFARI = "safari";
    }
}
