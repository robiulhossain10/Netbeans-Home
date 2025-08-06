package com.methods.methodexample.DIP_Database;


public class DatabaseService {
    private DatabaseConnection connection;

    public DatabaseService(DatabaseConnection connection) {
        this.connection = connection;
    }

    public void start() {
        connection.connect();
    }
    
}

