package interfaceoverimplementation.betterapproach;

public class OracleConnection implements Connection {

    public void connect() {
        System.out.println("Connecting to oracle database...");
    }
}
