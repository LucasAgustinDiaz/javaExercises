package FactoryObject;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class MyFactory {

    public static Object getInstance(String objName) {
        Properties properties= new Properties();
        try {
            properties.load(new FileInputStream(new File("MyFactory.properties")));
            return Class.forName(properties.getProperty(objName)).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    };
}
