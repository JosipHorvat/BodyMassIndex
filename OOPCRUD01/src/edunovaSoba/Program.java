package edunovaSoba;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
	
	 //Za entitet Program potrebno je definirati sljedeća svojstva: šifra (znakovni tip),
	//obrisan (logička vrijednost), naziv (znakovni tip), datum (datum), prezime (znakovni tip) i mobitel (znakovni tip). 
private int sifra;
private boolean obrisan;
private String naziv;
private String prezime;
private Date datum;
private int mobitel;

  public Program() {

  }
  
  public Program(int sifra, boolean obrisan, String naziv, String prezime, Date datum, int mobitel) {

	this.sifra = sifra;
	this.obrisan = obrisan;
	this.naziv = naziv;
	this.prezime = prezime;
	this.datum = datum;
	this.mobitel = mobitel;
}


public int getSifra() {
	return sifra;
}

public void setSifra(int sifra) {
	this.sifra = sifra;
}

public boolean isObrisan() {
	return obrisan;
}

public void setObrisan(boolean obrisan) {
	this.obrisan = obrisan;
}

public String getNaziv() {
	return naziv;
}

public void setNaziv(String naziv) {
	this.naziv = naziv;
}

public String getPrezime() {
	return prezime;
}

public void setPrezime(String prezime) {
	this.prezime = prezime;
}

public Date getDatum() {
	return datum;
}

public void setDatum(Date datum) {
	this.datum = datum;
}

public int getMobitel() {
	return mobitel;
}

public void setMobitel(int mobitel) {
	this.mobitel = mobitel;
}
  
}
