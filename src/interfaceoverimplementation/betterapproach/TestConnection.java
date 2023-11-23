package interfaceoverimplementation.betterapproach;

public class TestConnection {

    public static void main(String[] args) {

        RoomService roomService = new RoomService(new OracleConnection());
        roomService.connectToDataBase();

        ReservationService reservationService = new ReservationService(new OracleConnection());
        reservationService.connectToDataBase();
    }

}
