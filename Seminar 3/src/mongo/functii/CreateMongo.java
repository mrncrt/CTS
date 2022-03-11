package mongo.functii;

import com.mongodb.client.MongoDatabase;

import mongo.ConnectionMongo;


public interface CreateMongo {
	public MongoDatabase createTableMongo(ConnectionMongo mongo);
}
