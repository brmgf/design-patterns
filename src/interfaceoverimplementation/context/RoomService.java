package interfaceoverimplementation.context;

public class RoomService {

    MySQLConnection mySQLConnection;

    public RoomService() {
        this.mySQLConnection = new MySQLConnection();
    }

    public void connectToDataBase() {
        mySQLConnection.connect();
        System.out.println("Room service is connected to database");
    }
}
