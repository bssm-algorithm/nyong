package baekjoon.day22;

import java.util.Scanner;

public class BOJ_2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        long res;

        res = Math.abs(n-m);

        System.out.println(res);
    }
}
