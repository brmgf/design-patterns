package patterns.adapter;

public class Adapter implements Target {

    Adaptee adaptee;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void request() {
        System.out.println("Calling adapter");
        adaptee.request();
    }

}
