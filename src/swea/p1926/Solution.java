package swea.p1926;

import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=1; i<=N; i++){

            String strNum = String.valueOf(i);
            int count = 0;

            for(int j=0; j<strNum.length(); j++){
                char c = strNum.charAt(j);
                if(c == '3' || c == '6' || c == '9'){
                    count++;
                }
            }

            if(count == 0)
                System.out.print(strNum);
            else{
                for(int j=0; j<count; j++)
                    System.out.print("-");
            }
            System.out.print(" ");

        }
    }
}
