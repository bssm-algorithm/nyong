package baekjoon.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon_5168 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i ++){
            arr.add(sc.nextInt());
        }

        Integer min = Collections.min(arr);

        for (int i = 1; i <= min; i ++){
            if (arr.size() == 2){
                if (arr.get(0) % i == 0 && arr.get(1) % i == 0){
                    list.add(i);
                }
            } else {
                if (arr.get(0) % i == 0 && arr.get(1) % i == 0 && arr.get(2) % i == 0){
                    list.add(i);
                }
            }
        }

        for (int i : list){
            System.out.println(i);
        }
    }
}
