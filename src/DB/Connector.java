package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	
public Connection getConnectionMySql() {
		//modifiquen la conexion con sus datos
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/cashflow?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
		String user = "root";
		String password = "11minutos";
		
		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		}

}

