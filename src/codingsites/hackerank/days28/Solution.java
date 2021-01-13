package codingsites.hackerank.days28;

import java.util.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            
            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            if (emailID.contains("@gmail.com"))
            sortedMap.put(emailID,firstName);
        }

        sortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x->System.out.println(x.getValue()));


        scanner.close();
    }
}
