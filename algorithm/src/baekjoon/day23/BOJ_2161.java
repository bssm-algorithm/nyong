package baekjoon.day23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i ++){
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        while (queue.size() != 1){
            sb.append(queue.poll()).append(" ");
            queue.offer(queue.poll());
        }

        System.out.print(sb);
        System.out.println(queue.poll());
    }
}
