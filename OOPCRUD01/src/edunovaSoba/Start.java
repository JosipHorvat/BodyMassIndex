package edunovaSoba;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.swing.text.DefaultEditorKit.BeepAction;



public class Start {
	// Program omogućuje CRUD entitet tipa soba dok se ne prekine unos (slovo t).
	//Unos svih podataka se kontrolira i onemogućen je nastavak rada dok se ne unese tražena vrijednost.
	//Nakon završetka unosa aplikacija ispisuje vrijednost svojstva posuden s svih instanca unesenih entiteta tipa soba. 
	//Za sve datumske tipove podataka u entitetu program pronalazi se najmanje uneseni datum na svim unesenim instancama entiteta soba. 
	//Potrebno je napraviti metodu koja pri pokretanju programa unosi test slučajno 20 generiranih entiteta s svim popunjenim svojstvima.
	private List<Soba> sobe;
	
	public Start()  {
		sobe = new ArrayList<Soba>(); 
		//slucajneSobe();
		//izbornik();
		randomSobe();
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
	//Potrebno je napraviti metodu koja pri pokretanju programa unosi test slučajno 20 generiranih entiteta s svim popunjenim svojstvima.
private void randomSobe () {
	// za datume uzimam RANDOMDATUM koji sadrzi pocetak godine i kraj!!
	
//preurediti output da je uredno ispisan
	//dodati petlju za redne brojeve soba!
	//metoda za random :
	//1. kreiran local date
	//2. posudjen local date
	//3. int postanski broj min 1000 max 9999 velicine
	//4 int sifra min 1 max 10000
	// boolean zabranjen 
	Soba soba = new Soba();
	//soba.set
	for(int i = 1; i<=20; i++) {
		soba.setNapravljen(Pomocno.randomDatum(1000, 2019));
		sobe.add(soba);
		System.out.println("Soba" + soba + "je uspjesno dodana");
	}
	
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
		program.setDatum(Pomocno.lokalDatum("Unesi datum programa"));
		
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
			
			soba.setSifra(Pomocno.ucitajBroj("Sifra Sobe je:"));
						
			soba.setNapravljen(Pomocno.lokalDatum("Upisi kada je soba napravljena:"));
			soba.setKreiran(Pomocno.lokalDatum("Upisi kada je soba kreirana:"));
			soba.setPosudjen(Pomocno.lokalDatum("Upisi kada je soba posudjena:"));
			
			soba.setPostanskiBroj(Pomocno.ucitajBroj("Upisi postanski broj:"));
			
			soba.setZabranjen(Pomocno.zabranjeno("Je li soba zabranjena DA/NE?"));
			
			sobe.add(soba);
			System.out.println("Vrijednost " + soba + " je uspjesno dodana" );
		
}

public static void main(String[] args) {
	new Start();
}
}
