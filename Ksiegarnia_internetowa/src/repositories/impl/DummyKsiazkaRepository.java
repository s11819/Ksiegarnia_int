package repositories.impl;

import java.util.List;

import domain.Autor;
import domain.Ksiazka;
import repositories.IKsiazkaRepository;

public class DummyKsiazkaRepository implements IKsiazkaRepository {

	private DummyDb db;
	public DummyKsiazkaRepository(DummyDb db) {
		super();
		this.db = db;
	}
	
	@Override
	public void add(Ksiazka entity) {
		db.ksiazki.add(entity);
		
	}

	@Override
	public void update(Ksiazka entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Ksiazka entity) {
		db.ksiazki.remove(entity);
		
	}

	@Override
	public Ksiazka get(int id) {
		// TODO Auto-generated method stub
		for(Ksiazka k:db.ksiazki)
			if(k.getId()==id)
				return k;
		return null;
	}

	@Override
	public List<Ksiazka> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ksiazka> withAutor(Autor autor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ksiazka> withAutor(int autorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ksiazka withAutor(String tytul) {
		// TODO Auto-generated method stub
		return null;
	}

}
