package com.cyberspeed;


import com.cyberspeed.JSONPojo.Output;
import com.cyberspeed.JSONPojo.Root;


import java.io.*;
import java.net.URISyntaxException;

public class ScratchGameMain {
    public static void main(String[] args) throws IOException, URISyntaxException {

        /** Run from CLI args**/
        File configFile = null;
        int bettingAmount = 0;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("--config") && i + 1 < args.length) {
                configFile = new File(args[i + 1]);
                i++; // Skip next argument since it's the config file path
            } else if (args[i].equals("--betting-amount") && i + 1 < args.length) {
                bettingAmount = Integer.parseInt(args[i + 1]);
                i++; // Skip next argument since it's the betting amount
            }
        }

/** Run from IDE vars**/
        File configResources = new File("src/main/resources/config.json");
        int bet = 100;


        JsonReader reader = new JsonReader();
        //change depending on run method
        Root game = reader.readJson(configFile);//configResources

        MatrixGenerator mg = new MatrixGenerator();
        String[][] matrix = mg.createMatrix(game);
        MatrixChecker checker = new MatrixChecker();

        Output output = checker.evaluateMatrix(matrix, game, mg.fillRewards(game), bettingAmount);//bet
        reader.writeJsonOutput(output);

    }
}



