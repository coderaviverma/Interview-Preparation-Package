package company.gs;

// Given a a string of letters and a dictionary, the function longestWord should
//     find the longest word or words in the dictionary that can be made from the letters
//     Input: letters = "oet", dictionary = {"to","toe","toes"}
//     Output: {"toe"}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryDemo {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();
        ls.add("to");
        ls.add("toeo");
        ls.add("toeos");

        String word = "ooote";

        findTheWord(word,ls);
    }


    public static void findTheWord(String word, List<String> ls) {

        // get letter counts for the input/letters string
        Map<Character, Integer> letocc = new HashMap<Character, Integer>();
        for (char c : word.toCharArray())
            if (!letocc.containsKey(c))
                letocc.put(c, 1);
            else
                letocc.put(c, letocc.get(c) + 1);


        String result = "";
        int matchCount=0;
        for (String wd : ls) {
            Map<Character,Integer> temp=new HashMap<>(letocc);
            int leng=word.length();
            int tempMatchCount=0;

            for (char c:wd.toCharArray()){

                if (temp.containsKey(c)){
                    if (leng>0 && temp.get(c)>0){
                        temp.put(c,temp.get(c)-1);
                        leng--;

                        tempMatchCount++;

                        if (tempMatchCount>matchCount || (tempMatchCount==matchCount && word.length()<result.length())){
                            matchCount=tempMatchCount;
                            result=wd;
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}
