package HashMapSorting;

import java.util.*;

public class Sorting4 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 22);
        map.put("Bob", 18);
        map.put("Charlie", 25);


        List<Map.Entry<String,Integer>> list= new ArrayList<>(map.entrySet());


        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
               return o1.getValue().compareTo(o2.getValue());
            }
        });

        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();


        for (Map.Entry<String, Integer> en :
                list) {
            linkedHashMap.put(en.getKey(), en.getValue());

        }


        System.out.println(linkedHashMap);
    }
}
