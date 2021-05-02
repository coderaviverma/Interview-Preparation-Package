package language.java.corebasic.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Arthimatic {


    public static void main(String[] args) {

        List<Integer> ls=new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(8);

//        long sum = ls.stream()
//                .filter(o->o%2==1)
//                .map(o->o*o)
//                .mapToLong(Integer::longValue)
//                .sum();

                List<Integer> v = ls.stream()
                .filter(o->o%2==1)
                .map(o->o*o)
                .collect(Collectors.toList());



//        System.out.println(sum);

    }
}
