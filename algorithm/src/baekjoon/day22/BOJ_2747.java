package baekjoon.day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int n1 = 0;
        int n2 = 1;
        int sum = 1;

        for (int i = 2; i <= n; i ++){
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }

        System.out.println(sum);
    }
}
