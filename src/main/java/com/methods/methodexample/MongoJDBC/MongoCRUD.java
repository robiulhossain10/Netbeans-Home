package com.methods.methodexample.MongoJDBC;

import com.mongodb.client.*;
import io.github.cdimascio.dotenv.Dotenv;
import java.util.Scanner;
import org.bson.Document;

public class MongoCRUD {

    private static final Dotenv dotenv = Dotenv.load();
    private static final String DB_URL = dotenv.get("MONGONURL");

    public static void main(String[] args) {

        MongoClient mongoClient = MongoClients.create(DB_URL);

        MongoDatabase database = mongoClient.getDatabase("TestDB");
        MongoCollection<Document> collection = database.getCollection("users");

        Scanner scanner = new Scanner(System.in);

        // CREATE (Input from user)
        System.out.println("Enter user name: ");
        String name = scanner.nextLine();

        System.out.println(" Enter user email: ");
        String email = scanner.nextLine();

        System.out.println("Enter user age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        Document user = new Document("name", name)
                .append("email", email)
                .append("age", age);
        collection.insertOne(user);
        System.out.println(" User Inserted:\n" + user.toJson());

            // READ
        System.out.println("\n All users:");
        FindIterable<Document> users = collection.find();
        for (Document doc : users) {
            System.out.println(" User Document:");
            System.out.println(" ID       : " + doc.getObjectId("_id"));
            System.out.println(" Name     : " + doc.getString("name"));
            System.out.println(" Email    : " + doc.getString("email"));
            System.out.println(" Age      : " + doc.getInteger("age"));
            System.out.println("---------------------------------------");
        }
//
//        // ✅ UPDATE
//        System.out.println("\n🛠️ Update user email:");
//        System.out.print("Enter name to update: ");
//        String updateName = scanner.nextLine();
//        System.out.print("Enter new email: ");
//        String newEmail = scanner.nextLine();
//
//        Bson updateFilter = Filters.eq("name", updateName);
//        Bson updateOp = Updates.set("email", newEmail);
//        collection.updateOne(updateFilter, updateOp);
//        System.out.println("✅ Email updated for " + updateName);
//
//        // ✅ DELETE
//        System.out.println("\n🗑️ Delete user by name:");
//        System.out.print("Enter name to delete: ");
//        String deleteName = scanner.nextLine();
//        collection.deleteOne(Filters.eq("name", deleteName));
//        System.out.println("✅ Deleted user: " + deleteName);

        // ✅ Close connection
        mongoClient.close();
        scanner.close();
    }
}
