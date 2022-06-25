package backjoon.단계별로_풀어보기.브루트포스;

import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0;

        ArrayList<Integer> card = new ArrayList<>();

        for (int i = 0; i < n; i ++){
            card.add(sc.nextInt());
        }

        //3개의 카드를 고르기 때문에 첫 번째 카드는 n-2까지 순회
        for(int i=0;i<n-2;i++) {
            //두 번째 카드는 첫 번째 다음부터 n-1까지 순회
            for(int j=i+1; j<n-1;j++) {
                //세 번째 카드는 두 번째 카드 다음부터 n까지 순회
                for(int k=j+1;k<n;k++) {
                    int sum = card.get(i)+card.get(j)+card.get(k);
                    //문제에서 3장의 합은 m보다 클수 없다고 했으니 합이 m보다 작을때만 계산
                    //3카드의 합보다 m이 더 크다면 Max와 sum중에 더 큰 값을 max에 대입
                    //Max는 점점  m값과 가까워 짐
                    if(sum <= m) {
                        max = Math.max(max, sum);
                    }
                    //max == m이면 가장 가까운 합이므로 출력 후 종료
                    if(max == m) {
                        System.out.println(max);
                        return;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
