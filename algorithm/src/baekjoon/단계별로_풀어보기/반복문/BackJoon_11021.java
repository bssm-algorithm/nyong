package backjoon.단계별로_풀어보기.반복문;

import java.util.Scanner;

public class BackJoon_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.print("Case #" + i + ": ");
            System.out.println(a + b);
        }
    }
}
