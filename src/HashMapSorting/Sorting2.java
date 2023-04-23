package HashMapSorting;

import java.util.*;

public class Sorting2 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 22);
        map.put("Bob", 18);
        map.put("Charlie", 25);


        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());



        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });


        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }


        System.out.println(sortedMap);

    }
}
