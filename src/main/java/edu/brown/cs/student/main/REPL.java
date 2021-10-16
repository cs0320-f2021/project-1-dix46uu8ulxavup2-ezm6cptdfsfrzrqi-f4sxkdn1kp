package edu.brown.cs.student.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class REPL {
    public REPL(){

    }

    public void read(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            while ((input = br.readLine()) != null) {
                try {
                    input = input.trim();
                    String[] arguments = input.split(" ");


                    if (arguments[0].equals("stars")){
                        System.out.println("stars");
                        //FileReader fr = new FileReader();
                        //System.out.println(fr.readCVS("/Users/yukihayashita/Desktop/cs32/onboarding-eZm6CPtdFsfRzrqi/data/stars/ten-star.csv").get(9)[4]);

                    } else if (arguments[0].equals("naive-neighbors")){
                        System.out.println("naive-neighbors");
                    }
                } catch (Exception e) {
                    // e.printStackTrace();
                    System.out.println("ERROR: We couldn't process your input");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR: Invalid input for REPL");
        }
    }

}


