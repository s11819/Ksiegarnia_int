package User;

import java.util.ArrayList;
import java.util.List;

public class Dane {
	private String imie;
	private String nazwisko;
	private String nr_tel;
	private List<Adres> adresy;
	public Dane(){
		this.adresy = new ArrayList<Adres>();
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getNr_tel() {
		return nr_tel;
	}
	public void setNr_tel(String nr_tel) {
		this.nr_tel = nr_tel;
	}
	public List<Adres> getAdresy() {
		return adresy;
	}
	public void setAdresy(List<Adres> adresy) {
		this.adresy = adresy;
	}
	
}
