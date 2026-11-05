package swea.p1206;

import java.util.*;
import java.io.FileInputStream;

public class Solution {
    static public void main(String[] arg) throws Exception{

        System.setIn(new FileInputStream("./src/swea/p1206/input.txt"));

        Scanner sc = new Scanner(System.in);

        for(int test_case=1; test_case<=10; test_case++){

            int solution = 0;
            int count = sc.nextInt();

            int[] array = new int[count];
            for(int i=0; i<count; i++){
                array[i] = sc.nextInt();
            }

            for(int i=2; i<count-2; i++){
                int max = array[i-2];
                for(int j=i-1; j<i+3; j++){
                    if(j==i)
                        continue;
                    if(array[j] > max){
                        max = array[j];
                    }
                }

                if(array[i] > max){
                    solution += array[i] - max;
                }
            }
            System.out.println("#"+test_case+" "+solution);
        }

    }
}
