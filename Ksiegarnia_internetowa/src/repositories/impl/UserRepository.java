package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.User;
import repositories.*;

public class UserRepository implements IRepository<User> {
	private Connection connection;
	private String insertSql =
	"INSERT INTO user(imie, nazwisko, mail, miasto, nrdomu, ulica, telefon)"
	+ "VALUES(?,?,?,?,?,?,?)";
	private String selectByIDSql =
	"SELECT * FROM user WHERE id=?";
	private String updateSql=
	"UPDATE User SET (imie, nazwisko, mail, miasto, nrdomu, ulica, telefon)=(?,?,?,?,?,?,?) WHERE id=?";
	private String deleteSql=
	"DELETE FROM user WHERE id=?";
	private String selectAllSql=
	"SELECT * FROM user";
	PreparedStatement selectByID;
	PreparedStatement insert;
	PreparedStatement update;
	PreparedStatement delete;
	PreparedStatement selectAll;
	
	public UserRepository(Connection connection) {
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
	public void add(User entity) {
		try {
				insert.setString(1, entity.getImie());
				insert.setString(2, entity.getNazwisko());
				insert.setString(3, entity.getMail());
				insert.setString(4, entity.getMiasto());
				insert.setString(5, entity.getNrdomu());
				insert.setString(6, entity.getUlica());
				insert.setString(7, entity.getTelefon());
				insert.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		
	}

	@Override
	public void update(User entity) {
		try {
			update.setString(1, entity.getImie());
			update.setString(2, entity.getNazwisko());
			update.setString(3, entity.getMail());
			update.setString(4, entity.getMiasto());
			update.setString(5, entity.getNrdomu());
			update.setString(6, entity.getUlica());
			update.setString(7, entity.getTelefon());
			update.executeUpdate();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		try {
			delete.setInt(1, entity.getId());
			delete.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		User result = null;
		try {
			selectByID.setInt(1, id);
			ResultSet rs = selectByID.executeQuery();
			while(rs.next())
			{
				result = new User();
				result.setId(rs.getInt("id"));
				result.setImie(rs.getString("imie"));
				result.setNazwisko(rs.getString("nazwisko"));
				return result;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		List<User> result = new ArrayList<User>();
		try {
			ResultSet rs = selectAll.executeQuery();
			while(rs.next())
			{
				User User = new User();
				User.setId(rs.getInt("id"));
				User.setImie(rs.getString("imie"));
				User.setNazwisko(rs.getString("nazwisko"));
				User.setTelefon(rs.getString("telefon"));
				User.setNrdomu(rs.getString("nrdomu"));
				User.setUlica(rs.getString("ulica"));
				User.setMiasto(rs.getString("miasto"));
				User.setMail(rs.getString("mail"));
				result.add(User);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	

}
