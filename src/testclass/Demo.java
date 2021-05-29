package testclass;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {

        int[] a = {1, 3, 5, 6, 7, 4};

        solve(a,13);

    }

    private static void solve(int[] a, int target) {

        int v1, v2, v3;
        int n = a.length;
        int tar = target;
        boolean foundSum = false;
        Map<Integer, Integer> hm = new HashMap<>();//On

        for (int i = 0; i < n; i++) {
            hm.put(a[i], i);
        }

        for (int i = 0; i < n; i++) {//On^2

            for (int j = i + 1; j < n; j++) {

                int sub = tar - (a[i] + a[j]);

                if (hm.containsKey(sub)) {
                    v1 = a[i];
                    v2 = a[j];
                    v3 = sub;
                    System.out.println(v1 + "," + v2 + "," + v3);
                    foundSum = true;
                    break;
                }

                if (foundSum)
                    break;
            }
        }
    }
}
