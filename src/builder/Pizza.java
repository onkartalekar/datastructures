package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taleko01 on 10/15/2018
 */

public class Pizza {

    private int size;
    private String crust;
    private List<String> toppings;

    private Pizza(){

    }

    public static class Builder {

        private int size;
        private String crust;
        private List<String> toppings = new ArrayList<>();

        public Builder size(int size) {
            this.size = size;
            return this;
        }

        public Builder crust(String crust) {
            this.crust = crust;
            return this;
        }

        public Builder toppings(String topping) {
            this.toppings.add(topping);
            return this;
        }

        Pizza build() {
            Pizza pizza = new Pizza();
            pizza.size = this.size;
            pizza.crust = this.crust;
            pizza.toppings = this.toppings;
            return pizza;
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", crust='" + crust + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
