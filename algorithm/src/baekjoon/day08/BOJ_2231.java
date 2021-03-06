package backjoon.day08;

import java.util.Scanner;

public class BOJ_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = 0;

        for (int i = 0; i < n; i ++){
            int sum = 0;
            int number = i;

            while (number != 0){
                sum += number%10;
                number /= 10;
            }

            if (sum + i == n){
                System.out.println(i);
                break;
            }
        }
    }
}
