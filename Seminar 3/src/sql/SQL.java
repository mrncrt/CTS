package sql;

import java.sql.Connection;
import java.sql.SQLException;

import sql.functii.Conect;
import sql.functii.CreateTable;
import sql.functii.InsertParams;
import sql.functii.InsertS;
import sql.functii.Reader;


public class SQL {
	private Conect conect;
	private final Reader reader;
	private final CreateTable createTable;
	private InsertS insertS;
	private  InsertParams insertParams;
	
	public SQL(Conect conect,CreateTable createTable, Reader reader,InsertParams insertParams,InsertS insertS) {
		super();
		this.conect = conect;
		this.createTable = createTable;
		this.insertParams = insertParams;
		this.insertS = insertS;
		this.reader = reader;
	}
	
	public void sql() throws ClassNotFoundException, SQLException {
		conect = new Conectare();
		Connection c =  conect.conexiune();
		createTable.crateTable(c);
		insertParams.insertP(c);
		insertS.insertS(c);
		reader.readData(c);
		
	}
	
	
}
