/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymassindex;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
  @author Josip Horvat
email: josiph988@gmail.com
phone number: 083 876 0974
*/
public class BMIUtility {

    double weightKg = 0;
    double heightCm = 0;
    double inchHeight = 0;
    double pounds = 0;
    double centimetars = 0;
    double inch = 0;
    double kilograms = 0;
    double result;

    Scanner input = new Scanner(System.in);

    public double cmToInchConverter() {
        try {
            System.out.println("Please enter value in centimetars:");
            double centimetars = input.nextDouble();
            double result = centimetars * 0.39370;
            System.out.printf("%f centimetars is %f in inches.", centimetars, result);
            return result;
        } catch (InputMismatchException e) {
            System.out.println("MismatchException!");
            input.next();
        }
        return cmToInchConverter();
    }

    public double inchToCmConverter() {
        try {

            System.out.println("Please enter value in inches: ");
            double inch = input.nextDouble();
            double result = inch * 2.54;
            System.out.printf("%f inch is %f centimetars.", inch, result);

            return result;
        } catch (InputMismatchException e) {
            System.out.println("MismatchException!");
            input.next();
        }
        return inchToCmConverter();
    }

    public double poundsToKgConverter() {
        try {
            System.out.println("Please enter value in pounds:");
            pounds = input.nextDouble();
            double result = pounds * 0.454;
            System.out.printf("%f pounds is %f in kilograms.", pounds,result );
            return result;
        } catch (InputMismatchException e) {
            System.out.println("MismatchException!");
            input.next();
        }
        return poundsToKgConverter();
    }

    public double kgToPoundsConverter() {
        try {
            System.out.println("Please enter value in kilograms:");
            double kilograms = input.nextDouble();
            double result = kilograms / 0.45359237;
            System.out.printf("%f kilograms is %f in pounds", kilograms, result);
            return Math.round(result);
        } catch (InputMismatchException e) {
            System.out.println("MismatchException!");
            input.next();
        }
        return kgToPoundsConverter();
    }

    //BMI = (Weight in Kilograms / (Height in Meters x Height in Meters))
    public double metricBMI() {
        try {
            System.out.println("Enter your weight in kilograms: ");
            double weightKg = input.nextDouble();

            System.out.println("Enter your height in centimetars: ");
            double heightCm = input.nextDouble();
            heightCm /= 100;
            double metricBMI = (weightKg / (heightCm * heightCm));
            System.out.printf("Your BMI is: %d\n", Math.round(metricBMI));
            if (metricBMI > 0 && metricBMI < 18.5){
                System.out.println("You are underweight. (BMI less than 18.5)");    
            }
             else if  (metricBMI > 18.5 && metricBMI < 24.9){
                 System.out.println("You are normal/healthy weight. (BMI between 18.5 and 24.9)"); 
             }
             else if (metricBMI > 24.9 && metricBMI < 29.9){
                 System.out.println("You are overweight. (BMI between 24.9 and 29.9)");
             }
             else if (metricBMI > 29.9){
                 System.out.println("You are obese overweight. (BMI is greater than 29.9");
             }
            return Math.round(metricBMI);
            
        } catch (InputMismatchException e) {
            System.out.println("MismatchException!");
            input.next();

        }
        return Math.round(metricBMI());

    }
//BMI = (Weight in Pounds / (Height in inches x Height in inches)) x 703

    public double imperialEnglishBMI() {
        try {
            System.out.println("Enter your weight in pounds:");
            double pounds = input.nextDouble();

            System.out.println("Enter your height in inches:");
            double inchHeight = input.nextDouble();

            double imperialBMI = (pounds / (inchHeight * inchHeight)) * 703;
            double roundedBMI = Math.round(imperialBMI);
            System.out.printf("Your BMI is: %d\n", Math.round(imperialBMI));
             if (roundedBMI > 0 && roundedBMI < 18.5){
                System.out.println("You are underweight. (BMI less than 18.5)");    
            }
             else if  (roundedBMI > 18.5 && roundedBMI < 24.9){
                 System.out.println("You are normal/healthy weight. (BMI between 18.5 and 24.9)"); 
             }
             else if (roundedBMI > 24.9 && roundedBMI < 29.9){
                 System.out.println("You are overweight. (BMI between 24.9 and 29.9)");
             }
             else if (roundedBMI > 29.9){
                 System.out.println("You are obese overweight. (BMI is greater than 29.9");
             }
            return roundedBMI;
           

        } catch (InputMismatchException e) {
            System.out.println("MismatchException! ");
            input.next();
            
        }
        
        return Math.round(imperialEnglishBMI());
        
    }

}
