# selenium_tests

This project is based on MAVEN.

Tools and Technologies:
~ Selenium Webdriver and Selenium Standalone Server -> Browser testing (the entire web flow)

~ jUnit -> testing framework

~ Java -> programming language

Project structure:
-> 'drivers' -> all drivers/browsers required for local run. Example: Firefox, Chrome, InternetExplorer.

-> 'Screenshots' -> the location of screenshots when the test is failed. The screenshot name is a concatenation between the method name and the date when the test failed. Example: testYouAndYourInsuranceElementsPageVisibility_2018.06.05.12.30.31.png

-> 'src/main/java/helpers' -> includes the classes used for avoid the code duplication and utilities

The 'TestBase' class contains the logic for opening the browser based on the parameter provided in 'AggregatorsData.xlsx' file

-> 'src/main/java/screens' -> contains methods for each page (home + motor)

-> 'src/test/java/' -> contains all test cases for motor AND home. A testcase corresponds to a single row defined in the 'MotorTestData' and 'HomeTestData' sheets.

-> 'TestData.xlsx' is a spreadsheet which contains the test parameters, as follows: 
- TestConfig -> contains the configuration for the environment and browsers;
- MotorTestData -> contains the parameters/data for the motor quotes
- HomeTestData -> contains the parameters/data for the home quotes
- CardDetails -> contains the data for the payment (card type, card number, card owner, expiry date, cvc)

-> 'pom.xml' -> contains all framework dependencies.

How to run these tests on other test environments/endpoints than provided in test cases?
You can update the urls from 'TestConfig' sheet, by changing the following values :

~ Test Environment -> test environmemt (e.g.: d for TSTD)

~ IsDevEnvironment (Y/N) -> If you want to run on dev environment set the flag to Y otherwise N

~ Dev Environment -> dev environment (e.g.: i for DEVI)

~ Browser -> chrome, firefox, ie(for Windows only)

These tests can be run from IDE or from command line(terminal/command prompt).
How to run tests from command line? You can run the tests locally from command line only if you have set M2_HOME (maven) as an environment variable. (More info: http://www.baeldung.com/install-maven-on-windows-linux-mac)

Commands:

mvn clean verify -> runs all tests
mvn clean verify -Dtest=mvn clean verify -Dtest=home.EndToEndTest -> runs all tests within home package
mvn clean verify -Dtest=home.EndToEndTest#testGenerateHomeQuote_Esure_NoJoint_NoBuildingCover_NoSpecialItem -> runs testGenerateHomeQuote_Esure_NoJoint_NoBuildingCover_NoSpecialItem method from home.EndToEndTest class
