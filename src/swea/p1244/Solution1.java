package swea.p1244;

import java.util.*;
import java.io.FileInputStream;

public class Solution1 {


    public static void main(String[] arg) throws Exception{

        System.setIn(new FileInputStream("./src/swea/p1244/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case=1; test_case<=T; test_case++){

            String numberString = sc.next();
            int changeCount = sc.nextInt();
            int[] numbers = new int[numberString.length()];

            for(int i=0; i<numberString.length(); i++){
                numbers[i] = numberString.charAt(i) - '0';
            }

            for(int i=0; i<numbers.length-1; i++){
                if(changeCount == 0)
                    break;

                int max = numbers[i];
                int maxIdx = i;

                for(int j=i+1; j<numbers.length; j++){
                    if(numbers[j] >= max){
                        max = numbers[j];
                        maxIdx = j;
                    }
                }

                if(i != maxIdx){
                    int box = numbers[i];
                    numbers[i] = numbers[maxIdx];
                    numbers[maxIdx] = box;
                    changeCount--;
                }


                StringBuilder sb = new StringBuilder();
                for(int k=0; k<numbers.length; k++){
                    sb.append(numbers[k]);
                }
            }

            for(int k=0; k<numbers.length-2; k++){
                if(numbers[k] == numbers[numbers.length-1] || numbers[k] ==  numbers[numbers.length-2])
                    changeCount = 0;
            }


            if(changeCount%2 != 0){
                int box = numbers[numbers.length-1];
                numbers[numbers.length-1] = numbers[numbers.length-2];
                numbers[numbers.length-2] = box;
            }

            StringBuilder sb = new StringBuilder();
            for(int i=0; i<numbers.length; i++){
                sb.append(numbers[i]);
            }
            System.out.println("#"+test_case+" "+sb.toString());
        }
    }
}
