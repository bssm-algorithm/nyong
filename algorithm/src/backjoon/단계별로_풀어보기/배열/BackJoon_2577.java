package backjoon.단계별로_풀어보기.배열;

import java.util.Scanner;

public class BackJoon_2577 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int value = (in.nextInt() * in.nextInt() * in.nextInt());
        String str = Integer.toString(value);
        in.close();

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}