package serialization;
/*
 * Created by onkartalekar on 1/19/2019
 */

import java.io.*;

public class Main {

    private static final String SHAPE_TXT = "shape.txt";

    public static void main(String... args) throws IOException, ClassNotFoundException {
        Shape square = new Square(5);

        serialize(square);
        Shape deserializedShape = deserialize();

        deserializedShape.draw();
    }

    private static void serialize(Shape square) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(SHAPE_TXT);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(square);

        objectOutputStream.close();
        fileOutputStream.close();
    }

    private static Shape deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(SHAPE_TXT);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Shape shape = (Square) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        return shape;
    }
}
