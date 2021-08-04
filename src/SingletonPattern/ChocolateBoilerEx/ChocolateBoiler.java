package SingletonPattern.ChocolateBoilerEx;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    public static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            return new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    private void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
