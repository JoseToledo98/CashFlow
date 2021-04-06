package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

import DB.Connector;
import Entities.Clasificacion;
import Entities.FlujoEfectivo;

public class FlujoEfectivoDAO {
	private final int ACCEPT = 1;
	Connector dataAdapter= new Connector();
	private Connection connection = dataAdapter.getConnectionMySql();
	
	public boolean insert(FlujoEfectivo flujoefectivo) {
		boolean resultado = false;
	
		
		if (connection != null) {
			String sql = "insert into flujoefectivo values(?,?,?,?)";
			
			try {
				PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1,flujoefectivo.getId());
			statement.setFloat(2, flujoefectivo.getMonto());
			statement.setDate(3, flujoefectivo.getFecha() );
			statement.setInt(4, flujoefectivo.getIdCategoria());
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
