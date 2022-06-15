package backjoon.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int cnt = 0;

        int n = 1000000000;
        ArrayList<Integer> arr = new ArrayList<>();

        Long result;
        result = ((long) A * B * C);

        while(true){
            while(n != 0){
                n = n/10;
                arr.add((int) (result/n));
                for(int i = 0; i < arr.size(); i ++){
                    if (i == arr.get(i)){
                        cnt ++;
                        System.out.println(cnt);
                    }
                }
            }
            break;
        }

    }
}
