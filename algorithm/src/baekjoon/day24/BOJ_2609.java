package baekjoon.day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2609 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int d = gcd(a, b);

        System.out.println(d);
        System.out.println(a * b / d); // 최소공배수 = a * b / 최소공약수

    }

    // 유클리드 호제법 - 최소공배수 공식 gcd
    public static int gcd(int a, int b) {
        int tmp;
        while (b != 0){
            tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }
}
