package RefactoredCode.processor;

import RefactoredCode.model.Room;
import RefactoredCode.service.NotificationService;

public class ReservationProcessor {
    private NotificationService notificationService;

    public ReservationProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processReservation(String roomType, String guestName) {
        Room room = new Room(101, roomType);
        System.out.println("Processing reservation for " + guestName + " in a " + roomType + " room.");

        double price = room.getPrice();
        System.out.println("Room price: $" + price);

        sendNotification(guestName);
    }

    private void sendNotification(String guestName) {
        notificationService.sendNotification("Reservation confirmed for " + guestName);
    }
}

