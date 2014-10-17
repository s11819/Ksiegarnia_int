package repositories;

public interface IRepositoryCatalog {
	public IKoszykRepository getKoszyk();
	public IFakturaRepository getFaktura();
	public IKsiazkaRepository getKsiazka();
	public IUserRepository getUser();
	public IAutorRepository getAutor();
}
