package builder;

/**
 * Created by taleko01 on 10/15/2018
 */

public class BuilderMain {

    public static void main(String... args){
        Pizza.Builder builder = new Pizza.Builder();

        Pizza pizza = builder.size(8).crust("Thin").toppings("Cheese").toppings("Peppers").toppings("Olives").build();

        System.out.println(pizza);

    }
}
