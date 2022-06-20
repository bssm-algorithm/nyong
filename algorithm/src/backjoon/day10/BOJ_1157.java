package backjoon.day10;

import java.util.Scanner;

public class BOJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine().toUpperCase();
        int cnt[] = new int[26];
        int max = 0;
        char result = 'c';

        int index;
        for(int i=0; i<st.length(); i++) {
            index = st.charAt(i)-65;

            cnt[index]++;
            if(max < cnt[index]) {
                max = cnt[index];
                result = st.charAt(i);
            } else if(max == cnt[index])
                result = '?';
        }
        System.out.println(result);
    }
}

//#include <iostream>
//using namespace std;
//
//        int memo[31][31];
//
//        int bino(int n, int r)
//        {
//        if(r==0 || n==r) return 1;
//        if(memo[n][r] != 0) return memo[n][r];
//        memo[n][r] = bino(n-1, r-1) + bino(n-1, r);
//        return memo[n][r];
//        }
//
//        int main(void)
//        {
//        int n, r;
//        cin >> n >> r;
//        cout << bino(n, r) << endl;
//        }
