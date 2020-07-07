package edunovaSoba;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.time.*;

public class Soba {
	//Za entitet soba potrebno je definirati sljedeća svojstva:
	//šifra (znakovni tip), zabranjen (logička vrijednost), napravljen (datum),
	//posuden (datum), poštanski broj (znakovni tip), kreiran (datum) te program
	
	
	 private int sifra;
	 private boolean zabranjen;
	 private LocalDate napravljen;
	 private LocalDate posudjen;
	 private int postanskiBroj;
	 private LocalDate kreiran;
	 private List<Program> svojstvaPrograma;
	 
	public Soba() {
		
	}
	

	public Soba(int sifra, boolean zabranjen, LocalDate napravljen, LocalDate posudjen, int postanskiBroj,
			LocalDate kreiran, List<Program> svojstvaPrograma) {
		super();
		this.sifra = sifra;
		this.zabranjen = zabranjen;
		this.napravljen = napravljen;
		this.posudjen = posudjen;
		this.postanskiBroj = postanskiBroj;
		this.kreiran = kreiran;
		this.svojstvaPrograma = svojstvaPrograma;
	}


	public int getSifra() {
		return sifra;
	}


	public void setSifra(int sifra) {
		this.sifra = sifra;
	}


	public boolean isZabranjen() {
		return zabranjen;
	}


	public void setZabranjen(boolean zabranjen) {
		this.zabranjen = zabranjen;
	}


	public LocalDate getNapravljen() {
		return napravljen;
	}


	public void setNapravljen(LocalDate napravljen) {
		this.napravljen = napravljen;
	}


	public LocalDate getPosudjen() {
		return posudjen;
	}


	public void setPosudjen(LocalDate posudjen) {
		this.posudjen = posudjen;
	}


	public int getPostanskiBroj() {
		return postanskiBroj;
	}


	public void setPostanskiBroj(int postanskiBroj) {
		this.postanskiBroj = postanskiBroj;
	}


	public LocalDate getKreiran() {
		return kreiran;
	}


	public void setKreiran(LocalDate date) {
		this.kreiran = date;
	}


	public List<Program> getSvojstvaPrograma() {
		return svojstvaPrograma;
	}


	public void setSvojstvaPrograma(List<Program> svojstvaPrograma) {
		this.svojstvaPrograma = svojstvaPrograma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Soba je napravljena "+ napravljen + "\n");
		sb.append("Soba je kreirana " +  kreiran +  "\n");
		sb.append("Soba je posudjena " + posudjen + "\n");
		sb.append("Soba je zabranjena? " +zabranjen + "\n");
		return sb. toString();
	}



}
