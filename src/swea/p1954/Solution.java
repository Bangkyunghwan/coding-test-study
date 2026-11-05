package swea.p1954;

import java.util.*;
import java.io.FileInputStream;
public class Solution {
    static public void main(String[] arg) throws Exception {

        System.setIn(new FileInputStream("./src/swea/p1954/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};


        for (int test_case = 1; test_case <= T; test_case++) {

            // 오른쪽 = 0, 아래 = 1, 왼쪽 = 2, 위쪽 = 3
            int dir = 0;

            int N = sc.nextInt();
            int[][] array = new int[N][N];
            int x = 0, y = 0;

            for (int i = 1; i <= N * N; i++) {
                
                array[y][x] = i;

                x += dx[dir];
                y += dy[dir];

                if (x > N - 1 || y > N - 1 || x < 0 || y < 0 || array[y][x] != 0) {
                    x -= dx[dir];
                    y -= dy[dir];
                    dir = (dir + 1) % 4;
                    x += dx[dir];
                    y += dy[dir];
                }
            }
            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }

        }
    }
}