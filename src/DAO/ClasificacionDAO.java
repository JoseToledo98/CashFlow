package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DB.Connector;
import Entities.Categoria;
import Entities.Clasificacion;

public class ClasificacionDAO {
	private final int ACCEPT = 1;
	Connector dataAdapter= new Connector();
	private Connection connection = dataAdapter.getConnectionMySql();
	
	public boolean insert(Clasificacion clasificacion) {
		boolean resultado = false;
		if (connection != null) {
			String sql = "insert into clasificacion values(?,?,?)";
			
			try {
				PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1,clasificacion.getId());
			statement.setString(2, clasificacion.getNombre());
			statement.setInt(3, clasificacion.getIdTipoFlujo());
			
				if (statement.executeUpdate() == ACCEPT)
					resultado = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultado;
	}
	
	public boolean delete(int id) {
		boolean resultado=false;
		if(connection != null) {
			String sql="delete from clasificacion where id= ?";
			try {
				PreparedStatement statement=connection.prepareStatement(sql);
				statement.setInt(1, id);
					if(statement.executeUpdate()==ACCEPT)
							resultado=true;
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return resultado;
	}
}
