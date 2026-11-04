package swea.p1859;

import java.io.FileInputStream;
import java.util.*;
public class Solution {
    public static void main(String[] arg) throws Exception{

        System.setIn(new FileInputStream("./src/swea/p1859/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            ArrayList<Integer> array = new ArrayList<Integer>();

            int count = sc.nextInt();

            for(int i=0; i<count; i++){
                array.add(sc.nextInt());
            }

            int max = array.get(count-1);
            long solution = 0;
            for(int i=count-2; i>=0; i--){
                if(array.get(i) > max)
                    max = array.get(i);
                solution += max - array.get(i);
            }

            System.out.println("#"+test_case+" "+solution);
        }
    }
}
