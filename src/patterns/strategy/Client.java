package patterns.strategy;

public class Client {

    public static void main(String[] args) {
        Strategy strategy1 = new ConcreteStrategy1();
        strategy1.doTask();

        Strategy strategy2 = new ConcreteStrategy2();
        strategy2.doTask();
    }

}
