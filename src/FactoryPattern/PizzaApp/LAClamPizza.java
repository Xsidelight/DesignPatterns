package FactoryPattern.PizzaApp;

public class LAClamPizza extends Pizza {
    public LAClamPizza() {
        name = "LA Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }
}
