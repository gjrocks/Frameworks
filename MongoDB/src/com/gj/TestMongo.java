package com.gj;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.util.JSON;

public class TestMongo {

	public static void main(String[] args) throws Exception {
		//MongoClient mongo = new MongoClient( "localhost" , 27017 );
		
		Mongo mongo = new Mongo("localhost", 27017);
		DB db=mongo.getDB("mkyong");
		DBCollection table = db.getCollection("employee1");
		 
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("name", "ganesh");
	 
		DBCursor cursor = table.find(searchQuery);
	 
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		
		DBCollection collection = db.getCollection("dummyColl");
		 
		// 1. BasicDBObject example
		System.out.println("BasicDBObject example...");
		BasicDBObject document = new BasicDBObject();
		document.put("database", "mkyongDB");
		document.put("table", "hosting");
	 
		BasicDBObject documentDetail = new BasicDBObject();
		documentDetail.put("records", 99);
		documentDetail.put("index", "vps_index1");
		documentDetail.put("active", "true");
		document.put("detail", documentDetail);
	 
		collection.insert(document);
	 
		DBCursor cursorDoc = collection.find();
		while (cursorDoc.hasNext()) {
			System.out.println(cursorDoc.next());
		}
		
		collection.remove(new BasicDBObject());
		 
		// 2. BasicDBObjectBuilder example
		System.out.println("BasicDBObjectBuilder example...");
		BasicDBObjectBuilder documentBuilder = BasicDBObjectBuilder.start()
			.add("database", "mkyongDB")
	                .add("table", "hosting");
	 
		BasicDBObjectBuilder documentBuilderDetail = BasicDBObjectBuilder.start()
	                .add("records", "99")
	                .add("index", "vps_index1")
			.add("active", "true");
	 
		documentBuilder.add("detail", documentBuilderDetail.get());
	 
		collection.insert(documentBuilder.get());
	 
		DBCursor cursorDocBuilder = collection.find();
		while (cursorDocBuilder.hasNext()) {
			System.out.println(cursorDocBuilder.next());
		}
		
		
		System.out.println("Map example...");
		Map<String, Object> documentMap = new HashMap<String, Object>();
		documentMap.put("database", "mkyongDB");
		documentMap.put("table", "hosting");
	 
		Map<String, Object> documentMapDetail = new HashMap<String, Object>();
		documentMapDetail.put("records", "99");
		documentMapDetail.put("index", "vps_index1");
		documentMapDetail.put("active", "true");
	 
		documentMap.put("detail", documentMapDetail);
	 
		collection.insert(new BasicDBObject(documentMap));
	 
		DBCursor cursorDocMap = collection.find();
		while (cursorDocMap.hasNext()) {
			System.out.println(cursorDocMap.next());
		}
	 
		collection.remove(new BasicDBObject());
	 
		// 4. JSON parse example
		System.out.println("JSON parse example...");
	 
		String json = "{'database' : 'mkyongDB','table' : 'hosting'," +
		  "'detail' : {'records' : 99, 'index' : 'vps_index1', 'active' : 'true'}}}";
	 
		DBObject dbObject = (DBObject)JSON.parse(json);
	 
		collection.insert(dbObject);
	 
		DBCursor cursorDocJSON = collection.find();
		while (cursorDocJSON.hasNext()) {
			System.out.println(cursorDocJSON.next());
		}
	 
		collection.remove(new BasicDBObject());
		
	}
    
	
}
