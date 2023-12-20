package patterns.facade;

public class Facade {

    private Service1 service1;
    private Service2 service2;
    private Service3 service3;

    public Facade() {
        this.service1 = new Service1();
        this.service2 = new Service2();
        this.service3 = new Service3();
    }

    public void getService1() {
        service1.executeMethod();
    }

    public void getService2() {
        service2.executeMethod();
    }

    public void getService3() {
        service3.executeMethod();
    }

}
