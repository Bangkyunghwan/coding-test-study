package swea.p1204;

import java.io.FileInputStream;
import java.util.*;

public class Solution {
    static public void main(String[] arg) throws Exception{

        System.setIn(new FileInputStream("./src/swea/p1204/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        for(int test_case=1; test_case<=T; test_case++){
            int testNum = sc.nextInt();
            int scoreContainer = 0;
            int[] scoreCount = new int[101];

            for(int i=0; i<1000; i++){
                scoreContainer = sc.nextInt();
                scoreCount[scoreContainer]++;
            }

            int solution=0;
            int maxCount=0;

            for(int i=0; i < scoreCount.length; i++){
                if(scoreCount[i] >= maxCount){
                    solution = i;
                    maxCount = scoreCount[i];
                }
            }
            System.out.println("#"+testNum+" "+solution);

        }
    }
}
