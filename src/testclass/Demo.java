package testclass;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {

//        Map<Integer, String> courseDetails = new HashMap<>();
//        courseDetails.put(100, "Physics");
//        courseDetails.put(200, "Chemistry");
//        courseDetails.put(300, "Mathematics");
//        courseDetails.put(400, "Computer");
//        courseDetails.put(500, "Electronics");
//        courseDetails.put(600, "Hindi");

        //Keys should be greater than 200
        //key should be appended with 01  -  30001
        //value shoould be appended with name
        //oputput should be in MAP

//        courseDetails=  courseDetails.entrySet().stream()
//                .filter(k-> k.getKey()>200)
//                .map(k-> ((k.getKey() * 10) + 1))
//                .collect(Collectors.toMap(Integer::));


        int[] a = {1, 2, 3, 4, 5,0,1};
        int[] b=new int[a.length];
//        long product=1;

//        for (int b:a){
//            if (b>1){
//                product=product*b;
//            }
//        }

        for (int i = 0; i < a.length; i++) {
            int product = 1;

            for (int j = 0; j < a.length; j++) {

                if (i == j) {

                } else {
                    product = product * a[j];
                }
            }

            b[i] = product;
        }

        for (int c:b){
            System.out.print(c+" ");
        }


    }


}
