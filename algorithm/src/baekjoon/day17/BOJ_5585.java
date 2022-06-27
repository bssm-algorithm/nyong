package baekjoon.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cost = Integer.parseInt(br.readLine());
        int remainder = 1000 - cost;
        int cnt = 0;

        if (remainder / 500 != 0){
            cnt += remainder/500;
            remainder %= 500;
        }

        if (remainder / 100 != 0){
            cnt += remainder/100;
            remainder %= 100;
        }

        if (remainder / 50 != 0){
            cnt += remainder/50;
            remainder %= 50;
        }

        if (remainder / 10 != 0){
            cnt += remainder/10;
            remainder %= 10;
        }

        if (remainder / 5 != 0){
            cnt += remainder/5;
            remainder %= 5;
        }

        if (remainder != 0){
            cnt += remainder;
            remainder %= 1;
        }
        System.out.println(cnt);
    }
}
