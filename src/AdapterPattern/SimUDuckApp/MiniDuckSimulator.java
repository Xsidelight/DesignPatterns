package AdapterPattern.SimUDuckApp;


import AdapterPattern.SimUDuckApp.Adapters.TurkeyAdapter;
import AdapterPattern.SimUDuckApp.Models.Duck;
import AdapterPattern.SimUDuckApp.Models.MallardDuck;
import AdapterPattern.SimUDuckApp.Models.Turkey;
import AdapterPattern.SimUDuckApp.Models.WildTurkey;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        turkey.gobble();
        turkey.fly();

        System.out.println("********************* Adapter Tests");
        testAdapter(duck);
        testAdapter(turkeyAdapter);



    }

    private static void testAdapter(Duck duck) {
        duck.fly();
        duck.quack();
    }


}
