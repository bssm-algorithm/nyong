package backjoon.단계별로_풀어보기.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0, cnt = 0;

        for (int i = 0; i < 9; i ++){
            arr.add(sc.nextInt());
        }

        for (int j = 0; j < 9; j ++){
            if (arr.get(j) > max){
                max = arr.get(j);
                cnt = j + 1;
            }
        }

        System.out.println(max);
        System.out.println(cnt);
    }
}
