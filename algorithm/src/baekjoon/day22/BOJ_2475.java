package baekjoon.day22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_2475 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i ++){
            arr.add(sc.nextInt());
        }

        int sum = 0;
        for (int i = 0; i < arr.size(); i ++){
            sum += arr.get(i) * arr.get(i);
        }

        System.out.println(sum%10);
    }
}
