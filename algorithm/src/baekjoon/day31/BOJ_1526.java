package baekjoon.day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            if (max < function(i)) {
                max = function(i);
            }
        }

        System.out.println(max);
    }

    public static int function(int n) {
        int result = n;
        do {
            int a = result % 10;

            if (a != 4 && a != 7) {
                return 0;
            }

            result /= 10;
        } while (result != 0);

        return n;
    }
}
