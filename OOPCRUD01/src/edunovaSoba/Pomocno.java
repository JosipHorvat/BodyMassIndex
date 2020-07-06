package edunovaSoba;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.JOptionPane;


public class Pomocno {
	
	public static Date unesiDatum(String datum) throws ParseException {
		
	while(true) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.parse(JOptionPane.showInputDialog(datum));
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Krivi unos");
		}
	}
	
	}
	
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

}
