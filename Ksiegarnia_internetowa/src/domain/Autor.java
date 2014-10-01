package domain;

import java.util.ArrayList;
import java.util.List;

public class Autor {
	private String imie;
	private String nazwisko;
	private List<Ksiazka> ksiazki;
	
	public Autor() {
		super();
		this.ksiazki = new ArrayList<Ksiazka>();
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

	public List<Ksiazka> getKsiazki() {
		return ksiazki;
	}

	public void setKsiazki(List<Ksiazka> ksiazki) {
		this.ksiazki = ksiazki;
	}
	
}
