package swea.p2001;

import java.util.*;
import java.io.FileInputStream;
public class Solution {
    public static void main(String[] args) throws Exception{

        System.setIn(new FileInputStream("./src/swea/p2001/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        for(int test_case=1; test_case<=T; test_case++){
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] array = new int[N][N];

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    array[r][c] = sc.nextInt();
                }
            }

            int max = 0;

            for(int r=0; r<N-M+1; r++){
                for(int c=0; c<N-M+1; c++){

                    int sum = 0;

                    for(int i=r; i<r+M; i++){
                        for(int j=c; j<c+M; j++){
                            sum += array[i][j];
                        }
                    }

                    if(sum > max)
                        max = sum;
                }
            }

            System.out.println("#"+test_case+" "+ max);
        }


    }
}
