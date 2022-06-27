package baekjoon.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        for (int i = 0; i < n; i ++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        for (int i = 0; i < arr.size(); i ++){
            int cnt = 0;

            for (int j = 1; j <= arr.get(i); j ++){
                if (arr.get(i) % j == 0){
                    cnt ++;
                }
            }

            if (cnt == 2){
                count ++;
            }
        }

        System.out.println(count);
    }
}
