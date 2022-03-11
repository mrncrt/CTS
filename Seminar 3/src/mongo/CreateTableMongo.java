package mongo;

import com.mongodb.client.MongoDatabase;

import mongo.functii.CreateMongo;


public class CreateTableMongo implements CreateMongo {
	
	
	public MongoDatabase createTableMongo(ConnectionMongo mongo) {
		MongoDatabase mongoDb =  mongo.conectareMongo().getDatabase("test");
		if(mongoDb.getCollection("employees") != null) {
			mongoDb.getCollection("employees").drop();
		}		
		mongoDb.createCollection("employees");
		return mongoDb;
	}
}
