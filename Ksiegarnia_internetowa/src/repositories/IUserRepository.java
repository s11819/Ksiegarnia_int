package repositories;

import domain.*;

public interface IUserRepository extends IRepository<User> {
	public Faktura withFaktura (Faktura faktura);
	public Faktura withFaktura (int fakturaId);
}
