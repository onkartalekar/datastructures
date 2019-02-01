import org.apache.commons.lang3.time.DateUtils;

import java.util.Calendar;
import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(DateUtils.truncate(date, Calendar.DAY_OF_MONTH));
        System.out.println(DateUtils.getFragmentInHours(date, Calendar.DAY_OF_MONTH));
        System.out.println(DateUtils.getFragmentInMinutes(date, Calendar.HOUR_OF_DAY));
        System.out.println(DateUtils.getFragmentInSeconds(date, Calendar.MINUTE));
    }
}
