package repositories;

import java.util.List;

import domain.*;

public interface IKsiazkaRepository extends IRepository<Ksiazka> {
	public List<Ksiazka> withAutor (Autor autor);
	public List<Ksiazka> withAutor (int autorId);
	public List<Ksiazka> withAutor (String nazwisko);
}
