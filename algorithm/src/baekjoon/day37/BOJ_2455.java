    package baekjoon.day37;

    import java.io.IOException;
    import java.util.Scanner;

    public class BOJ_2455 {
        public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);

            sc.nextInt();
            int people = sc.nextInt();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < 3; i++) {
                int minus = sc.nextInt();
                int plus = sc.nextInt();

                people = people - minus + plus;

                if (people > max) {
                    max = people;
                }
            }

            System.out.println(max);
        }
    }