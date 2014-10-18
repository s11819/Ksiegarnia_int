package repositories;

import java.util.List;

import domain.*;

public interface IUserRepository extends IRepository<User> {
	public List<User> withFaktura (Faktura faktura);
	public List<User> withFaktura (int fakturaId);
}
