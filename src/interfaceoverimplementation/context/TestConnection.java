package interfaceoverimplementation.context;

public class TestConnection {

    public static void main(String[] args) {

        RoomService roomService = new RoomService();
        roomService.connectToDataBase();

        ReservationService reservationService = new ReservationService();
        reservationService.connectToDataBase();
    }

}
