package backjoon.단계별로_풀어보기.반복문;

import java.util.Scanner;

public class BackJoon_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int cnt = 0, result = n;

        while(true){
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);

            cnt ++;
            if (result == n){
                System.out.println(cnt);
                break;
            }
        }
    }
}
