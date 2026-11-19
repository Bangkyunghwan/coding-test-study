package swea.p1979;

import java.util.*;
import java.io.*;


public class Solution {

    private static int[][] array;

    public static void main(String[] arg) throws Exception {

        System.setIn(new FileInputStream("./src/swea/p1979/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt();
            int K = sc.nextInt();

            array = new int[N][N];

            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    array[i][j] = sc.nextInt();

            int solution = 0;

            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++) {

                    if (checkRightDirection(i, j, N, K))
                        solution++;

                    if (checkBottomDirection(i, j, N, K))
                        solution++;
                }

            System.out.println("#"+test_case+" "+solution);
        }

    }

    static boolean checkRightDirection(int r, int c, int n, int k){

        if( (c+k<n && array[r][c+k] == 1)
                || (c-1>=0 && array[r][c-1] == 1)) {
            return false;
        }

        for(int i=0; i<k; i++){
            if(c+i>=n || array[r][c+i] == 0){
                return false;
            }
        }
        return true;
    }


    static boolean checkBottomDirection(int r, int c, int n, int k){

        if( (r+k<n && array[r+k][c] == 1)
                || (r-1>=0 && array[r-1][c] == 1)) {
            return false;
        }

        for(int i=0; i<k; i++){
            if(r+i>=n || array[r+i][c] == 0){
                return false;
            }
        }

        return true;

    }
}
