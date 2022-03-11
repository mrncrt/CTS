package main;
import sql.Conectare;
import sql.Create;
import sql.InsertPreparedStatement;
import sql.InsertStatement;
import sql.Read;
import sql.SQL;
import sql.functii.Conect;
import sql.functii.CreateTable;
import sql.functii.InsertParams;
import sql.functii.InsertS;
import sql.functii.Reader;
import java.sql.SQLException;
import mongo.AfisareM;
import mongo.ConnectionMongo;
import mongo.CreateTableMongo;
import mongo.InsertMongoAppend;
import mongo.InsertMongoInsert;
import mongo.MONGO;
import mongo.functii.AfisareMongo;
import mongo.functii.ConectareMongo;
import mongo.functii.CreateMongo;
import mongo.functii.InsertMongoA;
import mongo.functii.InsertMongoI;

public class SqlMongo {
	
	private MONGO mongo;
	private SQL sql;

	
	public SqlMongo(SQL sql) {
		this.sql = sql;
	}
	
	public void afisamRezultatSQL() throws ClassNotFoundException, SQLException {
		Conect conect = new Conectare();		
		CreateTable create = new Create();		
		Reader read = new Read();
		InsertParams params = new InsertPreparedStatement();
		InsertS statement = new InsertStatement();
		SQL sql = new SQL(conect,create, read, params,statement);
		sql.sql();
	}
	
	public void afisamRezultatMongo() {
		ConectareMongo conect = new ConnectionMongo();
		CreateMongo create = new CreateTableMongo();
		InsertMongoA insertA = new InsertMongoAppend();
		InsertMongoI insertI = new InsertMongoInsert();
		AfisareMongo afisare = new AfisareM();
		
		MONGO mongo = new MONGO(conect,create,insertA,insertI,afisare);
		mongo.mongo();
	}
}
