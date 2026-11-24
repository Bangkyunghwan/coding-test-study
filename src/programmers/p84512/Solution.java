package programmers.p84512;

class Solution {
    private String targetWord;
    private boolean isFinished = false;
    private int count = 0;

    public int solution(String word) {
        targetWord = word;
        dfs("", 0);
        return count;
    }


    private void dfs(String curWord, int depth){

        if(curWord.equals(targetWord)){
            isFinished = true;
            return;
        }

        if(depth == 5)
            return;

        for(char c : "AEIOU".toCharArray()){
            if(!isFinished){
                count++;
                dfs(curWord+c, depth+1);
            }
        }

    }
}
