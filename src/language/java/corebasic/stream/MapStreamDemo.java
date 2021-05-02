package language.java.corebasic.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class MapStreamDemo {

    public static void main(String[] args) {


        Map<String,String> mp=new HashMap<>();
        mp.put("1",null);
        mp.put("2","Avi");
        mp.put("3","Shashi");
        mp.put("4",null);
        mp.put("5","kitty");
        mp.put("6","anupama");

        mp= mp.entrySet().stream().filter(stringStringEntry -> stringStringEntry.getValue()!=null).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(mp);


    }
}
