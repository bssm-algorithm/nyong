package backjoon.단계별로_풀어보기.재귀함수;

import java.util.Scanner;

public class BackJoon_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(function(n));
    }

    static int function(int n){
        if (n <= 1){
            return 1;
        }else {
            return n * function(n-1);
        }
    }
}
