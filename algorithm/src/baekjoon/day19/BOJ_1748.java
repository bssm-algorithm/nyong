package baekjoon.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int plus = 1;
        int num = 10;
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i ++) {
            if(i % num == 0) {
                plus ++;
                num *= 10;
            }
            count += plus;

        }
        System.out.println(count);
    }
}
