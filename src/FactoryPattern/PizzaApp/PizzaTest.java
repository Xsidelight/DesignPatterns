package FactoryPattern.PizzaApp;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore laPizzaStore = new LAPizzaStore();
        Pizza pizzaLA = laPizzaStore.orderPizza("cheese");
        Pizza pizzaNY = nyPizzaStore.orderPizza("cheese");


        System.out.println("Ordered " + pizzaNY.name);
        System.out.println("Ordered " + pizzaLA.name);

    }
}
