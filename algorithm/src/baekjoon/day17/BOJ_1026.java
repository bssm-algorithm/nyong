package baekjoon.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int [] A = new int[n];
        ArrayList<Integer> B = new ArrayList<>();

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        for (int i = 0; i < n; i ++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        String s1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(s1, " ");
        for (int i = 0; i < n; i ++){
            B.add(Integer.parseInt(st1.nextToken()));
        }

        Arrays.sort(A);
        Collections.sort(B, Comparator.reverseOrder());

        int sum = 0;
        for (int i = 0; i < n; i ++){
            sum += A[i] * B.get(i);
        }

        System.out.println(sum);
    }
}
