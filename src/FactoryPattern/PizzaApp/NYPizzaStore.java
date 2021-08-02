package FactoryPattern.PizzaApp;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else return null;
    }
}
