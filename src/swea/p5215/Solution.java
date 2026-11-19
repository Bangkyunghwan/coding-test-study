package swea.p5215;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    private static int[] tasteScores;
    private static int[] calories;
    private static int calorieLimit;
    private static int maxScore;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("./src/swea/p5215/input.txt"));

        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int testCase = 1; testCase <= testCases; testCase++) {
            int ingredientCount = sc.nextInt();
            calorieLimit = sc.nextInt();

            tasteScores = new int[ingredientCount];
            calories = new int[ingredientCount];
            maxScore = 0;

            for (int i = 0; i < ingredientCount; i++) {
                tasteScores[i] = sc.nextInt();
                calories[i] = sc.nextInt();
            }

            for (int i = 0; i < ingredientCount; i++) {
                dfs(i, 0, 0);
            }

            System.out.println("#" + testCase + " " + maxScore);
        }
    }

    private static void dfs(int idx, int totalScore, int totalCalories) {
        totalScore += tasteScores[idx];
        totalCalories += calories[idx];

        if (totalCalories > calorieLimit) {
            return;
        }

        maxScore = Math.max(maxScore, totalScore);

        for (int i = idx + 1; i < tasteScores.length; i++) {
            dfs(i, totalScore, totalCalories);
        }
    }
}
