package baekjoon.day30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++){
            arr.add(br.readLine());
        }

        StringBuilder sb = new StringBuilder();

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < arr.get(0).length(); i++){
            for (int j = 0; j < arr.size(); j++) {
                list.add(arr.get(j).charAt(i));
            }

            if (list.stream()
                    .allMatch(a -> a == list.get(0))){
                sb.append(list.get(0));
            } else {
                sb.append("?");
            }

            list.removeAll(list);
        }

        System.out.println(sb);
    }
}
