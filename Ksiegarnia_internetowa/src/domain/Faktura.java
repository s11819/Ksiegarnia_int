package domain;

public class Faktura extends Entity {
	private String nrFaktury;
	private User dane;
	private Koszyk produkty;
	public Faktura(){
		setId(1);
		nrFaktury="FVS-14/10/2054-1";
		dane = new User();
		produkty = new Koszyk();
	}
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
