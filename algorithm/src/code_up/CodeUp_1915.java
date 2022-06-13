package code_up;

import java.util.Scanner;

public class CodeUp_1915 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(function(n));
    }

    static int function(int n){
        if(n > 2){
            return function(n - 1) + function(n - 2);
        } else{
            return 1;
        }
    }
}
