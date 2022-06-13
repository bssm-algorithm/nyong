package backjoon.조건문;

import java.util.Scanner;

public class BackJoon_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();

        // 7 20 1000
        if (min + time >= 60){

            int Thour = (min + time)/60; // 17
            int Tmin = (min + time)%60;

            if (hour + Thour >= 24){
                hour = Thour - (24 - hour);
                min = Tmin;

                System.out.print(hour + " ");
                System.out.println(min);
            }else {
                hour = hour + Thour;
                min = Tmin;

                System.out.print(hour + " ");
                System.out.println(min);
            }
            // 22:48 + 74 == 24:02
            // (time-(60 - min))%60 = Tmin2(2)
            // (time-(60 - min))/60 = Thour2(1)
        }else if (min + time <= 60){
            System.out.print(hour + " ");
            System.out.println(min + time);
        }
    }
}

// 1000 분 == 16시간 40분
// 16시간 40분 + 7시간 20분 == 24시간 == 0 0
// hour <= 24; min + time >= 60;