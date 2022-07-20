package baekjoon.day32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        ArrayList<Integer> contain1 = isContain(s1);
        ArrayList<Integer> contain2 = isContain(s2);

        int min = contain1.get(0) + contain2.get(0);
        int max = contain1.get(contain1.size() - 1) + contain2.get(contain2.size() - 1);

        System.out.print(min + " " + max);
    }

    public static ArrayList<Integer> isContain(String s) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(Integer.valueOf(s));

        for (int i = 0; i < s.length(); i++) {
            if (s.contains("5")) {
                if (String.valueOf(s.charAt(i)).equals(String.valueOf(5))) {
                    arr.add(Integer.valueOf(s.replace(String.valueOf(s.charAt(i)), String.valueOf(6))));
                }
            }

            if (s.contains("6")) {
                if (String.valueOf(s.charAt(i)).equals(String.valueOf(6))) {
                    arr.add(Integer.valueOf(s.replace(String.valueOf(s.charAt(i)), String.valueOf(5))));
                }
            }
        }

        Collections.sort(arr);
        return arr;
    }
}
