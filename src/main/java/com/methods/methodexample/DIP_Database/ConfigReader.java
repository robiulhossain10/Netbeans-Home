package com.methods.methodexample.DIP_Database;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties prop = new Properties();

    static {
        try {
            prop.load(new FileInputStream(".env2")); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // getDbType() // default database
    public static String getDbType() {
        return prop.getProperty("DB_TYPE", "mysql");
    }


    public static String get(String key) {
        return prop.getProperty(key);
    }

//    public static void debugEnv() {
//    for (String key : prop.stringPropertyNames()) {
//        System.out.println(key + " = " + prop.getProperty(key));
//    }
//}

}

