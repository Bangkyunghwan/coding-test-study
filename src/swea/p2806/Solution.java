package swea.p2806;

import java.util.*;
import java.io.*;

public class Solution {
    private static int solution;
    private static int[] array;

    public static void main(String[] args) throws Exception{

        System.setIn(new FileInputStream("./src/swea/p2806/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case=1; test_case<=T; test_case++){
            solution = 0;

            int N = sc.nextInt();
            array = new int[N];

            for(int i=0; i<N; i++){
                dfs(0, i, N);
            }
            System.out.println("#"+test_case+" "+ solution);
        }
    }

    private static void dfs(int r, int c, int N){
        if(r == N-1){
            solution++;
            return;
        }

        array[r] = c;
        r++;

        for(int col=0; col<N; col++){
            boolean possible = true;

            for(int row=0; row<r; row++){
                if(array[row] == col){
                    possible = false;
                    break;
                }

                if (Math.abs(array[row] - col) == r - row){
                    possible = false;
                    break;
                }
            }
            if(possible)
                dfs(r, col, N);
        }
    }
}
