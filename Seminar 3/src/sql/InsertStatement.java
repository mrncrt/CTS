package sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import sql.functii.InsertS;

public class InsertStatement extends Insert implements InsertS {

	public void insertS(Connection connection) throws SQLException {
		String sqlInsert = "INSERT INTO employees VALUES(1, 'Popescu Ion', 'Bucharest', 4000)";
		Statement statement = connection.createStatement();
		statement.executeUpdate(sqlInsert);
		statement.close();
		
	}

}
