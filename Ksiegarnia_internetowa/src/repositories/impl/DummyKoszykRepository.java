package repositories.impl;

import java.util.List;


import domain.Koszyk;
import domain.Ksiazka;
import domain.User;
import repositories.IKoszykRepository;


public class DummyKoszykRepository implements IKoszykRepository {
	private DummyDb db;
	
	public DummyKoszykRepository(DummyDb db) {
		super();
		this.db = db;
	}

	@Override
	public void add(Koszyk entity) {
		db.koszyki.add(entity);
		
	}

	@Override
	public void update(Koszyk entity) {
		
		
	}

	@Override
	public void delete(Koszyk entity) {
		db.koszyki.remove(entity);
		
	}

	@Override
	public Koszyk get(int id) {
		for(Koszyk k:db.koszyki)
			if(k.getId()==id)
				return k;
		return null;
	}

	@Override
	public List<Koszyk> getAll() {
		// TODO Auto-generated method stub
		return db.koszyki;
	}

	@Override
	public Koszyk withKsiazka(String tytul) {
		// TODO Auto-generated method stub
		for(Ksiazka k:db.ksiazki)
			if(k.getTytul() == tytul)
				return k.getKsiazki();
			return new Koszyk();
			
	}

	@Override
	public Koszyk withUser(User kupujacy) {
		// TODO Auto-generated method stub
		return withUser(kupujacy.getId());
	}
	

}
