package repositories;

import domain.*;

public interface IKsiazkaRepository extends IRepository<Ksiazka> {
	public Ksiazka byAutor (Autor autor);
	public Ksiazka byAutor (int autorId);
}
