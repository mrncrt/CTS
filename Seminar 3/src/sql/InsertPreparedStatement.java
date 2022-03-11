package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import sql.functii.InsertParams;


public class InsertPreparedStatement extends Insert implements InsertParams {
	
	@Override
	public void insertP(Connection connection) throws SQLException {
		String sqlInsertWithParams = "INSERT INTO employees VALUES (?,?,?,?)";
		PreparedStatement preparedStatement = 
				connection.prepareStatement(sqlInsertWithParams);
		preparedStatement.setInt(1, 2);
		preparedStatement.setString(2, "Ionescu Vasile");
		preparedStatement.setString(3, "Brasov");
		preparedStatement.setDouble(4, 4500);
		preparedStatement.executeUpdate();
		preparedStatement.close();
	}
	
}
