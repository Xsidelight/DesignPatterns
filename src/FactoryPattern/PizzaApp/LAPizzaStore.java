package FactoryPattern.PizzaApp;

public class LAPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new LACheesePizza();
        }  else if (item.equals("clam")) {
            return new LAClamPizza();
        }  else return null;
    }
}
