package backjoon.분류.브루트포스;

import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon_2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i ++){
            if (n%i == 0){
                arr.add(i);
            }
        }

        if (a > arr.size()){
            System.out.println(0);
        }else{
            System.out.println(arr.get(a-1));
        }

    }
}
