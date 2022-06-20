package backjoon.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                arr[s.charAt(i) - 'A']++;
            } else {
                arr[s.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char c = '?';

        for(int i = 0; i < 26; i ++){
            if (arr[i] > max){
                max = arr[i];
                c = (char) (i + 65);
            } else if (arr[i] == max){
                c = '?';
            }
        }

        System.out.println(c);
    }
}