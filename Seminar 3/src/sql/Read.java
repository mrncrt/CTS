package sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import sql.functii.Reader;


public class Read implements Reader {
	
	@Override
	public String readData(Connection conectare) throws ClassNotFoundException {
		String sqlSelect = "SELECT * FROM employees";
		try {
			Statement statement = conectare.createStatement();
			ResultSet rs = statement.executeQuery(sqlSelect);
			while(rs.next()) {
				int ID = rs.getInt("id");
				String nume = rs.getString("name");
				String oras = rs.getString("address");
				double salariu = rs.getDouble("salary");
				rs.close();
				statement.close();
				String a = ID+""+nume+""+oras+""+salariu;
				System.out.println(a);
				return ID+""+nume+""+oras+""+salariu;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
