package DecoratorPattern.StarbuzzApp;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2.setSize(Beverage.Size.GRANDE);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost() + ' ' + beverage2.getSize());


    }
}
