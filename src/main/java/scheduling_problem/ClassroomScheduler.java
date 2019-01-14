package scheduling_problem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by taleko01 on 1/11/2019
 */

public class ClassroomScheduler {

    public static void main(String... args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        Lecture lectureOne = new Lecture(simpleDateFormat.parse("01/11/2019 09:00"), simpleDateFormat.parse("01/11/2019 12:00"));
        Lecture lectureTwo = new Lecture(simpleDateFormat.parse("01/11/2019 16:00"), simpleDateFormat.parse("01/11/2019 17:00"));
        Lecture lectureThree = new Lecture(simpleDateFormat.parse("01/11/2019 15:00"), simpleDateFormat.parse("01/11/2019 19:00"));
        int activeLecture = 0;

        List<Lecture> lectures = new ArrayList<>(Arrays.asList(lectureOne, lectureTwo, lectureThree));
        System.out.println(lectures);

        Map<Date, String> dateStringMap = new TreeMap<>();

        for (Lecture lecture : lectures) {
            dateStringMap.put(lecture.getStart(), "START");
            dateStringMap.put(lecture.getEnd(), "END");
        }

        for (Map.Entry<Date, String> dateStringEntry : dateStringMap.entrySet()) {
            if ("START".equalsIgnoreCase(dateStringEntry.getValue())) {
                activeLecture++;
            } else if ("END".equalsIgnoreCase(dateStringEntry.getValue())) {
                activeLecture--;
            }

            if (activeLecture > 1) {
                System.out.println("CONFLICT");
                break;
            }
        }
    }
}
