package baekjoon.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i ++){

            for (int k = 0; k < i; k ++){
                System.out.print(" ");
            }
            
            for (int j = n; j > i; j --){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}