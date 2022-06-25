package backjoon.day08;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0, max = 0;

        for (int i = 0; i < n; i ++){
            arr.add(sc.nextInt());
        }

        // 5 6 7 8 9
        for (int i = 0; i < arr.size() - 1; i ++){
            for (int j = i + 1; j < arr.size(); j ++){
                for (int k = j + 1; k < arr.size(); k ++){
                    if (arr.get(i) + arr.get(j) + arr.get(k) <= m){
                        sum = arr.get(i) + arr.get(j) + arr.get(k);
                        if (sum > max){
                            max = sum;
                        }
                    }
                }
            }
        }

        System.out.println(max);
    }
}
