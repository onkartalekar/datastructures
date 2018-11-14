package inner_outer;
/*
 * Created by onkartalekar on 11/11/2018
 */

public class Outer {

    public static void main(String...args){
        Object inner = new Outer().new Inner();
        ((Inner)inner).sayHello();
    }

    private class Inner{
        private void sayHello(){
            System.out.println("Hello");
        }
    }
}
