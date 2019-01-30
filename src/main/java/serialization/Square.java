package serialization;
/*
 * Created by onkartalekar on 1/19/2019
 */

import java.io.IOException;
import java.io.ObjectInputStream;

public class Square extends Shape {

    private static final long serialVersionUID = 1L;

    private static final String NAME = "SQUARE";

    private transient int nameSize;

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("This is a square:" + nameSize);
    }

    @Override
    public void calcArea() {
        setArea(side * side);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
    }

    private Object readResolve() {
        this.nameSize = NAME.length();
        return this;
    }
}
