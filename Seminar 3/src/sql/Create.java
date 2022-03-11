package sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import sql.functii.CreateTable;


public class Create implements CreateTable {
	
	private final String create = "CREATE TABLE employees(id INTEGER PRIMARY KEY,"
			+ "name TEXT, address TEXT, salary REAL)";
	private final String drop = "DROP TABLE IF EXISTS employees";
		
	public void crateTable(Connection connection) throws ClassNotFoundException {
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate(drop);
			statement.executeUpdate(create);
			statement.close();
			((Connection) connection).commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
