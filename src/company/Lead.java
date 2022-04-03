//package company;
//
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//import org.json.simple.parser.ParseException;
//
//import java.util.*;
//
//public class Lead {
//    /*
//    * Input { “airtel”:{ “male”:50, “female”:100 }, “vodafone”:{ “male”:10, “female”:5 }, “jio”:{ “male”:500, “female”:50 } }
//    *
//    Output: It should sum male & female and give the result in sorted order like below { “jio”:550,“airtel”:150,”Vodafone”:15}
//    * */
//    public static void main(String[] args) {
//
//        String json = "{\n" +
//                "  \"airtel\": {\n" +
//                "    \"male\": \"50\",\n" +
//                "    \"female\": \"100\"\n" +
//                "  },\n" +
//                "  \"vodafone\": {\n" +
//                "    \"male\": \"10\",\n" +
//                "    \"female\": \"5\"\n" +
//                "  },\n" +
//                "  \"jio\": {\n" +
//                "    \"male\": \"500\",\n" +
//                "    \"female\": \"50\"\n" +
//                "  }\n" +
//                "}";
//
//        try {
//            System.out.println(solve(json));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    private static String solve(String jsonText) throws ParseException {
//        Map<String, Map<String, Integer>> retMap = new Gson().fromJson(
//                jsonText, new TypeToken<HashMap<String, Map<String, Integer>>>() {
//                }.getType()
//        );
//
//        TreeMap<String, Integer> map = new TreeMap<>();
//
//        for (Map.Entry<String, Map<String, Integer>> mp : retMap.entrySet()) {
//
//            Map<String, Integer> user = mp.getValue();
//            int total = 0;
//            if (user != null && user.size() > 0)
//                for (Map.Entry<String, Integer> userVal : user.entrySet()) {
//                    total += userVal.getValue();
//                }
//            map.put(mp.getKey(), total);
//        }
//
//        return valueSort(map).toString();
//    }
//
//    public static <K, V extends Comparable<V>> Map<K, V> valueSort(final Map<K, V> map) {
//        // Static Method with return type Map and
//        // extending comparator class which compares values
//        // associated with two keys
//        Comparator<K> valueComparator = new Comparator<K>() {
//
//            // return comparison results of values of
//            // two keys
//            public int compare(K k1, K k2) {
//                int comp = map.get(k2).compareTo(
//                        map.get(k1));
//                if (comp == 0)
//                    return 1;
//                else
//                    return comp;
//            }
//
//        };
//
//        // SortedMap created using the comparator
//        Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
//        sorted.putAll(map);
//        return sorted;
//    }
//}