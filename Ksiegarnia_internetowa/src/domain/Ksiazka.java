package domain;

public class Ksiazka extends Entity {
	private String Tytul;
	private int rok_wydania;
	private String ISBN;
	private String autor;
	private String dostepnosc;
	private float cena;
	public Ksiazka (){
		setId(1);
		Tytul = "Krew Elfów";
		rok_wydania = 1994;
		ISBN = "83-7054-079-1";
		autor = "Sapkowski";
		dostepnosc = "Tak";
		cena = 30;
	}
	public String getTytul() {
		return Tytul;
	}
	public void setTytul(String tytul) {
		Tytul = tytul;
	}
	public int getRok_wydania() {
		return rok_wydania;
	}
	public void setDostepnosc(String Dostepnosc) {
		Dostepnosc = dostepnosc;
	}
	public String getDostepnosc() {
		return dostepnosc;
	}
	public void setRok_wydania(int rok_wydania) {
		this.rok_wydania = rok_wydania;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public float getCena(){
		return cena;
	}
	public void setCena(int Cena){
		cena = Cena;
	}
}
