package baekjoon.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BOJ_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1122);
        double sum = 0;

        for (int i = 0; i < n; i ++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        // 평균값
        for (int i = 0; i < arr.length; i ++){
            sum += arr[i];
        }

        System.out.println(Math.round(sum/arr.length));

        // 중앙값
        System.out.println(arr[(arr.length/2)]);

        // 최빈값
        int max = 0;

        if (arr.length == 1){
            list.set(0, arr[0]);
        }
        for (int i = 0; i < arr.length - 1; i ++){
            int cnt = 1;

            for (int j = i + 1; j < arr.length; j ++){

                if (arr[i] == arr[j]){
                    cnt ++;

                    if (cnt > max){
                        max = cnt;
                        list.set(0, arr[i]);
                    } else if (cnt == max){
                        list.add(arr[i]);
                    }
                }
            }
        }

        if (list.get(0) == 1122){
            for (int i = 1; i < arr.length; i ++){
                list.set(0, arr[0]);
                list.add(arr[i]);
            }
        }

        Collections.sort(list);

        if (list.size() == 1){
            sb.append(list.get(0));
            System.out.println(sb);
        } else {
            sb.append(list.get(1));
            System.out.println(sb);
        }

        // 범위
        System.out.println(arr[n - 1] - arr[0]);
    }
}