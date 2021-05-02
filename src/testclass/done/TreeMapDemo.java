package testclass.done;

import java.util.*;

public class TreeMapDemo {


    public static void main(String[] args) {



        Map<String,Integer> map=new TreeMap<>();
        map.put("100.1.2.3",1);
        map.put("100.1.2.6",5);
        map.put("100.1.2.4",4);

        // Calling the method valueSort
        Map sortedMap = valueSort(map);

        // Get a set of the entries on the sorted map
        Set set = sortedMap.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while (i.hasNext()) {

            Map.Entry mp = (Map.Entry)i.next();
            System.out.print(mp.getKey() + ": ");
            System.out.println(mp.getValue());

        }
        System.out.println();
    }

    public static <K,V extends Comparable<V>> Map<K,V> valueSort(final Map<K,V> map){

        Comparator<K> valueComparator=new Comparator<K>() {
            @Override
            public int compare(K o1, K o2) {

//                int comp=map.get(o1).compareTo(map.get(o2));//ASC sort
                int comp=map.get(o2).compareTo(map.get(o1));//DESC Sort
                if (comp==0){
                    return 1;
                }
                return comp;
            }
        };

        Map<K,V> sorted=new TreeMap<>(valueComparator);
        sorted.putAll(map);

        return sorted;
    }




}
