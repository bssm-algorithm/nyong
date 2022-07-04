package baekjoon.day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_6986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        ArrayList<Double> arr = new ArrayList<>();
        ArrayList<Double> list = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i ++){
            double d = Double.parseDouble(br.readLine());
            arr.add(d);
            list.add(d);
        }

        Collections.sort(arr);
        Collections.sort(list);

        System.out.println(String.format("%.2f", ave(arr, k)));
        System.out.println(String.format("%.2f", currection(list, k)));

    }

    static double ave(ArrayList<Double> arr, int k){
        for (int i = 0; i < k; i ++){
            arr.remove(0);
            arr.remove(arr.size() - 1);
        }

        double sum = 0;
        for (double b : arr){
            sum += b;
        }

        return sum / arr.size();
    }

    static double currection(ArrayList<Double> list, int k){
        for (int i = 0; i < k; i ++){
            list.set(i, list.get(k));
            list.set((list.size() - i - 1), list.get(list.size() - k - 1));
        }

        double sum = 0;
        for (double d : list){
            sum += d;
        }

        return sum / list.size();
    }
}
