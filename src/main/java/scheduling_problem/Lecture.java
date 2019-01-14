package scheduling_problem;

import java.util.Date;

/**
 * Created by taleko01 on 1/11/2019
 */

public class Lecture {

    private Date start;

    private Date end;

    public Lecture(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
