package language.java.test;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {


    public static void main(String[] args) {

        String a = "aaabcccdeeef";

        System.out.println(m4(a));
    }

//    public static char m3(String s){
//
//        Map<Character,Integer> hm=new HashMap<>();
//
//
//
//
//    }

    public static char m4(String s) {

        for (int i = 0; i < s.length(); i++) {
            int first = s.indexOf(s.charAt(i));
            int last = s.lastIndexOf(s.charAt(i));
            System.out.println(s.charAt(i) + " - " + first + " - " + last);
            if (first == last) {
                return s.charAt(i);
            }

        }
        return '_';
    }
}
