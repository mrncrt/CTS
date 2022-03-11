package mongo;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

import mongo.functii.AfisareMongo;
import mongo.functii.ConectareMongo;
import mongo.functii.CreateMongo;


public class AfisareM implements AfisareMongo {
	

	@Override
	public void afisareMongo(CreateMongo createTableMongo, ConectareMongo conectareMongo) {
		MongoCollection<Document> collection = createTableMongo.createTableMongo((ConnectionMongo) conectareMongo).getCollection("employees");

		FindIterable<Document> result = collection.find();
		for(Document doc : result) {
			System.out.println(doc);
		}
		
	}
}
