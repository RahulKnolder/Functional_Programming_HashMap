package HashMapSorting;

import com.sun.source.doctree.SeeTree;

import java.security.Key;
import java.util.*;

public class HashMapSorting {
    public static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>();

        map.put("Rahul",5);
        map.put("sinha",2);
        map.put("riya",90);
        map.put("sneha",63);

//
//        Map<String,Integer> treemap= new TreeMap<>(map);
         map.forEach((key, value) -> System.out.println(key + " : " + value));
       System.out.println("---------------------------------------------------------------------------------");
//        treemap.forEach((key, value) -> System.out.println(key + " : " + value));

        List<Map.Entry<String,Integer>> lsit= new ArrayList<>(map.entrySet());

        Collections.sort(lsit, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return o1.getValue().compareTo(o2.getValue());
            }
        });



        LinkedHashMap<String,Integer> linkedhashmap= new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : lsit) {
            linkedhashmap.put(entry.getKey(), entry.getValue());
        }
        linkedhashmap.forEach((key, value) -> System.out.println(key + " => " + value));

    }
}
