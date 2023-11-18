package headfirst.factory.pizzafm;

public class SeoulStyleKimchiPizza extends Pizza{
    public SeoulStyleKimchiPizza() {
        name = "Seoul Style Kimchi Pizza";
        dough = "Dough made by Rice";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Kimchi Toppings Add");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
