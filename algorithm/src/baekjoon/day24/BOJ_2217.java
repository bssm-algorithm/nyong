package baekjoon.day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i ++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);

        int max = -1;
        for (int i = 0; i < arr.size(); i ++){
            int tmp = arr.get(i) * (arr.size() - i);
            if (tmp > max){
                max = tmp;
            }
        }

        System.out.println(max);
    }
}
