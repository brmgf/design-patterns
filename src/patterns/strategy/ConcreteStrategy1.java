package patterns.strategy;

public class ConcreteStrategy1 implements Strategy {

    @Override
    public void doTask() {
        System.out.println("Do task by ConcreteStrategy1");
    }

}
