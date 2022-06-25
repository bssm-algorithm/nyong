package backjoon.단계별로_풀어보기.수학1;

import java.util.Scanner;

public class BackJoon_1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int cnt = 0;

        // 1000 70 170
        cnt ++;

        if (b >= c){
            cnt = -1;
        }else {
            cnt = a/(c-b) + 1;
        }
        System.out.println(cnt);
    }
}
