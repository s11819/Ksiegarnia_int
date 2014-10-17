package repositories;

import java.util.List;

import domain.*;

public interface IFakturaRepository extends IRepository<Faktura> {
	public List<Faktura> withUser (User user);
	public List<Faktura> withUser (int userid);
	public List<Faktura> withUser (String nrFaktury);
}
