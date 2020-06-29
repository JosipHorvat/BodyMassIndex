package bodyMassIndex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//1. odabir  iz izbornika: ako je 1 ili 2 == bmi i konvert. Ako == 3 EXIT
//2. Kada se izabere od opcija otvaraju se nove opcije a zadnja opcija je RETURN  koja vraca prvi izbornik. 
//3. Ako je 3, app zavrsava sa radom

public class Start extends Formule {

	public static void main(String[] args) {
		Formule formule = new Formule();
		Opcije opcije = new Opcije();
		//formule.cmUInch();
        //formule.inchUCm();
		//formule.poundUKg();
		//formule.metricBMI();
		//formule.EngleskiBMI();
		opcije.prviIzbornik();
		opcije.bmiIzbornik();
		
		
	}
	
	// prvi izbornik
	public void  prviIzbornik() {	
		
		Formule formule = new Formule();
		int izaberiOpciju = 0;
		   Scanner input = new Scanner(System.in);
	
		   
		do {
				
		ArrayList <String> izbornik = new ArrayList<String>();
		izbornik.add("Konverzije CM/KG - Inch/Pounds");
		izbornik.add("Indeks tjelesne tezine");
		izbornik.add("EXIT");
		
		int j = 1;
        for (int i = 0; i < izbornik.size(); i++) {
            System.out.println(j + ". " + izbornik.get(i));
            j++;   
        }
        try {
        izaberiOpciju = input.nextInt();
        }catch (InputMismatchException e) {
            System.err.println("MissMatchException! ");
            input.next();
            izaberiOpciju = 0;
            continue;
            
          
        }
        switch(izaberiOpciju) {
        case 1: {
        	formule.metricBMI();
        	break;
        }
        case 2: {
        	bmiIzbornik();
        }
        case 3: {
        	prviIzbornik();
        }
        }
       
		}while (izaberiOpciju <1 || izaberiOpciju>3);
		
        
        // drugi izbornik
		
	}
	
	
	public   void bmiIzbornik() {
		Formule formule = new Formule();
		int izaberiOpciju;
		do {
    ArrayList <String> opcija = new ArrayList();
	opcija.add("Izracunaj metricki BMI.");
	opcija.add("Izracunaj Imperial/Engleski BMI.");
	opcija.add("RETURN");
	
	int j = 1;
    for (int i = 0; i < opcija.size(); i++) {
        System.out.println(j + ". " + opcija.get(i));
        j++;   
    }
    try {
    izaberiOpciju = input.nextInt();
    }catch (InputMismatchException e) {
        System.err.println("MissMatchException! ");
        input.next();
        izaberiOpciju = 0;
        continue;
         }
    
    switch(izaberiOpciju) {
    case 1: {
    	formule.metricBMI();
    	break;
    }
    case 2: {
    	formule.EngleskiBMI();
    }
    case 3: {
    	prviIzbornik();
    }
    }
   
	
	}while (izaberiOpciju <1 || izaberiOpciju>3);

	
	
}

	
	
//	public void converterIzbornik() {
//	ArrayList <String> opcija = new ArrayList();
//	opcija.add("Konvertiraj centimetre u inche");
//	opcija.add("Konvertiraj inche u metre/cm");
//	opcija.add("Konvertiraj kilograme u pounds ");
//	opcija.add("Konvertiraj pounds u kilograme");
//	opcija.add("RETURN");
//	}
}
