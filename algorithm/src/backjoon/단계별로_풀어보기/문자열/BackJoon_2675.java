package backjoon.단계별로_풀어보기.문자열;

import java.util.Scanner;

public class BackJoon_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i ++){
            int a = sc.nextInt();
            String s = sc.next();

            for (int j = 0; j < s.length(); j ++){

                for (int k = 0; k < a; k ++){
                    System.out.print(s.charAt(j));
                }
            }
        }
    }
}
