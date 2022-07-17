package baekjoon.day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_6996 {

    static ArrayList<Character> arr1 = new ArrayList<>();
    static ArrayList<Character> arr2 = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            String s = br.readLine();

            StringTokenizer st = new StringTokenizer(s, " ");
            String s1 = st.nextToken();
            String s2 = st.nextToken();

            function(s1, s2);
        }
    }

    static void function(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println(s1 + " & " + s2 + " are NOT anagrams.");
        } else {
            for (int i = 0; i < s1.length(); i++) {
                arr1.add(s1.charAt(i));
            }

            for (int i = 0; i < s2.length(); i++) {
                arr2.add(s2.charAt(i));
            }

            Collections.sort(arr1);
            Collections.sort(arr2);

            if (arr1.equals(arr2)) {
                System.out.println(s1 + " & " + s2 + " are anagrams.");
            } else {
                System.out.println(s1 + " & " + s2 + " are NOT anagrams.");
            }
        }
    }
}
