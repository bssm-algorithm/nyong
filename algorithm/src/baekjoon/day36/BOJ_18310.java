package baekjoon.day36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

    public class BOJ_18310 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        for (int i = 0; i < n; i++) {
            arr.add(Integer.valueOf(st.nextToken()));
        }

        Collections.sort(arr);

        System.out.println(arr.get((arr.size() - 1) / 2));
    }
}
