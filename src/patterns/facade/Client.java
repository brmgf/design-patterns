package patterns.facade;

public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.getService1();
        facade.getService2();
        facade.getService3();
    }
}
