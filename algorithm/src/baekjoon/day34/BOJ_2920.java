package baekjoon.day34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s, " ");
        int n = st.countTokens();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(st.nextToken());
        }

        if (sb.toString().equals("12345678")) {
            System.out.println("ascending");
        } else if (sb.toString().equals("87654321")) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
