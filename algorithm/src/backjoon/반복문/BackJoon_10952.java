package backjoon.반복문;

import java.util.Scanner;

public class BackJoon_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == 0 && b == 0){
                sc.close();
                System.exit(0);
            }

            System.out.println(a + b);
        }
    }
}
