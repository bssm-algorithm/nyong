package baekjoon.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int n = Integer.parseInt(s);
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i ++){
            arr.add(n%10);
            n = n/10;
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int i : arr){
            sb.append(i);
        }

        System.out.println(sb);
    }
}
