package repositories;

import domain.*;

public interface IKoszykRepository extends IRepository<Koszyk> {
	public Koszyk withKsiazka(String ksiazka);
	public Koszyk withUser(User kupujacy);
}
