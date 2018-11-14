import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by TalekO01 on 7/9/2018
 */

public class Test {

    public static void main(String... args) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, null, 4, 5));

        //while(integers.remove(null));

        List<Integer> collect = integers.stream().filter(Objects::nonNull).collect(Collectors.toList());
        collect.forEach(i -> System.out.println(i));

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
        System.out.println(Math.floor(Math.sqrt(24)));

        String[] strArray = {"a", "z", "b"};
        Arrays.sort(strArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0);
            }
        });

        Pattern phonePatterm = Pattern.compile("\\d{3}([,\\s])+\\d{4}");
        System.out.println(phonePatterm.matcher("1111111").find());
        System.out.println(phonePatterm.matcher("111 1111").find());
        System.out.println(phonePatterm.matcher("111-1111").find());
        System.out.println(phonePatterm.matcher("111,1111").find());
        System.out.println(phonePatterm.matcher("111,,,,1111").find());
        System.out.println(phonePatterm.matcher("111    1111").find());
*/
		/*Map<Integer, Integer> integerMap = new ConcurrentHashMap<>();
		
		integerMap.put(1, 100);
		integerMap.put(2, 200);
		integerMap.put(3, 300);
		integerMap.put(4, 400);
		
		System.out.println("Size : " + integerMap.size());
		
		for (Integer integer : integerMap.keySet()) {
			System.out.println(integerMap.get(integer) + " : removed");
			integerMap.remove(integer);
		}
		
		System.out.println("Size : " + integerMap.size());*/
    }
}
