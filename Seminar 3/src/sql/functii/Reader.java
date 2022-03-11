package sql.functii;

import java.sql.Connection;

public interface Reader {
	public String readData(Connection conectare) throws ClassNotFoundException;
}
