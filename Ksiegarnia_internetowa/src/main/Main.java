package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

import repositories.*;
import repositories.impl.*;
import domain.*;
public class Main {

	public static void main(String[] args) {
		//IRepositoryCatalog catalog = new DummyRepositoryCatalog();
		String user = "root";
		String password = "";
		String url = "jdbc:mysql://localhost/";
		//List<User> buyer = catalog.getUser().withFaktura(1);
		//List<Ksiazka> buyer = catalog.getKsiazka().withAutor("Sapkowski");
		Autor asapkowski = new Autor();
		asapkowski.setImie("Andrzej");
		asapkowski.setNazwisko("Sapkowski");
		User damian = new User();
		damian.setImie("Damian");
		damian.setNazwisko("Wiczkowski");
		damian.setMiasto("Bolszewo");
		damian.setMail("s11819@pjwstk.edu.pl");
		damian.setNrdomu("91a");
		damian.setUlica("Szkolna");
		damian.setTelefon("788788788");
		Ksiazka chrzest = new Ksiazka();
		chrzest.setTytul("Chrzest Ognia");
		chrzest.setISBN("345-342-5325");
		chrzest.setRok_wydania(1999);
		chrzest.setDostepnosc("tak");
		chrzest.setCena(17.3);
		try 
		{
			
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connection = DriverManager.getConnection(url,user,password);
			Statement stt = connection.createStatement();
			CreateDB stworzbaze = new CreateDB(url, password, user);
			stworzbaze.CreateDBs();
			stt.execute("USE testpol");
			IRepository<Autor> autors = new AutorRepository(connection);
			autors.add(asapkowski);
			IRepository<User> users = new UserRepository(connection);
			users.add(damian);
			IRepository<Ksiazka> ksiazki = new KsiazkaRepository(connection);
			ksiazki.add(chrzest);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("koniec");
	}

}
