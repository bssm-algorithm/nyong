package backjoon.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = " ABC DEF GHI JKL MNO PQRS TUV WXYZ";
        String s1 = br.readLine();
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(s, " ");

        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>(List.of(s1.split("")));

        while(st.hasMoreTokens()){
            arr.add(st.nextToken());
        }

        for (int i = 0; i < arr1.size(); i ++){
            for (int j = 0; j < arr.size(); j ++){
                if (arr.get(j).contains(arr1.get(i))){
                    cnt += (j+3);
                }
            }
        }

        System.out.println(cnt);
    }
}
