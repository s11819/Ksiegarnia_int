package domain;

public class User extends Entity {
	private String imie;
	private String nazwisko;
	private String ulica;
	private String miasto;
	private String nrdomu;
	private String telefon;
	private String mail;
	private Koszyk koszyk;
	public User() {
		setId(1);
		imie = "Damian";
		nazwisko = "Wic";
		ulica = "Gdanska";
		miasto = "Gdansk";
		nrdomu = "91a";
		telefon = "788-788-788";
		mail = "s11819@pjwstk.edu.pl";
		koszyk = new Koszyk();
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
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public String getMiasto() {
		return miasto;
	}
	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}
	public String getNrdomu() {
		return nrdomu;
	}
	public void setNrdomu(String nrdomu) {
		this.nrdomu = nrdomu;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Koszyk getKoszyk() {
		return koszyk;
	}
	public void setKoszyk(Koszyk koszyk) {
		this.koszyk = koszyk;
	}
	
}
