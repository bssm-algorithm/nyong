package baekjoon.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Character[][] c = new Character[8][8];

        int cnt = 0;

        for (int i = 0; i < 8; i ++){
            String s = br.readLine();
            for (int j = 0; j < 8; j ++){
                c[i][j] = s.charAt(j);

                if (i % 2 == 0 && j % 2 == 0){ // 세로, 가로가 짝수
                    if (c[i][j] == 'F'){
                        cnt ++;
                    }
                } else if (i % 2 != 0 && j % 2 != 0) { // 세로, 가로가 홀수
                    if (c[i][j] == 'F') {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
