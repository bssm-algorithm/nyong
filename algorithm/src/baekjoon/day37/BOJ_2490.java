package baekjoon.day37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int cnt = 0;

            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            int n = st.countTokens();

            for (int j = 0; j < n; j++){
                arr.add(Integer.valueOf(st.nextToken()));
            }

            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) == 0) {
                    cnt ++;
                }
            }

            if (cnt == 1) {
                System.out.println("A");
            } else if (cnt == 2) {
                System.out.println("B");
            } else if (cnt == 3) {
                System.out.println("C");
            } else if (cnt == 4) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }

            arr.removeAll(arr);
        }
    }
}
