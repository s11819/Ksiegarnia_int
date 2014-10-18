package repositories.impl;

import java.util.ArrayList;
import java.util.List;

import domain.Autor;
import domain.Faktura;
import domain.Ksiazka;
import domain.User;
import repositories.IAutorRepository;

public class DummyAutorRepository implements IAutorRepository {

	private DummyDb db;
	public DummyAutorRepository(DummyDb db) {
		super();
		this.db = db;
	}
	
	@Override
	public void add(Autor entity) {
		db.autorzy.add(entity);
		
	}

	@Override
	public void update(Autor entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Autor entity) {
		db.autorzy.remove(entity);
		
	}

	@Override
	public Autor get(int id) {
		for(Autor a:db.autorzy)
			if(a.getId()==id)
				return a;
		return null;
	}

	@Override
	public List<Autor> getAll() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Autor byKsiazka(Ksiazka ksiazka) {
		// TODO Auto-generated method stub
		
	}
	}

	@Override
	public Autor byKsiazka(int ksiazkaId) {
		// TODO Auto-generated method stub
		return null;
	}

}
