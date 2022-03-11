package sql.functii;

import java.sql.Connection;

public interface CreateTable {
	public void crateTable(Connection connection) throws ClassNotFoundException;
}
