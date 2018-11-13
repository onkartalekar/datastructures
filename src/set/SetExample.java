package set;

import common.Node;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by taleko01 on 11/13/2018
 */

public class SetExample {

    public static void main(String... args) {
        Set<Node> nodeSet = new HashSet<>();
        nodeSet.add(new Node(3));
        nodeSet.add(new Node(4));
        nodeSet.add(new Node(5));

        Set<Node> anotherNodes = new HashSet<>();
        anotherNodes.add(new Node(3));
        anotherNodes.add(new Node(4));

        System.out.println(nodeSet.contains(new Node(3)));


        Map<Integer, Node> integerNodeMap = new HashMap<>();
        integerNodeMap.put(3, new Node(3));
        integerNodeMap.put(4, new Node(4));
        integerNodeMap.put(5, new Node(5));

        Map<Integer, Node> nodeMap = new HashMap<>();
        nodeMap.put(3, new Node(7));
        nodeMap.put(4, new Node(4));

        System.out.println(containsAllAttributes(nodeMap, integerNodeMap));
    }

    private static boolean containsAllAttributes(Map<Integer, Node> jsonToMap, Map<Integer, Node> locAttributes) {
        boolean containsAllAttributes = false;
        for (Map.Entry entry : jsonToMap.entrySet()) {
            Integer entryKey = (Integer) entry.getKey();
            if (locAttributes.containsKey(entryKey) && entry.getValue().equals(locAttributes.get(entryKey))) {
                containsAllAttributes = true;
            } else {
                containsAllAttributes = false;
                break;
            }
        }

        return containsAllAttributes;
    }
}
