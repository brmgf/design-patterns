package interfaceoverimplementation.context;

public class ReservationService {

    MySQLConnection mySQLConnection;

    public ReservationService() {
        this.mySQLConnection = new MySQLConnection();
    }

    public void connectToDataBase() {
        mySQLConnection.connect();
        System.out.println("Reservation service is connected to database");
    }
}
