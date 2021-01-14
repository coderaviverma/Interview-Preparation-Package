package language.java.corebasic.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hm=new HashMap();

        hm.put(1,1);
        hm.put(2,2);
        hm.put(3,3);
        hm.put(4,4);
        hm.put(5,5);
        hm.put(6,6);


        //Not possible
//        for (Map.Entry e:hm) {
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }

        hm.forEach((x,y)-> System.out.println(x));


    }
}
