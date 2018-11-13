package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by taleko01 on 10/16/2018
 */

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        String input = "<p><a href=\"http://www.quackit.com/html/tutorial/html_links.cfm\" title=\"abc\"><b>Example Link</b></a></p>";
        Pattern urlPattern = Pattern.compile("(?<=<a href=\")(.+)(?=\" *.*)(.+)(?=</a>)");
//   (?<=>)(.+)(?=<)
        Matcher urlMatcher = urlPattern.matcher(input);
        if (urlMatcher.find()) {
            String url = urlMatcher.group(1);
            System.out.println(url);

            Pattern titlePattern = Pattern.compile("(?<=\\w>)(.*)(?=</)");
            Matcher titleMatcher = titlePattern.matcher(urlMatcher.group(2));

            if(titleMatcher.find()){
                String title = titleMatcher.group(1);
                System.out.println(title);
            }

        }
    }
}
