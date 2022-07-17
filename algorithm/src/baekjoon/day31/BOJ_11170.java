package baekjoon.day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int cnt = 0;

            for (int j = a; j <= b; j++){
                cnt += function(j);
            }
            System.out.println(cnt);
        }
    }

    static int function(int n){
        int cnt = 0;
        int result = n;

        do {
          if (result % 10 == 0) {
              cnt ++;
          }

          result /= 10;
        } while (result != 0);

        return cnt;
    }
}