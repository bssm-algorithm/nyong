package baekjoon.day23;

import java.util.Scanner;

public class BOJ_10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = 300;
        int B = 60;
        int C = 10;

        int n = sc.nextInt();

        if (n % 10 != 0){
            System.out.println(-1);
        }else {
            if (n / A != 0){
                int m = n / A;
                System.out.print(m + " ");
                n %= A;
            }else{
                System.out.print(0 + " ");
            }

            if (n / B != 0){
                int m = n / B;
                System.out.print(m + " ");
                n %= B;
            }else {
                System.out.print(0 + " ");
            }

            if (n / C != 0){
                int m = n / C;
                System.out.println(m);
                n %= C;
            }else {
                System.out.print(0 + " ");
            }
        }
    }
}