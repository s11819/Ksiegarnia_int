package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Ksiazka;
import repositories.IRepository;

public class KsiazkaRepository implements IRepository<Ksiazka> {

	private Connection connection;
	private String insertSql =
	"INSERT INTO ksiazka(tytul, isbn, rokwydania, dostepnasc, cena)"
	+ "VALUES(?,?,?,?,?)";
	private String selectByIDSql =
	"SELECT * FROM ksiazka WHERE id=?";
	private String updateSql=
	"UPDATE ksiazka SET (tytul, isbn, rokwydania, dostepnasc, cena)=(?,?,?,?,?) WHERE id=?";
	private String deleteSql=
	"DELETE FROM ksiazka WHERE id=?";
	private String selectAllSql=
	"SELECT * FROM ksiazka";
	PreparedStatement selectByID;
	PreparedStatement insert;
	PreparedStatement update;
	PreparedStatement delete;
	PreparedStatement selectAll;
	public KsiazkaRepository(Connection connection) {
		this.connection = connection;
		try {
			insert = connection.prepareStatement(insertSql);
			selectByID=connection.prepareStatement(selectByIDSql);
			update=connection.prepareStatement(updateSql);
			delete=connection.prepareStatement(deleteSql);
			selectAll=connection.prepareStatement(selectAllSql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void add(Ksiazka entity) {
		try {
				insert.setString(1, entity.getTytul());
				insert.setString(2, entity.getISBN());
				insert.setInt(3, entity.getRok_wydania());
				insert.setString(4, entity.getDostepnosc());
				insert.setDouble(5, entity.getCena());
				insert.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		
	}

	@Override
	public void update(Ksiazka entity) {
		try {
				update.setString(1, entity.getTytul());
				update.setString(2, entity.getISBN());
				
				update.setInt(3, entity.getRok_wydania());
				update.setString(4, entity.getDostepnosc());
				update.setDouble(5, entity.getCena());
				update.executeUpdate();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public void delete(Ksiazka entity) {
		// TODO Auto-generated method stub
		try {
			delete.setInt(1, entity.getId());
			delete.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Ksiazka get(int id) {
		// TODO Auto-generated method stub
		Ksiazka result = null;
		try {
			selectByID.setInt(1, id);
			ResultSet rs = selectByID.executeQuery();
			while(rs.next())
			{
				result = new Ksiazka();
				result.setId(rs.getInt("id"));
				result.setTytul(rs.getString("tytul"));
				result.setISBN(rs.getString("isbn"));
				result.setRok_wydania(rs.getInt("rokwydania"));
				result.setDostepnosc(rs.getString("dostepnosc"));
				result.setCena(rs.getDouble("cena"));
				return result;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Ksiazka> getAll() {
		// TODO Auto-generated method stub
		List<Ksiazka> result = new ArrayList<Ksiazka>();
		try {
			ResultSet rs = selectAll.executeQuery();
			while(rs.next())
			{
				Ksiazka Ksiazka = new Ksiazka();
				Ksiazka.setId(rs.getInt("id"));
				Ksiazka.setTytul(rs.getString("tytul"));
				Ksiazka.setISBN(rs.getString("isbn"));
				Ksiazka.setRok_wydania(rs.getInt("rokwydania"));
				Ksiazka.setDostepnosc(rs.getString("dostepnosc"));
				Ksiazka.setCena(rs.getDouble("cena"));
				result.add(Ksiazka);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
