package baekjoon.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int c = Integer.parseInt(st1.nextToken());
        int d = Integer.parseInt(st1.nextToken());

        int numerator = (a * d) + (c * b); // 분자

        b *= d;
        d *= b;
        int denominator = b; // 분모

        int min;

        if (numerator > denominator){
            min = denominator;
        } else {
            min = numerator;
        }

        int i = 2;
        while (true){

            if (denominator % i == 0 && numerator % i == 0) {
                numerator /= i;
                denominator /= i;
            } else {
                i ++;
            }

            if (i > min){
                break;
            }
        }

        System.out.println(numerator);
        System.out.println(denominator);
    }
}
