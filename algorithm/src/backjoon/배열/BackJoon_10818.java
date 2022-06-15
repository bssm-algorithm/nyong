package backjoon.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 10000000;
        int max = -10000000;
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i ++){
            arr.add(sc.nextInt());
        }

        for (int j = 0; j < n; j ++){
            if (arr.get(j) > max){
                max = arr.get(j);
            }

            if (arr.get(j) < min){
                min = arr.get(j);
            }
        }

        System.out.print(min + " ");
        System.out.println(max);
    }
}
