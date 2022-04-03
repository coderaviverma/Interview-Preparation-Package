package practice.ds.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PermutationString {

    public static void main(String[] args) {

        String a = "abc";
        String b = "";
        ArrayList<String> ls = new ArrayList<>();
        System.out.println(permutation(b, a, ls));

        System.out.println("--------------------------------------------------");

        int[] arr = {1, 2, 3};

//        arrPermutation(arr);
    }

    public static ArrayList<String> permutation(String prefix, String suffix, ArrayList<String> list) {

        if (suffix.length() == 0) {
            list.add(prefix);
        } else {

            for (int i = 0; i < suffix.length(); i++) {

                permutation(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1), list);
            }
        }

        return list;
    }

    private static void arrPermutation(int[] a) {
        Set<int[]> ls = new HashSet<>();
        int start = 0;
        permutations(a, start, ls);

        ls.forEach(o -> System.out.println(o[0]+","+o[1]+","+o[2]));
    }

    private static void permutations(int[] a, int start, Set<int[]> ls) {

        if (start >= a.length) {
            ls.add(a.clone());
        } else {

            for (int i = 0; i < a.length; i++) {

                swap(a, start, i);
                permutations(a, start + 1, ls);
                swap(a, start, i);

            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
