package com.methods.methodexample.DIP_Database;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

import java.util.Iterator;

public class MongoDBConnection implements DatabaseConnection {

    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    @Override
    public void connect() {
        try {
            String uri = ConfigReader.get("MONGO_URI");
            
            String dbName = ConfigReader.get("MONGO_DB");
     
            String collectionName = ConfigReader.get("MONGO_COLLECTION");
            

            mongoClient = MongoClients.create(uri);
            database = mongoClient.getDatabase(dbName);
            collection = database.getCollection(collectionName);

        } catch (Exception e) {
            System.out.println("❌ MongoDB connection failed:");
            e.printStackTrace();
        }
    }

    // ✅ CREATE
    public void insert(String name, int age) {
        try {
            Document doc = new Document("name", name).append("age", age);
            collection.insertOne(doc);
            System.out.println("✅ Document inserted: " + doc.toJson());
        } catch (Exception e) {
            System.out.println("❌ Insert failed:");
            e.printStackTrace();
        }
    }

    // ✅ READ
    public void readAll() {
        try {
                   // READ
        System.out.println("\n All users:");
        FindIterable<Document> Students = collection.find();
        for (Document doc : Students) {
             System.out.println("User Document:");
            System.out.println("ID       : " + doc.getObjectId("_id"));
            System.out.println("Name     : " + doc.getString("name"));

            // Safely get age
            Object ageObj = doc.get("age");
            String ageStr = (ageObj != null) ? ageObj.toString() : "N/A";
            System.out.println("Age      : " + ageStr);
            
             // Optional: If you have email field
//            String email = doc.getString("email");
//            System.out.println("Email    : " + (email != null ? email : "N/A"));

            System.out.println("---------------------------------------");
        }
        } catch (Exception e) {
            System.out.println("❌ Read failed:");
            e.printStackTrace();
        }
    }

    // ✅ UPDATE
    public void update(String nameToFind, String newName, int newAge) {
        try {
            collection.updateOne(
                    Filters.eq("name", nameToFind),
                    Updates.combine(
                            Updates.set("name", newName),
                            Updates.set("age", newAge)
                    )
            );
            System.out.println("✅ Document updated where name = " + nameToFind);
        } catch (Exception e) {
            System.out.println("❌ Update failed:");
            e.printStackTrace();
        }
    }

    // ✅ DELETE
    public void delete(String nameToDelete) {
        try {
            collection.deleteOne(Filters.eq("name", nameToDelete));
            System.out.println("✅ Document deleted where name = " + nameToDelete);
        } catch (Exception e) {
            System.out.println("❌ Delete failed:");
            e.printStackTrace();
        }
    }
}
