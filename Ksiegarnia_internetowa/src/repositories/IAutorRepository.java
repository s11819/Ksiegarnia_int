package repositories;

import domain.*;

public interface IAutorRepository extends IRepository<Autor> {
	public Autor byKsiazka (Ksiazka ksiazka);
	public Autor byKsiazka (int ksiazkaId);
}
