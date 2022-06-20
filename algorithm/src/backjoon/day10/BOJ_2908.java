package backjoon.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[2];

        for (int i = 0; i < arr.length; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length; i ++){
            int a = arr[i]%10;
            int b = (arr[i]%100)/10;
            int c = arr[i]/100;

            arr[i] = (a*100) + (b*10) + c;
        }

        System.out.println(Math.max(arr[0], arr[1]));
    }
}
