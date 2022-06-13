package backjoon.조건문;

import java.util.Scanner;

public class BackJoon_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (hour > 0 && min > 45){
            System.out.print(hour + " ");
            System.out.println(min - 45);
        }else if (hour > 0 && min < 45){
            System.out.print(hour-1 + " ");
            System.out.println((min+60)-45);
        }else if (hour == 0 && min < 45){
            System.out.print("23 ");
            System.out.println((min+60)-45);
        }else if (hour == 0 && min > 45){
            System.out.print(hour + " ");
            System.out.println(min - 45);
        } else if(hour >= 0){
            System.out.print(hour + " ");
            System.out.println(0);
        }

    }
}
