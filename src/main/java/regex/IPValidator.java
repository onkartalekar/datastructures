package regex;
/*
 * Created by onkartalekar on 11/27/2018
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidator {

    public static void main(String... args) {
        //String ipAddress = "123.255.196.24";
        String ipAddress = "1000.2000.3000.4d33.5e36.6abc.7dc3.8ac2";
        //String ipAddress = "abc123.255.196.24";

        if (validateIPv4(ipAddress)) {
            System.out.println("IPv4");
        } else if (validateIPv6(ipAddress)) {
            System.out.println("IPv6");
        } else {
            System.out.println("Neither");
        }
    }

    private static boolean validateIPv6(String ipAddress) {
        String ipv6Regex = "^(([0-9a-f]{1,4})\\.){1,7}([0-9a-f]{1,4})$";
        Pattern ipv6Pattern = Pattern.compile(ipv6Regex);
        return ipv6Pattern.matcher(ipAddress).find();
    }

    private static boolean validateIPv4(String ipAddress) {
        String ipv4Regex = "^([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})$";
        int minAddress = 0;
        int maxAddress = 255;
        Pattern ipv4Pattern = Pattern.compile(ipv4Regex);
        Matcher ipv4Matcher = ipv4Pattern.matcher(ipAddress);

        if (ipv4Matcher.find()) {
            Integer first = Integer.valueOf(ipv4Matcher.group(1));
            Integer second = Integer.valueOf(ipv4Matcher.group(2));
            Integer third = Integer.valueOf(ipv4Matcher.group(3));
            Integer fourth = Integer.valueOf(ipv4Matcher.group(4));

            return (minAddress <= first && first <= maxAddress) &&
                    (minAddress <= second && second <= maxAddress) &&
                    (minAddress <= third && third <= maxAddress) &&
                    (minAddress <= fourth && fourth <= maxAddress);
        }
        return false;
    }
}
