package interfaceoverimplementation.betterapproach;

public class MySQLConnection implements Connection {

    public void connect() {
        System.out.println("Connecting to mysql database...");
    }
}
