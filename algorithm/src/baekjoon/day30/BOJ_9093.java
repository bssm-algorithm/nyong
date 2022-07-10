package baekjoon.day30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < n; i++){

            StringBuilder sb = new StringBuilder();

            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            int cnt = st.countTokens();

            for (int j = 0; j < cnt; j++) {
                String s1 = st.nextToken();
                for (int k = 0; k < s1.length(); k++){
                    arr.add(s1.charAt(k));
                }
                Collections.reverse(arr);

                for (char k : arr){
                    sb.append(k);
                }
                sb.append(" ");
                arr.removeAll(arr);
            }
            System.out.println(sb);

        }

    }
}
