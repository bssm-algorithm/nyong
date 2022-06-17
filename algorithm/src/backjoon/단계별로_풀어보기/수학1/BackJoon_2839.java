package backjoon.단계별로_풀어보기.수학1;

import java.util.Scanner;

public class BackJoon_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int share = 0;

        while(true){
            if (n % 5 == 0){
                result = n/5;
                break;
            }else {
                if ((n % 5) % 3 == 0) { // n을 5로 나눈 나머지가 3의 배수라면
                    result = n / 5;
                    share = n % 5;
                    result += share / 3;
                    break;
                } else if (n%5 == 1) {
                    
                } else if (n%3 == 0){
                    result = n/3;
                    break;
                } else{
                    result = -1;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
