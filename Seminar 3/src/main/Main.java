package main;

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

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		SqlMongo sqlMongo = new SqlMongo(null);
		sqlMongo.afisamRezultatSQL();
		sqlMongo.afisamRezultatMongo();

	}

}
