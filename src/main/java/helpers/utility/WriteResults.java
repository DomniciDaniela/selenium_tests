package helpers.utility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteResults {

    public static void main(String Firstname, String Surname, String NCD, String AdditionalDriverCount, String NumberOfClaims, String AnnualPremium, String MonthlyPremium, String Duration) {
        String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH:mm:ss").format(new Date());
        try {
            Writer output;
            output = new BufferedWriter(new FileWriter(Constants.LOGS_PATH + "Quote_Output" + ".csv", true));
            output.write("\r\n");
            output.append(timeStamp + "," + Firstname + "," + Surname + "," + NCD + "," + AdditionalDriverCount + "," + NumberOfClaims + "," + AnnualPremium + "," + MonthlyPremium + "," + Duration + ",");
            output.close();

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

