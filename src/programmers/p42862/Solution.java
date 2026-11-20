package programmers.p42862;
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        Arrays.sort(lost);
        Arrays.sort(reserve);

        ArrayList<Integer> lostList = new ArrayList<>();
        ArrayList<Integer> reserveList = new ArrayList<>();

        for(int l : lost){
            lostList.add(l);
        }

        for(int r : reserve){
            reserveList.add(r);
        }

        for (int i = 0; i < lostList.size(); i++) {
            int num = lostList.get(i);

            if (reserveList.contains(num)) {
                lostList.remove(i);
                reserveList.remove(Integer.valueOf(num));
                i--;
            }
        }



        System.out.println(lostList);
        System.out.println(reserveList);

        int solution = n;

        for(int l : lostList){

            if(check(l-1, reserveList))
                continue;



            if(check(l+1, reserveList))
                continue;


            solution--;
        }

        return solution;
    }



    private boolean check(int num, ArrayList<Integer> reserveList){

        for(int i=0; i<reserveList.size(); i++){
            if(num == reserveList.get(i)){
                reserveList.set(i, 999);
                return true;
            }
        }
        return false;
    }
}
