package repositories;

import domain.*;

public interface IKoszykRepository extends IRepository<Koszyk> {
	public Koszyk withKsiazka(Ksiazka ksiazka);
	public Koszyk withUser(User kupujacy);
}
