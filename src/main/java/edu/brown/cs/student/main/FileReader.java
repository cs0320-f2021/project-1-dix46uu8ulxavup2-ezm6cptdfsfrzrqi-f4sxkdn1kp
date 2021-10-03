package edu.brown.cs.student.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {

    public FileReader(){

    }

    public ArrayList<String[]> readCVS(String filepath) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(filepath));
        int row = 0;
        String line;
        String[] values = new String[5];
        ArrayList<String[]> list = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            row++;
            if (row == 1){
                continue;
            }
            values = line.split(",");
            if (values[4] != null) {
                list.add(values);
                values = new String[5];
            }
        }
        return list;
    }
}
