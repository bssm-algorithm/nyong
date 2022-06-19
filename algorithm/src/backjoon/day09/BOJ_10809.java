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
        for (int i = 0; i < word.length(); i ++){
            char ch = word.charAt(i);

            if (arr.get(ch - 'a') == -1){
                arr.set(ch - 'a', i);
            }
        }

        for (int val : arr){
            System.out.print(val + " ");
        }
    }
}
