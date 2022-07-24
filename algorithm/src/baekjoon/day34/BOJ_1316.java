package baekjoon.day34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<String> arr = new ArrayList<>();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            arr.add(br.readLine());
            if (function(arr.get(i))) {
                cnt ++;
            }
        }

        System.out.println(cnt);
    }

    static boolean function(String s) {
        boolean[] arr = new boolean[26];

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                if (arr[(int) s.charAt(i - 1) - 97]) {
                    return false;
                } else {
                    arr[(int) s.charAt(i - 1) - 97] = true;
                }
            }
        }

        return !arr[(int) s.charAt(s.length() - 1) - 97];
    }
}
