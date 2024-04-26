package com.cyberspeed;

import com.cyberspeed.JSONPojo.BonusSymbols;
import com.cyberspeed.JSONPojo.Root;
import com.cyberspeed.JSONPojo.StandardSymbol;

import java.util.*;

public class MatrixGenerator {
    Map<String, List<Double>> map = new HashMap<>();
    Map<String, Double> mapRewards = new HashMap<>();

    public Map<String, List<Double>> getMap() {
        return map;
    }


    String[][] createMatrix(Root game) {
        String[][] matrix = new String[game.getRows()][game.getColumns()];//3*3


        //A map of symbols and their probability in a cell for all rows/columns
        //loop through symbols and store probability and sum
        getProbability(map, game.getProbabilities().getStandardSymbols());

        getProbabilityBonus(map, game.getProbabilities().getBonusSymbols());

        Random random = new Random();

        for (int i = 0; i < game.getRows(); i++) {
            for (int j = 0; j < game.getColumns(); j++) {
                // Generate a random symbol based on probabilities
                String symbol = generateSymbol(map, random.nextDouble());
                matrix[i][j] = symbol;
            }
        }
        /** Test **/
        System.out.println(matrix[0][0] + " " + matrix[0][1] + " " + matrix[0][2]);
        System.out.println(matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2]);
        System.out.println(matrix[2][0] + " " + matrix[2][1] + " " + matrix[2][2]);
        return matrix;
    }




    private void getProbability(Map<String, List<Double>> map, List<StandardSymbol> symbols) {

        for (StandardSymbol ss : symbols) {

            Double prob = ss.getSymbols().getA().doubleValue();
            double probSum = ss.getSymbols().getA().doubleValue() + ss.getSymbols().getB().doubleValue() + ss.getSymbols().getC().doubleValue()
                    + ss.getSymbols().getD().doubleValue() + ss.getSymbols().getE().doubleValue() + ss.getSymbols().getF().doubleValue();
            if (!map.containsKey("A")) {
                List<Double> list = new ArrayList<>();
                list.add(prob / probSum);
                map.put("A", list);
            } else {
                map.get(("A")).add(prob / probSum);
            }
            prob = ss.getSymbols().getB().doubleValue();
            if (!map.containsKey("B")) {
                List<Double> list = new ArrayList<>();
                list.add(prob / probSum);
                map.put("B", list);
            } else {
                map.get(("B")).add(prob / probSum);
            }
            prob = ss.getSymbols().getC().doubleValue();
            if (!map.containsKey("C")) {
                List<Double> list = new ArrayList<>();
                list.add(prob / probSum);
                map.put("C", list);
            } else {
                map.get(("C")).add(prob / probSum);
            }
            prob = ss.getSymbols().getD().doubleValue();
            if (!map.containsKey("D")) {
                List<Double> list = new ArrayList<>();
                list.add(prob / probSum);
                map.put("D", list);
            } else {
                map.get(("D")).add(prob / probSum);
            }
            prob = ss.getSymbols().getE().doubleValue();
            if (!map.containsKey("E")) {
                List<Double> list = new ArrayList<>();
                list.add(prob / probSum);
                map.put("E", list);
            } else {
                map.get(("E")).add(prob / probSum);
            }
            prob = ss.getSymbols().getF().doubleValue();
            if (!map.containsKey("F")) {
                List<Double> list = new ArrayList<>();
                list.add(prob / probSum);
                map.put("F", list);
            } else {
                map.get(("F")).add(prob / probSum);
            }
        }
    }

    private void getProbabilityBonus(Map<String, List<Double>> map, BonusSymbols bonusSymbols) {

        Double prob = bonusSymbols.getSymbols().get5x().doubleValue();
        double probSum = bonusSymbols.getSymbols().get5x().doubleValue() + bonusSymbols.getSymbols().get10x().doubleValue() + bonusSymbols.getSymbols().get500().doubleValue()
                + bonusSymbols.getSymbols().get1000().doubleValue() + bonusSymbols.getSymbols().getMiss().doubleValue();
        if (!map.containsKey("5x")) {
            List<Double> list = new ArrayList<>();
            list.add(prob / probSum);
            map.put("5x", list);
        } else {
            map.get(("5x")).add(prob / probSum);
        }
        prob = bonusSymbols.getSymbols().get10x().doubleValue();
        if (!map.containsKey("10x")) {
            List<Double> list = new ArrayList<>();
            list.add(prob / probSum);
            map.put("10x", list);
        } else {
            map.get(("10x")).add(prob / probSum);
        }
        prob = bonusSymbols.getSymbols().get500().doubleValue();
        if (!map.containsKey("+500")) {
            List<Double> list = new ArrayList<>();
            list.add(prob / probSum);
            map.put("+500", list);
        } else {
            map.get(("+500")).add(prob / probSum);
        }
        prob = bonusSymbols.getSymbols().get1000().doubleValue();
        if (!map.containsKey("+1000")) {
            List<Double> list = new ArrayList<>();
            list.add(prob / probSum);
            map.put("+1000", list);
        } else {
            map.get(("+1000")).add(prob / probSum);
        }
        prob = bonusSymbols.getSymbols().getMiss().doubleValue();
        if (!map.containsKey("MISS")) {
            List<Double> list = new ArrayList<>();
            list.add(prob / probSum);
            map.put("MISS", list);
        } else {
            map.get(("MISS")).add(prob / probSum);
        }
    }


    public static String generateSymbol(Map<String, List<Double>> map, double randomNumber) {
        double cumulativeProbability = 0.0;
        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
            String symbol = entry.getKey();
            List<Double> probabilities = entry.getValue();
            for (double probability : probabilities) {
                cumulativeProbability += probability;
                if (randomNumber <= cumulativeProbability) {
                    return symbol;
                }
            }
        }
        return null; // This should never happen if probabilities are properly calculated
    }

    public Map<String, Double> fillRewards(Root game) {

        mapRewards.put("A", game.getSymbols().getA().getRewardMultiplier().doubleValue());
        mapRewards.put("B", game.getSymbols().getB().getRewardMultiplier().doubleValue());
        mapRewards.put("C", game.getSymbols().getC().getRewardMultiplier().doubleValue());
        mapRewards.put("D", game.getSymbols().getD().getRewardMultiplier().doubleValue());
        mapRewards.put("E", game.getSymbols().getE().getRewardMultiplier().doubleValue());
        mapRewards.put("F", game.getSymbols().getF().getRewardMultiplier());

        mapRewards.put("5x", game.getSymbols().get5x().getRewardMultiplier().doubleValue());
        mapRewards.put("10x", game.getSymbols().get10x().getRewardMultiplier().doubleValue());
        mapRewards.put("+500", 500.0);
        mapRewards.put("+1000", 1000.0);
        mapRewards.put("MISS", 0.0);

        return mapRewards;
    }


}
