package backjoon.단계별로_풀어보기.재귀함수;

import java.util.Scanner;

public class BackJoon_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(function(n));
    }

    static int function(int n){
        if (n == 0){
            return 0;
        }else if (n <= 2){
            return 1;
        }else{
            return function(n - 1) + function(n - 2);
        }
    }
}
