package company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class UniCommerce {

    public static void main(String[] args) {

///10 9	11	12	-10	20	2	1
//11 11	12	20	20	-1	-1	-1
        int[] a = {10, 2, 3, 11};

        Arrays.stream(solve(a)).forEach(System.out::println);

        int[][] mat={{0,0,0,0,1,1},{0,0,0,1,1,1},{0,0,0,0,0,1},{0,0,1,1,1,1},{0,0,0,0,1,1}};
//        System.out.println(solve2(mat));
    }

    private static int[] solve(int[] a) {

        int[] res = new int[a.length];
        int n = a.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            int val = a[n - 1 - i];

            while (stack.isEmpty() || val > stack.peek()) {
                if (stack.empty()) {
                    res[n - 1 - i] = -1;
                    stack.push(val);
                    break;
                } else if (val < stack.peek()) {
                    res[n - 1 - i] = stack.peek();
                    stack.push(val);
                    break;
                } else {
                    stack.pop();
                }
            }

        }

        return res;
    }

//000011
//000111
//000001
//001111
//000011

    private static int solve2(int[][] a){
        int n=a.length;
        int m=a[0].length;

        int longestRow=-1;
        int maxOne=0;

        for (int i = 0; i < n; i++) {


            if (maxOne==0) {

                for (int j = m - 1; j >= 0; j--) {

                    if (maxOne == 0) {
                        int temp = a[i][j];
                        if (temp == 1) {
                            maxOne++;
                            longestRow = i;
                        } else {
                            break;
                        }
                    }
                }

            }else {

                int temp = a[i][maxOne + 1];
                if (temp == 1) {
                    maxOne++;
                    longestRow = i;
                } else {
                    break;
                }
            }

        }

        return longestRow+1;

    }


}
