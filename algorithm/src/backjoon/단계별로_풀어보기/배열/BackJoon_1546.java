package backjoon.단계별로_풀어보기.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon_1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Float> arr = new ArrayList<>();
        Float max = Float.valueOf(0);
        float sum = 0, ave;

        for (int i = 0; i < n; i ++){
            arr.add(sc.nextFloat());
        }

        for (int j = 0; j < n; j ++){
            if (arr.get(j) > max){
                max = arr.get(j);
            }
        }

        for (int k = 0; k < arr.size(); k ++){
            arr.set(k, arr.get(k)/max*100);

            sum += arr.get(k);
        }

        ave = sum/arr.size();
        System.out.println(ave);
    }
}
