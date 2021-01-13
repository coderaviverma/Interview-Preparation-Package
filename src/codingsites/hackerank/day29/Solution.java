package codingsites.hackerank.day29;

import java.util.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            System.out.println(solve(n,k));
        }

        scanner.close();
    }

    static int solve(int N, int K) {
        int result = 0;
        for (int A = 1; A <= N; A++) {
            for (int B = A + 1; B <= N; B++) {
                int current = A & B;
                if (current > result && current < K) {
                    result = current;
                }
            }
        }
        return result;
    }
}
