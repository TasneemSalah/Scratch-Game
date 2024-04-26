package com.cyberspeed;

import JSONPojo.AppliedWinningCombinations;
import com.cyberspeed.JSONPojo.Output;
import com.cyberspeed.JSONPojo.Root;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MatrixChecker {
    double score = 0.0;

    public Output evaluateMatrix(String[][] matrix, Root game, Map<String, Double> mapRewards, double betAmount) {
        Map<String, Integer> symbolCount = new HashMap<>();
        Output output = new Output();

        for (int i = 0; i < game.getRows(); i++) {
            for (int j = 0; j < game.getColumns(); j++) {
                // Generate a random symbol based on probabilities
                symbolCount.put(matrix[i][j], symbolCount.getOrDefault(matrix[i][j], 0) + 1);
            }
        }
        boolean win = false;
        for (String s : symbolCount.keySet()) {
            int val = symbolCount.get(s);


            if (val == 3 || val == 4 || val == 5 || val == 6 || val == 7 || val == 8 || val == 9) {
                win = true;
                double reward = mapRewards.get(s);
                score += betAmount* reward * val;
//                score += betAmount * val;
                output.setAppliedWinningCombinations(new AppliedWinningCombinations());
                if (s.equals("A"))
                    output.getAppliedWinningCombinations().getA().add("same_symbol_" + val + "_times");
                if (s.equals("B"))
                    output.getAppliedWinningCombinations().getB().add("same_symbol_" + val + "_times");

                if (s.equals("C"))
                    output.getAppliedWinningCombinations().getC().add("same_symbol_" + val + "_times");

                if (s.equals("D"))
                    output.getAppliedWinningCombinations().getD().add("same_symbol_" + val + "_times");

                if (s.equals("E"))
                    output.getAppliedWinningCombinations().getE().add("same_symbol_" + val + "_times");

                if (s.equals("F"))
                    output.getAppliedWinningCombinations().getF().add("same_symbol_" + val + "_times");
            }

        }
        if (win) {
            if (symbolCount.keySet().contains("5x")) {
                score *= 5;
                output.setAppliedBonusSymbol("5x");
            }
            if (symbolCount.keySet().contains("10x")) {
                score *= 10;
                output.setAppliedBonusSymbol("10x");

            }
            if (symbolCount.keySet().contains("+500")) {
                score += 500;
                output.setAppliedBonusSymbol("+500");

            }
            if (symbolCount.keySet().contains("+1000")) {
                score += 10000;
                output.setAppliedBonusSymbol("+1000");

            }
        }
        output.setReward((int) score);
        List<List<String>> list = Arrays.stream(matrix).map(Arrays::asList).collect(Collectors.toList());
        output.setMatrix(list);

        return output;
    }
}
