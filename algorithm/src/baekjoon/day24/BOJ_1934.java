package baekjoon.day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i ++){
            String s = br.readLine();

            StringTokenizer st = new StringTokenizer(s, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a * b / gcd(a, b));
        }
    }

    public static int gcd(int a, int b){
        int tmp;

        while (b != 0){
            tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }
}
