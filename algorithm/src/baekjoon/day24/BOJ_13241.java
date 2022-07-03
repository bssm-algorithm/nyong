package baekjoon.day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        System.out.print(a * b / gcd(a, b));
    }

    public static long gcd(long a, long b){
        long tmp;

        while (b != 0){
            tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }
}
