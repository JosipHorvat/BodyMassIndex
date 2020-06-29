/*
  @author Josip Horvat
email: josiph988@gmail.com
phone number: 083 876 0974
*/
package bodymassindex;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class OptionsMenu {

    BMIUtility converters = new BMIUtility();

    public int optionsMenu() {
        int pickOption = 0;
        Scanner input = new Scanner(System.in);
        do {
            ArrayList<String> options = new ArrayList();
            options.add("Calculate Metric BMI.");
            options.add("Calculate Imperial BMI.");
            options.add("Convert centimetars to inches");
            options.add("Convert inches to metars/cm");
            options.add("Convert kilograms to pounds ");
            options.add("Convert pounds to kilograms");
            int j = 1;
            for (int i = 0; i < options.size(); i++) {
                System.out.println(j + ". " + options.get(i));
                j++;
            }

            try {

                pickOption = input.nextInt();

            } catch (InputMismatchException e) {
                System.err.println("MissMatchException! ");
                input.next();
                pickOption = 0;

                continue;
            }
            if (pickOption < 1 || pickOption > 6) {
                System.out.println("That option don't exist. Please try again!");
            } else if (pickOption == 1) {
                converters.metricBMI();
            } else if (pickOption == 2) {
                converters.imperialEnglishBMI();
            } else if (pickOption == 3) {
                converters.cmToInchConverter();
            } else if (pickOption == 4) {
                converters.inchToCmConverter();
            } else if (pickOption == 5) {
                converters.kgToPoundsConverter();
            } else if (pickOption == 6) {
                converters.poundsToKgConverter();
            }

        } while (pickOption < 1 || pickOption > 6);

        return pickOption;
    }

}
