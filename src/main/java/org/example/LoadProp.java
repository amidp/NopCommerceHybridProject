package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//create loadprop class for all properties
public class LoadProp {
    static Properties prop = new Properties();
    static FileInputStream input;
    static String propetiesFileLocation = "src/test/java/testData/TestData.properties";

    public  String getProperty(String key){
       try {
           input = new FileInputStream(propetiesFileLocation);
           prop.load(input);
           input.close();
        } catch (IOException e){
           e.printStackTrace();
       }
        return  prop.getProperty(key);
    }
}
