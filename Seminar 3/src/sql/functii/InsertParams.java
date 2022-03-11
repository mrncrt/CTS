package sql.functii;

import java.sql.Connection;
import java.sql.SQLException;

public interface InsertParams {
	public void insertP(Connection connection) throws SQLException;
}
