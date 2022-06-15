package backjoon.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i ++) {
            list.add(sc.next());
        }

        for (int i = 0; i < list.size(); i++) {

            int cnt = 0;
            int sum = 0;

            for (int j = 0; j < list.get(i).length(); j++) {

                if (list.get(i).charAt(j) == 'O') {
                    cnt++;
                }
                else {
                    cnt = 0;
                }
                sum += cnt;
            }

            System.out.println(sum);
        }

    }
}
