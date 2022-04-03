package company.intuit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OnlineCoding {


    public static void main(String[] args) {

    String req="gfe";
    solve(req);

    }


    private static void solve(String word){ //cat
        String[] a={"tac","act","bcd","efg"};

        HashMap<String, List<String>> hm=new HashMap<>();

        for(String res:a){
            char[] chr=res.toCharArray();
            Arrays.sort(chr);
            String s=new String(chr);

            if(hm.containsKey(s)){
                List<String> ls=hm.get(s);
                ls.add(res);
                hm.put(s,ls);
            }else{
                List<String> ls=new ArrayList<>();
                ls.add(res);
                hm.put(s,ls);
            }
        }

        char[] chr=word.toCharArray();
        Arrays.sort(chr);
        String reqWord=new String(chr);
        List<String> res =  hm.get(reqWord);
        //act,tac
        System.out.println(res.toString());
    }
}
