package baekjoon.day27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class BOJ_2592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i ++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        int sum = 0;
        for (int a : arr){
            sum += a;
        }

        System.out.println(sum / arr.size());
        int[] ii = new int[1];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 1; i++){
            int cnt = 0;
            for (int j = i + 1; j < arr.size(); j ++){
                if (Objects.equals(arr.get(i), arr.get(j))){
                    cnt ++;
                }

                if (cnt > max){
                    max = cnt;
                    ii[0] = arr.get(i);
                }
            }
        }

        System.out.println(ii[0]);
    }
}
