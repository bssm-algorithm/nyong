import java.util.Scanner;

public class CodeUp_1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        function(n);
    }

    static void function(int n){
        if(n%2 == 1 && n > 1){
            function(n*3 + 1);
        }else if(n%2 == 0){
            function(n/2);
        }

        System.out.println(n);
    }
}