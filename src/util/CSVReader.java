package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CSVReader {

    public CSVReader() {}

    public static ArrayList<String> getDataFile(String path){

        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(path));
            String row;
            ArrayList<String> data = new ArrayList<>();
            while ((row = csvReader.readLine()) != null)
                data.add(row);
            csvReader.close();
            return data;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

}
