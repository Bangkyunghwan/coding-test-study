package swea.p1859;

import java.io.FileInputStream;
import java.util.*;
public class Solution1 {
    public static void main(String[] arg) throws Exception{

        System.setIn(new FileInputStream("./src/swea/p1859/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            ArrayList<Integer> array = new ArrayList<Integer>();

            int count = sc.nextInt();
            int solution = 0;

            for(int i=0; i<count; i++){
                array.add(sc.nextInt());
            }

            for(int i = 0; i< array.size(); i++){
                int subMax = 0;
                for(int j = i+1; j<array.size(); j++){
                    int sub = array.get(j) - array.get(i);
                    if(sub < 0){
                        continue;
                    }else if(sub >= subMax){
                        subMax = sub;
                    }
                }
                solution += subMax;
            }
            System.out.println("#"+test_case+" "+solution);
        }
    }
}
