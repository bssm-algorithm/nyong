package backjoon.단계별로_풀어보기.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Float> list = new ArrayList<>();
        float ratio;

        float sum = 0, aver = 0, cnt = 0;

        for (int i = 0; i < n; i ++) {
            arr.add(sc.nextInt());

            for (int j = 0; j < arr.get(i); j ++){
                list.add(sc.nextFloat());
                sum += list.get(j);
            }
            
            aver = sum/list.size();

            for (int j = 0; j < arr.get(i); j ++){
                if (list.get(j) > aver){
                    cnt ++;
                }
            }

            ratio = (cnt/list.size())*100;
            System.out.println(String.format("%.3f", ratio) + "%");

            cnt = 0;
            sum = 0;
            list.removeAll(list);
        }
    }
}
