package company;

import java.util.*;
import java.util.stream.Collectors;

public class GspanDemo {


    public static void main(String[] args) {
        Map<String, String> ordersMap = new HashMap<>();

        ordersMap.put("order1", "Item1");
        ordersMap.put("order2", "Item7");
        ordersMap.put("order3", "Item1,Item2,Item7");
        ordersMap.put("order4", "Item7,Item2,Item3");
        ordersMap.put("order5", "Item7,Item2");

//        Map<String,Long> mp=ordersMap.entrySet().stream().map(o->o.getValue().split(",")).collect(Collectors.groupingBy())
//        List<String> ls=ordersMap.entrySet().stream().flatMap().collect(Collectors.toList());

        String[] result = ordersMap.values().stream().map(Object::toString).collect(Collectors.joining(",")).split(",");
        Map<String, Long> map = Arrays.stream(result).collect(Collectors.groupingBy(String::trim, Collectors.counting()));
        System.out.println(map.toString());


        //Spring boot app
        //1 Get End point - 2 Path Params(404/400) - 0 Query Params(400 bad request)
        //Employee (samples 5)
        //In memory DB


    }
}
