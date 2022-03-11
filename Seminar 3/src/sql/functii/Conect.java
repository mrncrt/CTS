package sql.functii;

import java.sql.Connection;
import java.sql.SQLException;

public interface Conect {
	public Connection conexiune() throws ClassNotFoundException, SQLException;
}
