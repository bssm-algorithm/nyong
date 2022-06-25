package baekjoon.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int cnt = 0;

        String[] arr = new String[a + b];
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < a; i ++){
            arr[i] = br.readLine();
        }

        for (int i = a; i < a + b; i ++){
            arr[i] = br.readLine();

            for (int j = 0; j < a; j ++){
                if (Objects.equals(arr[j], arr[i])){
                    list.add(arr[j]);
                    cnt ++;
                }
            }
        }

        System.out.println(cnt);

        for (String s1 : list){
            System.out.println(s1);
        }
    }
}
