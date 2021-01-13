package language.java.corebasic.stream;

import java.util.*;

import static java.util.Map.Entry.comparingByKey;
import static java.util.stream.Collectors.toMap;

public class StreamBasic {


    public static void main(String[] args) {

        sortListByStream();
    }

    private static void sortListByStream(){

        List<String> names = Arrays.asList("Katka", "Martin", "John","Rohit","Shashi","Avinash","Mohit","Rahul");

        Object[] sorted=names.stream().sorted(String::compareTo).toArray();


        System.out.println("Array:- "+ Arrays.toString(sorted));
    }


    private static void sortMapByKeyinStream(){
        HashMap<String,String> stringMap=new HashMap<>();
        stringMap.put("1","Katka");
        stringMap.put("2","Martin");
        stringMap.put("3","John");
        stringMap.put("4","Rohit");
        stringMap.put("5","Shashi");
        stringMap.put("6","Avinash");
        stringMap.put("7","Mohit");

//        Map sorted=stringMap.entrySet().stream()
//                .sorted(comparingByKey())
//                .collect(toMap(e -> e.getKey(), e -> e.getValue(),
//                        (e1, e2) -> e2), LinkedHashMap::new));

//        Map sorted = stringMap
//                .entrySet()
//                .stream()
//                .sorted(comparingByKey())
//                .collect(toMap(e1 -> e1.getKey(), e -> e.getValue(),
//                        (e1, e2) -> e2), LinkedHashMap::new);
//

    }
}
