package swea.p5215;
import java.util.*;
import java.io.*;



public class OriginalSolution {
    static int sumOfcalories;
    static int sumOfScores;
    static int maxScore;

    public static void main(String[] arg) throws Exception{

        System.setIn(new FileInputStream("./src/swea/p5215/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case=1; test_case<=T; test_case++){
            maxScore = 0;

            int countOfIngredient = sc.nextInt();
            int limitedCalorie = sc.nextInt();

            int[] tasteScores = new int[countOfIngredient];
            int[] calories = new int[countOfIngredient];
            boolean[] visited = new boolean[countOfIngredient];

            for(int i=0; i<countOfIngredient; i++){
                int tasteScore = sc.nextInt();
                int calorie = sc.nextInt();
                tasteScores[i] = tasteScore;
                calories[i] = calorie;
            }

            for(int i=0; i<countOfIngredient; i++){
                sumOfcalories = 0;
                sumOfScores = 0;
                dfs(i, tasteScores, calories, visited, countOfIngredient, limitedCalorie);
            }

            System.out.println("#"+test_case+" "+maxScore);
        }
    }


    private static void dfs(int idx, int[] tasteScores, int[] calories, boolean[] visited, int countOfIngredient, int limitedCalorie){
        visited[idx] = true;

        sumOfcalories += calories[idx];
        sumOfScores += tasteScores[idx];
        if(sumOfcalories > limitedCalorie){
            sumOfcalories -= calories[idx];
            sumOfScores -= tasteScores[idx];
            visited[idx] = false;
            return;
        }

        if(maxScore < sumOfScores)
            maxScore = sumOfScores;

        for(int i=0; i<countOfIngredient; i++){
            if(visited[i])
                continue;
            dfs(i, tasteScores,calories, visited, countOfIngredient, limitedCalorie);
        }
        sumOfcalories -= calories[idx];
        sumOfScores -= tasteScores[idx];
        visited[idx] = false;

    }
}





