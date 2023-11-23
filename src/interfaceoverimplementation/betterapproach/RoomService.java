package interfaceoverimplementation.betterapproach;

public class RoomService {

    Connection connection;

    public RoomService(Connection connection) {
        this.connection = connection;
    }

    public void connectToDataBase() {
        connection.connect();
        System.out.println("Room service is connected to database");
    }
}
