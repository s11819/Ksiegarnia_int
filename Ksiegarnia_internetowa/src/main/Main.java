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
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("koniec");
	}

}
