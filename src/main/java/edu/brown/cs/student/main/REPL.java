package edu.brown.cs.student.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class REPL {

    HashMap<String, Collable> _commands;

    public REPL(){
        _commands = new HashMap<>();
        registerAllCommands();
    }

    public void read(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            while ((input = br.readLine()) != null) {
                try {
                    input = input.trim();
                    String[] arguments = input.split(" ");
                    System.out.println(_commands.get(arguments[0]).run(arguments));

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

    private void register(String command, Collable collable){
        _commands.put(command, collable);
    }

    //register all commands and their corresponding classes here!
    private void registerAllCommands(){
        this.register("add", new MathBot());
        this.register("subtract", new MathBot());
    }

}


