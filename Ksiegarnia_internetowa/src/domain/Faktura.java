package domain;

public class Faktura extends Entity {
	private String nrFaktury;
	private User dane;
	private Koszyk produkty;
	public String getNrFaktury() {
		return nrFaktury;
	}
	public void setNrFaktury(String nrFaktury) {
		this.nrFaktury = nrFaktury;
	}
	public User getDane() {
		return dane;
	}
	public void setDane(User dane) {
		this.dane = dane;
	}
	public Koszyk getProdukty() {
		return produkty;
	}
	public void setProdukty(Koszyk produkty) {
		this.produkty = produkty;
	}
	
}
