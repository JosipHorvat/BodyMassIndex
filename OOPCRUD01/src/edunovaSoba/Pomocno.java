package edunovaSoba;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

import javax.swing.JOptionPane;


public class Pomocno {
	
	
	
	public static int randomIntIzmedju(int start, int kraj) {
		return start + (int) Math.round(Math.random() * (kraj - start));
	}

	
	public static LocalDate randomDatum(int pocetnaGodina, int krajGodine) {
		int dan = randomIntIzmedju(1, 28 );
		int mjesec = randomIntIzmedju(1, 12);

		
		int godina = randomIntIzmedju(pocetnaGodina, krajGodine);
	return LocalDate.of(godina, mjesec, dan);
	}
	
	
	//METODA ZA DATUME
	public static LocalDate lokalDatum(String poruka) {
		while(true) {
	try {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(""
				+ "dd/MM/yyyy");
		LocalDate date;	
		return   date = LocalDate.parse(JOptionPane.showInputDialog(poruka),dateFormat);
	}catch(DateTimeParseException e) {
		JOptionPane.showMessageDialog(null, "Krivi unos, pokusaj ponovno!");
	}
	}

		
	}
	//METODA ZA BROJEVE
	public static int ucitajBroj(String poruka) {
		while(true) {
			try {
				return Integer.parseInt(
						JOptionPane.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
		}
	}
// METODA ZA STRING
	public static String ucitajString(String poruka) {
		String s;
		while(true) {
			s= JOptionPane.showInputDialog(poruka);
			if(s.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Obavezan unos");
			continue;
			}
			return s;
		}
		
	}
	
	// METODA ZA BOOLEAN
	public static boolean zabranjeno(String poruka) {
		String zabranjeno;
		boolean daIliNe = false;
		while(true) {
			zabranjeno = JOptionPane.showInputDialog(poruka);
			if (!zabranjeno.trim().toLowerCase().equals("da")
				|| !zabranjeno.trim().toLowerCase().equals("ne") ) {
				break;
			}
		}
		if (zabranjeno == "da") {
			daIliNe= true;
			if(zabranjeno == "ne"){
				daIliNe =false;
			}
			
		}
		return daIliNe;
		}
	
}//KRAJ
	
	

	

	
	// 3 FAIL METODE ZA DATUME (ISTRAZITI POSLIJE)
	
		
//		public static LocalDateTime ucitajdatum(LocalDateTime datum) {
//		
//		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		datum = LocalDateTime.parse(JOptionPane.showInputDialog("Upisi datum"), date);
//		
//		return datum;
//		}
		
	
//		public static Date ucitajDatum(String poruka) {
//		Date date = new Date();
//		System.out.println("Upisi datum");
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		 date = null;
//		
//	   
//		try{
//			 String datum = JOptionPane.showInputDialog(poruka);
//			date = dateFormat.parse(datum);
//		}catch(ParseException e) {
//			e.printStackTrace();
//		}
//		
//		return date;
//	}
	
	
//	public static Date unesiDatum(String datum) throws ParseException {
//		
//		while(true) {
//			try {
//				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//				return sdf.parse(JOptionPane.showInputDialog(datum));
//				
//			}catch(Exception e) {
//				JOptionPane.showMessageDialog(null, "Krivi unos");
//			}
//		}
//		
//		}


