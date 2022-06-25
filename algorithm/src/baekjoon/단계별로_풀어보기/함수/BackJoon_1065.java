package backjoon.단계별로_풀어보기.함수;

import java.util.Scanner;

public class BackJoon_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(function(n));
    }

    static int function(int n){
        int cnt = 0, a, b, c;
        for (int i = 1; i <= n; i ++){
            if (i/100 == 0){
                cnt ++;
            }else {
                a = i/100;
                b = (i%100)/10;
                c = i%10;

                if (b - a == c - b){
                    cnt ++;
                }
            }
        }

        return cnt;
    }
}
