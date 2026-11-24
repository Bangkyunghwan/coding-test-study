package programmers.p43165;

class Solution {
    private int solution = 0;
    public int solution(int[] numbers, int target) {
        int N = numbers.length;

        dfs(numbers, 1, 0, 0, N, target);
        dfs(numbers, -1, 0, 0, N, target);

        return solution;
    }


    private void dfs(int[] numbers, int sign, int idx, int sum, int N, int target){
        sum += numbers[idx] * sign;

        if(idx == N-1){
            if(sum == target)
                solution++;
            return;
        }
        idx++;
        dfs(numbers, 1,idx, sum, N, target);
        dfs(numbers, -1,idx, sum, N, target);
    }
}
