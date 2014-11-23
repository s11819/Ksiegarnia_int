package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDB {
	private String url;
	private String password;
	private String user;
	
	public CreateDB(String url, String password, String user) {
		super();
		this.url = url;
		this.password = password;
		this.user = user;
	}

	public void CreateDBs(){
	try{
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	Connection connection = DriverManager.getConnection(url,user,password);
	Statement stt = connection.createStatement();
	stt.execute("CREATE DATABASE IF NOT EXISTS testpol");
	stt.execute("USE testpol");
	stt.execute("DROP TABLE IF EXISTS autor");
	stt.execute("DROP TABLE IF EXISTS ksiazka");
	stt.execute("DROP TABLE IF EXISTS koszyk");
	stt.execute("DROP TABLE IF EXISTS faktura");
	stt.execute("DROP TABLE IF EXISTS user");
	String createTable =
			"CREATE TABLE autor("
			+ "id BIGINT NOT NULL AUTO_INCREMENT,"
			+ "imie VARCHAR(20),"
			+ "nazwisko VARCHAR(40),"
			+ "PRIMARY KEY(id)"
            + ")";
			stt.executeUpdate(createTable);
	createTable =
			"CREATE TABLE user("
			+ "id BIGINT NOT NULL AUTO_INCREMENT,"
			+ "imie VARCHAR(20),"
			+ "nazwisko VARCHAR(40),"
			+ "ulica VARCHAR(50),"
			+ "miasto VARCHAR(30),"
			+ "nrdomu VARCHAR(6),"
			+ "telefon VARCHAR(10),"
			+ "mail VARCHAR(20),"
			+ "PRIMARY KEY(id)"
            + ")";
			stt.executeUpdate(createTable);
	createTable =
			"CREATE TABLE faktura("
			+ "id BIGINT NOT NULL AUTO_INCREMENT,"
			+ "nrfaktury CHAR(20),"
			+ "PRIMARY KEY(id)"
		    + ")";
			stt.executeUpdate(createTable);
	createTable =
			"CREATE TABLE koszyk("
			+ "id BIGINT NOT NULL AUTO_INCREMENT,"
			+ "kosztcal DOUBLE(7,2),"
			+ "PRIMARY KEY(id)"
			+ ")";
			stt.executeUpdate(createTable);
	createTable =
			"CREATE TABLE ksiazka("
			+ "id BIGINT NOT NULL AUTO_INCREMENT,"
			+ "tytul VARCHAR(50),"
			+ "rokwydania INT,"
			+ "isbn VARCHAR(30),"
			+ "dostepnasc ENUM(\"tak\",\"nie\"),"
			+ "cena DOUBLE(3,2),"
			+ "PRIMARY KEY(id)"
			+ ")";
			stt.executeUpdate(createTable);
	}catch(Exception e)
	{
		e.getStackTrace();
	}
	}
}
