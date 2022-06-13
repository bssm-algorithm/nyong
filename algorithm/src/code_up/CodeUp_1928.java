package code_up;

import java.util.Scanner;

public class CodeUp_1928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        function(i);
    }

    static int function(int n){
        System.out.println(n);
        if(n%2 == 1 && n > 1){
            return function(n*3 + 1);
        }else if(n%2 == 0 && n > 1){
            return function(n/2);
        }else{
            return n;
        }
    }
}