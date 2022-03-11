package mongo;

import org.bson.Document;

import com.mongodb.client.MongoCollection;

import mongo.functii.ConectareMongo;
import mongo.functii.CreateMongo;
import mongo.functii.InsertMongoI;

public class InsertMongoInsert extends Insert implements InsertMongoI{
	
	

	@Override
	public void insertMongoInsert(CreateMongo createTableMongo, ConectareMongo conectareMongo) {
		Document employee2 = new Document().append("name", "Ionescu Vasile").
				append("salary", 4500);
		MongoCollection<Document> collection = createTableMongo.createTableMongo((ConnectionMongo) conectareMongo).getCollection("employees");
		collection.insertOne(employee2);
		
	}
}
