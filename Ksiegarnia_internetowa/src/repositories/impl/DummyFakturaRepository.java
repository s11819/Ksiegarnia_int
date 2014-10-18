package repositories.impl;

import java.util.List;

import domain.Faktura;
import domain.User;
import repositories.IFakturaRepository;

public class DummyFakturaRepository implements IFakturaRepository {
	private DummyDb db;
	public DummyFakturaRepository(DummyDb db) {
		super();
		this.db = db;
	}
	@Override
	public void add(Faktura entity) {
		db.faktury.add(entity);	
		
	}

	@Override
	public void update(Faktura entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Faktura entity) {
		db.faktury.remove(entity);
		
	}

	@Override
	public Faktura get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Faktura> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Faktura> withUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Faktura> withUser(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Faktura> withUser(String nrFaktury) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
