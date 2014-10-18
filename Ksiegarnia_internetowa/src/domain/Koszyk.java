package domain;

import java.util.ArrayList;
import java.util.List;

public class Koszyk extends Entity {
	private List<Ksiazka> ksiazki;
	private float kosztCalkowity;
	public Koszyk (){
		setId(1);
		kosztCalkowity = 256;
		this.ksiazki = new ArrayList<Ksiazka>();
	}
	public List<Ksiazka> getKsiazki() {
		return ksiazki;
	}
	public void setKsiazki(List<Ksiazka> ksiazki) {
		this.ksiazki = ksiazki;
	}
	public float getKosztCalkowity() {
		return kosztCalkowity;
	}
	public void setKosztCalkowity(float kosztCalkowity) {
		this.kosztCalkowity = kosztCalkowity;
	}
	
}
