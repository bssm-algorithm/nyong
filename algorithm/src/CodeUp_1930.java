import java.io.EOFException;
import java.util.Scanner;

public class CodeUp_1930 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int k = sc.nextInt();
            int n = sc.nextInt();
        }

        System.out.println(function(k - 1, n));
    }

    static int function(int k, int n){
        if(n < 0){
            return 0;
        }else{
            return function(k, n) + function(k, n - 1);
        }
    }
}
