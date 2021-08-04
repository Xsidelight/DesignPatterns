package SingletonPattern.SingletonEnum;

public enum Singleton {
    UNIQUE_INSTANCE;


    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
