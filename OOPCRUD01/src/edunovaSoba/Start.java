package edunovaSoba;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Start {
	// Program omogućuje CRUD entitet tipa soba dok se ne prekine unos (slovo t).
	//Unos svih podataka se kontrolira i onemogućen je nastavak rada dok se ne unese tražena vrijednost.
	//Nakon završetka unosa aplikacija ispisuje vrijednost svojstva posuden s svih instanca unesenih entiteta tipa soba. 
	//Za sve datumske tipove podataka u entitetu program pronalazi se najmanje uneseni datum na svim unesenim instancama entiteta soba. 
	//Potrebno je napraviti metodu koja pri pokretanju programa unosi test slučajno 20 generiranih entiteta s svim popunjenim svojstvima.
	private List<Soba> sobe;
	
	public Start() throws ParseException {
		sobe = new ArrayList<Soba>(); 
		izbornik();
	}
	
	
	private void izbornik() {
		System.out.println("++++++++++++++++++++");
		System.out.println(" 1. Unos nove sobe");
		System.out.println(" 2. Pregled sobe");
		System.out.println(" 3. Izmjena sobe");
		System.out.println(" 4. Brisanje sobe");
		System.out.println(" 5. Izvjestaj");
		System.out.println("IZLAZ Pritisni slovo 'T'");
		System.out.println("++++++++++++++++++++\n");
	    odrediAkciju();
	   
	}
	private List<Program> noviProgram() {
		List<Program> programi = new ArrayList<Program>();
		while(true) {
			if(!Pomocno.ucitajString("Unos novog programa DA?")
					.trim().toLowerCase().equals("da")) {
				break;
			}
			programi.add(unesiProgram());
		}
	return	programi;
	}
	private Program unesiProgram() {
		Program program = new Program();
		program.setNaziv(Pomocno.ucitajString("Unesi naziv programa:"));
        program.setMobitel(Pomocno.ucitajBroj("Unesi broj telefona:"));
		program.setPrezime(Pomocno.ucitajString("Unesi prezime"));
		program.setSifra(Pomocno.ucitajBroj("Upisi sifru"));
		program.setObrisan(Pomocno.zabranjeno("Upisi da li je obrisan DA/NE"));
		try {
			program.setDatum(Pomocno.unesiDatum("Unesi datum programa"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return program;
		
		}
		private void odrediAkciju() {
		//String akcija = Pomocno.ucitajSlovo("Upisi slovo");
		String akcija = Pomocno.ucitajString("Opcije upisi 1-5, IZLAZ upisi 't'");
		switch (akcija) {
		case "1":
			System.out.println("## UNOS NOVE SOBE ##");
			unosNoveSobe();
			break;
		case "2":
			pregledSobe();
			break;
		case "3": 
			izmjenaSobe();
			break;
		case "4": 
			brisanjeSobe();
			break;
		case "5":
			izvjestaj();
			break;
		case "t":
			System.out.println("Dovidjenja");
			return;
		

		default:
			System.out.println("nepostojeci unos");
			
		}
		izbornik();
		}
		
		
		
	
	
private void izvjestaj() {
			// TODO Auto-generated method stub
			
		}
private void brisanjeSobe() {
			// TODO Auto-generated method stub
			
		}
private void izmjenaSobe() {
			// TODO Auto-generated method stub
			
		}
private void pregledSobe() {
			System.out.println("+++ SOBE U SUSTAVU +++");
			int i =1; 
			for (Soba soba : sobe) {
				System.out.println(i++ + ". ");
				System.out.println(soba);
				for (Program program : soba.getSvojstvaPrograma()) {
					System.out.println("\t " +"sifra: "+ program.getSifra()
					+ "\n " +"Naziv: "+  program.getNaziv() );
				}
//			
				}
			
			
			}
			
		
private void unosNoveSobe() {
			Soba soba = new Soba();
			
			soba.setSvojstvaPrograma(noviProgram());
//			soba.setSifra(Pomocno.ucitajBroj("Sifra Sobe je:"));
//						try {
//				soba.setNapravljen(Pomocno.unesiDatum("Upisi kada je soba napravljena:"));
//			} catch (ParseException e) {
//				
//				e.printStackTrace();
//			}
//			try {
//				soba.setKreiran(Pomocno.unesiDatum("Upisi kada je soba kreirana:"));
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			try {
//				soba.setPosudjen(Pomocno.unesiDatum("Upisi kada je soba posudjena:"));
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			soba.setPostanskiBroj(Pomocno.ucitajBroj("Upisi postanski broj:"));
//			
			soba.setZabranjen(Pomocno.zabranjeno("Je li soba zabranjena DA/NE?"));
			sobe.add(soba);
			System.out.println("Vrijednost " + soba + " je uspjesno dodana" );
		
}

public static void main(String[] args) throws ParseException{
	new Start();
}
}
