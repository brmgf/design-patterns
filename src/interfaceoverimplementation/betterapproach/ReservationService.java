package interfaceoverimplementation.betterapproach;

public class ReservationService {

    Connection connection;

    public ReservationService(Connection connection) {
        this.connection = connection;
    }

    public void connectToDataBase() {
        connection.connect();
        System.out.println("Reservation service is connected to database");
    }
}
