package backjoon.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] count = new int[26];

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i) - 'a'] += 1;
        }

        for (int arr : count){
            System.out.print(arr + " ");
        }
    }
}
