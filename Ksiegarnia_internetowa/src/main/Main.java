package main;

import java.util.List;

import repositories.*;
import repositories.impl.*;
import domain.*;
public class Main {

	public static void main(String[] args) {
		IRepositoryCatalog catalog = new DummyRepositoryCatalog();
		//List<User> buyer = catalog.getUser().withFaktura(1);
		List<Ksiazka> buyer = catalog.getKsiazka().withAutor("Sapkowski");
		
	}

}
