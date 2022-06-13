package code_up;

import java.util.Scanner;

public class CodeUp_1904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        function(start, end);
    }

    static int function(int start, int end){
        if (start%2 == 0 && start > 0 && start <= end){
            return function(start + 1, end);
        }else if(start%2 == 1 && start > 0 && start <= end){
            System.out.println(start);
            return function(start + 1, end);
        }else {
            return 1;
        }
    }
}
