package backjoon.단계별로_풀어보기.함수;

import java.util.ArrayList;
import java.util.Scanner;

public class BackJoon_4673 {
    public static void main(String[] args) {
        function();
    }

    static void function(){
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10000; i ++){
            arr.add(0);
        }

        for (int i = 0; i < arr.size(); i ++){
            int a = i+(i/1000)+(i/100)+(i/10);
            if (a < 10000){
                arr.set(a, 1);
            }
        }
    }
}
