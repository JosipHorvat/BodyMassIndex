/** Metode koje ce se pozivati
 * po izboru korisnika
**/ 
package bodyMassIndex;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Formule  {
	
	private double centimetar;
	private double inch;
	private double kilogram; 
	private double pound;
	private double rezultat=0;
	
	Opcije opcije = new Opcije();
	Scanner input = new Scanner(System.in);
	
	public  void cmUInch() {
		try {
			System.out.println("Unesi vrijednost u centimetrima:" );	
			centimetar = input.nextFloat();
			if(centimetar < 1) {
				System.out.println("Nije moguce izracunati unesenu vrijednost.");
				cmUInch();
			}

			rezultat = centimetar * 0.39370;
			System.out.printf("%f cm je %f incha", centimetar,rezultat );
			
		}
		catch (InputMismatchException e) {
			System.out.println("MismatchException!");
			//input.next()
		}
      }
public void inchUCm() {
		
	try {
		System.out.println("Unesi vrijednost u inchima:");
		inch = input.nextDouble();
		if(inch < 1) {
			System.out.println("Nije moguce izracunati unesenu vrijednost.");
			inchUCm();
		}
		rezultat = inch*2.54;
		System.out.printf("%f incha je %f centimetara.", inch,rezultat);
	}catch(InputMismatchException e) {
		System.out.println("MissMatchException!");	
	 }
	}
	
public void poundUKg() {
	try {
	System.out.println("Unesi vrijednost u pounds:");
	pound = input.nextDouble();
	if(pound < 1) {
		System.out.println("Nije moguce izracunati unesenu vrijednost.");
		poundUKg();
	}
	rezultat = pound*0.454;
	System.out.printf("%f pounds je %f kilograma.", pound,rezultat);
	}catch(InputMismatchException e) {
		System.out.println("MissMatchException!");	
	 }
}

public void kgUPound() {
	try {
	System.out.println("Unesi vrijednost u Kilogramima:");
	input.nextDouble();
	if(kilogram < 1) {
		System.out.println("Nije moguce izracunati unesenu vrijednost.");
		kgUPound();
	}
	rezultat = kilogram/ 0.45359237;
	System.out.printf("%f kilograma je %f pounds.", kilogram,rezultat);
	
	
	}catch(InputMismatchException e) {
		System.out.println("MissMatchException!");
}
	}

public void metricBMI() {
	try {
		System.out.println("Upisi svoju tezinu u kilogramima:");
	     kilogram = input.nextDouble();
		System.out.println("Upisi svoju visinu u centrimetrima");
	    centimetar = input.nextDouble();
		if(kilogram<1 || centimetar <1) {
			System.out.println("Nije moguce izracunati unesenu vrijednost, pokusaj ponovno!");
			metricBMI();
		}
		centimetar/=100;
		rezultat = (kilogram / (centimetar*centimetar));
		System.out.printf("Tvoj BMI je %d.\n", Math.round(rezultat));
		bmiVrijednosti();
		
	}catch(InputMismatchException e) {
		System.out.println("MissMatchException!");	
	 }
	
}
public void bmiVrijednosti() {
	if (rezultat > 0 && rezultat <= 18.5 ) {
		System.out.println("Tvoja BMI je ispod prosjeka normalne tezine. Mrsav/a si!");
	}
	if (rezultat > 18.5 && rezultat < 24.9) {
		System.out.println("Tvoj BMI je u prosjeku normalne tjelsesne tezine.");
	}
	else if(rezultat > 24.9 && rezultat < 29.9) {
		System.out.println("Tvoj BMI je iznad prosjeka normalne tjelesne tezine. Imas viska kilograma.");
	}
	else if(rezultat > 29.9) {
		System.out.println("Tvoj BMI je daleko veci od prosjeka normlane tjelesne tezine. Pretil/a si.");
	}
}
public void EngleskiBMI() {
	try {
		System.out.println("Upisi svoju tezinu u pounds:");
	     pound = input.nextDouble();
		System.out.println("Upisi svoju visinu u inch");
	    inch = input.nextDouble();
		if(pound<1 || inch <1) {
			System.out.println("Nije moguce izracunati unesenu vrijednost, pokusaj ponovno!");
			EngleskiBMI();
		}
		rezultat = (pound/(inch*inch))	*703;
		System.out.printf("Tvoj BMI je %d. ", Math.round(rezultat));
		bmiVrijednosti();
	}catch(InputMismatchException e) {
		System.out.println("MissMatchException!");	
		
	 }
	
}
}

