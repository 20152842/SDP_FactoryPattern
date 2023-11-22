package headfirst.factory.pizzafm;

public class SeoulStyleCheesePizza extends Pizza {
    public SeoulStyleCheesePizza() {
        name = "Seoul Style Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
