package patterns.factorymethod;

public class ConcreteCreator implements Creator {

    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
