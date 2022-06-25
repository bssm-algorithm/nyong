package backjoon.단계별로_풀어보기.조건문;

import java.util.Scanner;

public class BackJoon_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = 1, max = 0;

        if (a == b && b == c){
            result = 10000 + (a*1000);
            System.out.println(result);
        }else if (a == b || a == c || b == c){
            if (a == b || a == c){
                result = 1000 + (a*100);
            }else {
                result = 1000 + (b*100);
            }
            System.out.println(result);
        }else {
            if (a > b && a > c){
                max = a;
                result = max * 100;
                System.out.println(result);
            }

            if (b > a && b > c) {
                max = b;
                result = max * 100;
                System.out.println(result);
            }

            if(c > b && c > a){
                max = c;
                result = max * 100;
                System.out.println(result);
            }
        }

    }
}
