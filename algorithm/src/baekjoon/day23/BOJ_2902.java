package baekjoon.day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i ++){
            if (64 < s.charAt(i) && s.charAt(i) < 91){
                arr.add(s.charAt(i));
            }
        }

        for (char c : arr){
            System.out.print(c);
        }
    }
}
