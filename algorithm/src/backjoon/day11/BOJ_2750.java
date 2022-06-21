package backjoon.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2750 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(s); i ++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);
        System.out.println(arr);
    }

}
