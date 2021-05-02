package company.gs.dictonary;

import java.util.*;

class Solution {
    public String getLongest(Set<String> dict, String letters) {

        // get letter counts for the input/letters string
        Map<Character, Integer> letocc = new HashMap<Character, Integer>();
        for (char c : letters.toCharArray())
            if (!letocc.containsKey(c))
                letocc.put(c, 1);
            else
                letocc.put(c, letocc.get(c) + 1);

        // check if each word is longer than previous longest valid word
        String result = "";
        for (String s : dict)
            if (s.length() > result.length() && isWordOfLetters(s, letters, letocc))
                result = s;

        return result.length() == 0 ? null : result;
    }

    private boolean isWordOfLetters(String s, String letters, Map<Character, Integer> letocc) {
        Map<Character, Integer> occ = new HashMap<Character, Integer>();

        //count occurrences of letters in word 's' from dictionary
        for (char c : s.toCharArray())
            if (!occ.containsKey(c))
                occ.put(c, 1);
            else
                occ.put(c, occ.get(c) + 1);

        //if any letter in input string doesn't exist or exists in less number
        //in the word s, then the word doesn't pass our test
        for (char c : letters.toCharArray())
            if (!occ.containsKey(c) || occ.get(c)<letocc.get(c))
                return false;

        return true;  //word has all the characters of input string (letters)
    }
    public static void main(String[] args) {


        String[] array =new String[]{"to", "toe", "toes", "doe", "dog", "god", "dogs", "banana"};
        Set<String> set = new HashSet<>(Arrays.asList(array));

        String s="toe";
        Solution solution=new Solution();

        System.out.println(solution.getLongest(set,s));
    }
}