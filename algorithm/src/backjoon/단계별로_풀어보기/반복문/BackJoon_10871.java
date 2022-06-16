package backjoon.단계별로_풀어보기.반복문;

import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();

        for (int i = 0; i < a; i ++){
            arr.add(sc.nextInt());
        }

        for (int j = 0; j < arr.size(); j ++){
            if (arr.get(j) < b){
                results.add(arr.get(j));
            }
        }

        for(int result : results){
            System.out.print(result + " ");
        }
    }
}
