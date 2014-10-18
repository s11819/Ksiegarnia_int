package repositories.impl;

import repositories.IRepositoryCatalog;

import repositories.IAutorRepository;
import repositories.IFakturaRepository;
import repositories.IKoszykRepository;
import repositories.IKsiazkaRepository;

import repositories.IUserRepository;
public class DummyRepositoryCatalog implements IRepositoryCatalog {
	private DummyDb db = new DummyDb();
	@Override
	public IKoszykRepository getKoszyk() {
		// TODO Auto-generated method stub
		return new DummyKoszykRepository(db);
	}

	@Override
	public IFakturaRepository getFaktura() {
		// TODO Auto-generated method stub
		return new DummyFakturaRepository(db);
	}

	@Override
	public IKsiazkaRepository getKsiazka() {
		// TODO Auto-generated method stub
		return new DummyKsiazkaRepository(db);
	}

	@Override
	public IUserRepository getUser() {
		// TODO Auto-generated method stub
		return new DummyUserRepository(db);
	}

	@Override
	public IAutorRepository getAutor() {
		// TODO Auto-generated method stub
		return new DummyAutorRepository(db);
	}
 
}
