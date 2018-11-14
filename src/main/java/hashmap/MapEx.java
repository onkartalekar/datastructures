package hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by taleko01 on 11/7/2018
 */

public class MapEx {

    public static void main(String... args) {

        Map<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(5, 50000);
        treeMap.put(1, 10000);
        treeMap.put(3, 30000);
        treeMap.put(2, 20000);
        treeMap.put(4, 40000);

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(treeMap.entrySet());

        for (int i = 0; i < entries.size(); i++) {
            Map.Entry<Integer, Integer> entry = entries.get(i);
            System.out.println("Key: " + entry.getKey() + ", Value:" + entry.getValue());
        }

    }

}
