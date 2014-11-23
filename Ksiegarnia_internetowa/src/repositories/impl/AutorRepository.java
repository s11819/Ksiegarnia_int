package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Autor;
import repositories.IRepository;

public class AutorRepository implements IRepository<Autor> {
	
	private Connection connection;
	private String insertSql =
	"INSERT INTO autor(imie, nazwisko)"
	+ "VALUES(?,?)";
	private String selectByIDSql =
	"SELECT * FROM autor WHERE id=?";
	private String updateSql=
	"UPDATE autor SET (imie, nazwisko)=(?,?) WHERE id=?";
	private String deleteSql=
	"DELETE FROM autor WHERE id=?";
	private String selectAllSql=
	"SELECT * FROM autor";
	PreparedStatement selectByID;
	PreparedStatement insert;
	PreparedStatement update;
	PreparedStatement delete;
	PreparedStatement selectAll;
	public AutorRepository(Connection connection) {
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
	public void add(Autor entity) {
		try {
				insert.setString(1, entity.getImie());
				insert.setString(2, entity.getNazwisko());
				insert.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		
	}

	@Override
	public void update(Autor entity) {
		try {
				update.setString(1, entity.getImie());
				update.setString(2, entity.getNazwisko());
				update.setInt(3, entity.getId());
				update.executeUpdate();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public void delete(Autor entity) {
		// TODO Auto-generated method stub
		try {
			delete.setInt(1, entity.getId());
			delete.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Autor get(int id) {
		// TODO Auto-generated method stub
		Autor result = null;
		try {
			selectByID.setInt(1, id);
			ResultSet rs = selectByID.executeQuery();
			while(rs.next())
			{
				result = new Autor();
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
	public List<Autor> getAll() {
		// TODO Auto-generated method stub
		List<Autor> result = new ArrayList<Autor>();
		try {
			ResultSet rs = selectAll.executeQuery();
			while(rs.next())
			{
				Autor autor = new Autor();
				autor.setId(rs.getInt("id"));
				autor.setImie(rs.getString("imie"));
				autor.setNazwisko(rs.getString("nazwisko"));
				result.add(autor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
