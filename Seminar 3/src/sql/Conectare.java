package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import sql.functii.Conect;


public class Conectare implements Conect {
	
	public Connection conexiune() throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
		connection.setAutoCommit(false);
		return connection;
				
	}

}
