package backjoon.day09;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 26; i ++){
            arr.add(-1);
        }

        // apple
        for (int i = 0; i < word.length(); i ++){ // 5
            char ch = word.charAt(i); // a, p, p, l, e

            if (arr.get(ch - 'a') == -1){ // a - a = 0, b - a = 1, c - a = 2, a - a
                arr.set(ch - 'a', i);
            }
        }

        for (int val : arr){
            System.out.print(val + " ");
        }
    }
}
