import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Created by TalekO01 on 7/9/2018
 */

public class Test {

    public static void main(String... args) {

       /* List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, null, 4, 5));

        //while(integers.remove(null));

        List<Integer> collect = integers.stream().filter(Objects::nonNull).collect(Collectors.toList());
        collect.forEach(i -> System.out.println(i));
*/
        /*String str = "adbc";
        char[] charArray = str.toCharArray();
        charArray[0] = 'C';

        Pattern pattern = Pattern.compile("\\w");
        System.out.println(pattern.matcher(str).find());

        System.out.println(str);
        System.out.println(charArray);

        System.out.println(Math.sqrt(25));
        System.out.println((int) Math.sqrt(25));
        System.out.println(Math.round(Math.sqrt(25)));

        System.out.println(Math.sqrt(24));
        System.out.println((int) Math.sqrt(24));
        System.out.println(Math.floor(Math.sqrt(24)));*/

        String[] strArray = {"a", "z", "b"};
        Arrays.sort(strArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0);
            }
        });
/*
        Pattern phonePatterm = Pattern.compile("\\d{3}([,\\s])+\\d{4}");
        System.out.println(phonePatterm.matcher("1111111").find());
        System.out.println(phonePatterm.matcher("111 1111").find());
        System.out.println(phonePatterm.matcher("111-1111").find());
        System.out.println(phonePatterm.matcher("111,1111").find());
        System.out.println(phonePatterm.matcher("111,,,,1111").find());
        System.out.println(phonePatterm.matcher("111    1111").find());*/

        Map<Integer, Integer> integerMap = new ConcurrentHashMap<>();

        integerMap.put(1, 100);
        integerMap.put(2, 200);
        integerMap.put(3, 300);
        integerMap.put(4, 400);


        /*Object[] objects = integerMap.values().toArray();

        System.out.println(objects[0]);*/

        System.out.println("------------------");
        for (Integer integer : integerMap.keySet()) {
            System.out.println(integer + " -> " + integerMap.get(integer));
            System.out.println(integerMap.get(integer) + " : removed");
            integerMap.remove(integer);
        }
/*
        Map<Integer, Integer> map = new Hashtable<>();

        map.put(1, 100);
        map.put(3, 300);
        map.put(2, 200);
        map.put(4, 400);

        Collections.sort(new ArrayList<>(map.entrySet()), (o1, o2) -> o2.getKey() - o1.getKey());

        System.out.println("------------------");
        for (Integer integer : map.keySet()) {
            System.out.println(integer + " -> " + map.get(integer));
        }


        Map<Integer, Integer> treeMap = new TreeMap<>((o1, o2) -> o1 == null ? 0 : o2 - o1);

        treeMap.put(1, 100);
        treeMap.put(2, 200);
        treeMap.put(null, 500);
        treeMap.put(3, 300);
        treeMap.put(4, 400);

        System.out.println("------------------");
        treeMap.keySet().forEach(key -> System.out.println(key + " -> " + treeMap.get(key)));

        MultiMap multiMap = new MultiValueMap();

        multiMap.put(1, 100);
        multiMap.put(1, 100);
        multiMap.put(2, 200);
        multiMap.put(1, 500);
        multiMap.put(3, 300);
        multiMap.put(4, 400);

        System.out.println("------------------ MultiMap");
        multiMap.keySet().forEach(key -> {
            Object val = multiMap.get(key);
            System.out.println(key + " -> " + val);
        });

        printCurrentMethodName();

        String[] strings = {"ABC", "DEF", "GHI"};
        System.out.println(Arrays.toString(strings));

        String str = "abc", str2 = null, str3 = str != null ? str : null;
        System.out.println(String.format("%s %s %s", str, str2, str3));

        Map<String, List<String>> stringStringMap = new HashMap<>();
        stringStringMap.put("1", new ArrayList<>(Arrays.asList("VAL1")));

        List<String> stringSet = stringStringMap.get("1");
        stringSet.add("VAL2");

        System.out.println(Arrays.toString(stringSet.toArray(new String[0])));

        MultiValueMap stringMap = new MultiValueMap();
        stringMap.put("First", "One");
        stringMap.put("First", "Two");
        stringMap.put("First", "One");
        stringMap.put("Three", "Three");

        Set<String> keySet = stringMap.keySet();
        for (String o : keySet) {
            System.out.println(stringMap.get(o));
        }*/



       /* int i = 5;
        System.out.println(i ^ i << 3);

        String str = "Hello World";

        System.out.println(str.hashCode());*/
    }

    private static void printCurrentMethodName() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        //System.out.println(stackTrace[1].getMethodName());

        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        System.out.println(stackTraceElements[0].getMethodName());

    }
}
