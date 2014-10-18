package repositories.impl;

import java.util.ArrayList;
import java.util.List;

import domain.Faktura;
import domain.User;
import repositories.IUserRepository;

public class DummyUserRepository implements IUserRepository {

	private DummyDb db;
	public DummyUserRepository(DummyDb db) {
		super();
		this.db = db;
	}
	@Override
	public void add(User entity) {
		db.users.add(entity);
		
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User entity) {
		db.users.remove(entity);
		
	}

	@Override
	public User get(int id) {
		for(User u:db.users)
			if(u.getId()==id)
				return u;
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return db.users;
	}

	@Override
	public List<User> withFaktura(Faktura faktura) {
		// TODO Auto-generated method stub
		return withFaktura(faktura.getId());
	}

	@Override
	public List<User> withFaktura(int fakturaId) {
		for(Faktura f:db.faktury)
			if(f.getId()==fakturaId)
				return (List<User>) f.getDane();
			return new ArrayList<User>();
	}

}
