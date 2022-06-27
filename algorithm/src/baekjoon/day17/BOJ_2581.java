package baekjoon.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = a; i <= b; i ++){
            int cnt = 0;
            for (int j = 1; j <= i; j ++){
                if (i % j == 0){
                    cnt ++;
                }
            }

            if (cnt == 2){
                arr.add(i);
            }
        }

        int sum = 0;
        if (arr.size() == 0){
            System.out.println("-1");
        }else {
            for (int i : arr){
                sum += i;
            }
            System.out.println(sum);
            System.out.println(arr.get(0));
        }
    }
}
