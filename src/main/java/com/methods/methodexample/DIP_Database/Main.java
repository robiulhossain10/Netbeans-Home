
package com.methods.methodexample.DIP_Database;



public class Main {
    public static void main(String[] args) {
        String dbType = ConfigReader.getDbType().toLowerCase();

        DatabaseConnection dbConnection;

        switch (dbType) {
            case "postgres":
                dbConnection = new PostgreSQLConnection();
                break;
            case "mongo":
                dbConnection = new MongoDBConnection();
                break;
            case "mysql":
            default:
                dbConnection = new MySQLConnection();
                break;
        }

        DatabaseService service = new DatabaseService(dbConnection);
        service.start();
        
        //MYSQL SECTION
        
        MySQLConnection ms = new MySQLConnection();
        ms.connect();
        ms.insert("Robiul", 26);
        ms.read();
        
//        MongoDBConnection mongo = new MongoDBConnection();
//        mongo.connect();
//        mongo.insert("Zenny", 30);

//        mongo.update("Zenny", "Farhana", 20);
//           mongo.delete("Farhana");
//        mongo.readAll();
        
//        dbConnection.connect();
        
//        ConfigReader.debugEnv();
        
    }

}

