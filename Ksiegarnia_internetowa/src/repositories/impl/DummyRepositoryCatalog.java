package repositories.impl;

import repositories.IRepositoryCatalog;
import domain.*;
import repositories.IAutorRepository;
import repositories.IFakturaRepository;
import repositories.IKoszykRepository;
import repositories.IKsiazkaRepository;
import repositories.IRepository;
import repositories.IRepositoryCatalog;
import repositories.IUserRepository;
public class DummyRepositoryCatalog implements IRepositoryCatalog {
	private DummyDb db = new DummyDb();
	@Override
	public IKoszykRepository getKoszyk() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IFakturaRepository getFaktura() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IKsiazkaRepository getKsiazka() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IUserRepository getUser() {
		// TODO Auto-generated method stub
		return new DummyUserRepository(db);
	}

	@Override
	public IAutorRepository getAutor() {
		// TODO Auto-generated method stub
		return null;
	}
 
}
