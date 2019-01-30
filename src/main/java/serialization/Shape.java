package serialization;
/*
 * Created by onkartalekar on 1/19/2019
 */

import java.io.Serializable;

public abstract class Shape implements Serializable {

    private double area;

    public abstract void draw();

    public abstract void calcArea();

    public void setArea(double area) {
        this.area = area;
    }
}
