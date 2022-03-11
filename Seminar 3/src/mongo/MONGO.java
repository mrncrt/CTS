package mongo;

import mongo.functii.AfisareMongo;
import mongo.functii.ConectareMongo;
import mongo.functii.CreateMongo;
import mongo.functii.InsertMongoA;
import mongo.functii.InsertMongoI;

public class MONGO {

	
	private ConectareMongo conectareMongo;
	private CreateMongo createTableMongo;
	private InsertMongoA insertA;
	private InsertMongoI insertI;
	private AfisareMongo afisareMongo;
	
	public MONGO(ConectareMongo conectareMongo, CreateMongo createTableMongo, InsertMongoA insertA,
			InsertMongoI insertI, AfisareMongo afisareMongo) {
		super();
		this.conectareMongo = conectareMongo;
		this.createTableMongo = createTableMongo;
		this.insertA = insertA;
		this.insertI = insertI;
		this.afisareMongo = afisareMongo;
	}
	
	public void mongo() {
		conectareMongo = new ConnectionMongo();
		
		createTableMongo.createTableMongo((ConnectionMongo) conectareMongo);
		insertA.insertMongoAppend(createTableMongo,conectareMongo);
		insertI.insertMongoInsert(createTableMongo,conectareMongo);
		afisareMongo.afisareMongo(createTableMongo, conectareMongo);
	}
	
	
	
}
