package baekjoon.day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_2670 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Double> arr = new ArrayList<>();
        for (int i = 0; i < n; i ++){
            arr.add(Double.parseDouble(br.readLine()));
        }

        double max = -1;
        if (n == 1){
            System.out.printf("%.3f%n", arr.get(0));
        }else {
            for (int i = 0; i < arr.size() - 1; i ++){

                double sum = arr.get(i);

                if (sum > max){
                    max = sum;
                }

                for (int j = i + 1; j < arr.size(); j ++){
                    sum *= arr.get(j);

                    if (sum > max){
                        max = sum;
                    }
                }
            }

            System.out.printf("%.3f", max);
        }
    }
}