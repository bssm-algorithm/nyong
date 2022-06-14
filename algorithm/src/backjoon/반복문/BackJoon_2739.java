package backjoon.반복문;

import java.util.Scanner;

public class BackJoon_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i <= n; i ++){
            for (int j = 1; j<=9; j ++){
                System.out.print(i + " * ");
                System.out.print(j + " = ");
                System.out.println(i*j);
            }
        }
    }
}
