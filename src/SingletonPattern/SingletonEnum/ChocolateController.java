package SingletonPattern.SingletonEnum;

import SingletonPattern.ChocolateBoilerEx.ChocolateBoiler;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();

        // Another instantiation will return the existing instance
    }
}
