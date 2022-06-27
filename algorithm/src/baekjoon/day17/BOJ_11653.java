package baekjoon.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 1;
        while (n != 1){
            cnt ++;

            while (n%cnt == 0){
                System.out.println(cnt);
                n /= cnt;
            }
        }

    }
}
