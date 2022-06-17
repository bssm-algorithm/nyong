package backjoon.단계별로_풀어보기.수학1;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BackJoon_2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = 0;

        day = (V - B)/(A - B);

        if ((V - B)%(B - A) != 0){
            day ++;
        }

        System.out.print(day);
    }
}
