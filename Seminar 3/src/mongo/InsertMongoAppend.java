package mongo;

import org.bson.Document;

import com.mongodb.client.MongoCollection;

import mongo.functii.ConectareMongo;
import mongo.functii.CreateMongo;
import mongo.functii.InsertMongoA;

public class InsertMongoAppend extends Insert implements InsertMongoA{
	

	@Override
	public void insertMongoAppend(CreateMongo createTableMongo, ConectareMongo conectareMongo) {
		Document employee1 = new Document().append("name", "Popescu Ion").
				append("address", "Bucharest").append("salary", 4000);
		
		MongoCollection<Document> collection = createTableMongo.createTableMongo((ConnectionMongo) conectareMongo).getCollection("employees");
		collection.insertOne(employee1);
		
	}
}
