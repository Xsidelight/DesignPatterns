package FactoryPattern.PizzaApp;

public class LACheesePizza extends Pizza {
    public LACheesePizza() {
        name = "LA Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

}
