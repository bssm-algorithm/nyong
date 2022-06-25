package backjoon.단계별로_풀어보기.문자열;

import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int sum = 0;

        for (int i = 0; i < n; i ++){
            sum += s.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
