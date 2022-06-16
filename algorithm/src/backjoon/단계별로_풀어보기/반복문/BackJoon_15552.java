package backjoon.단계별로_풀어보기.반복문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BackJoon_15552 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int target = str.indexOf(" ");
            int result = Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target + 1));
            sb.append(result+"\n");
        }

        br.close();
        System.out.print(sb);
    }
}