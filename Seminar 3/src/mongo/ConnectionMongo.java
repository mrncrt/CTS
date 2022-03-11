package mongo;

import com.mongodb.MongoClient;

import mongo.functii.ConectareMongo;

public class ConnectionMongo implements ConectareMongo{
	
	
	public MongoClient conectareMongo() {
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		return mongoClient;
	}
}
