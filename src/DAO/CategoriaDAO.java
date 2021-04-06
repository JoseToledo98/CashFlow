package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DB.Connector;
import Entities.Categoria;

public class CategoriaDAO {

	private final int ACCEPT = 1;
	Connector dataAdapter= new Connector();
	private Connection connection = dataAdapter.getConnectionMySql();
	
	public boolean insert(Categoria categoria) {
		boolean resultado = false;
		if (connection != null) {
			String sql = "insert into categoria values(?,?,?,?)";
			
			try {
				PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1,categoria.getId());
			statement.setString(2, categoria.getNombre());
			statement.setInt(3, categoria.getIdClasificacion());
			statement.setString(4, categoria.getIdSubCategoria());
				if (statement.executeUpdate() == ACCEPT)
					resultado = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultado;
	}
	

	
}
