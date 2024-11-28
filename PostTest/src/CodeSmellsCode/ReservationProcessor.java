package CodeSmellsCode;

class ReservationProcessor {
    public void processReservation(String roomType, String guestName, String notificationMethod) {
        Room room = new Room(101, roomType);
        System.out.println("Processing reservation for " + guestName + " in a " + roomType + " room.");

        double price = room.getPrice();
        System.out.println("Room price: $" + price);

        sendNotification(guestName, notificationMethod);        
    }

    public void sendNotification(String guestName, String notificationMethod){

        if (notificationMethod.equals("email")) {
            EmailNotificationService emailService = new EmailNotificationService();
            emailService.sendNotification("Reservation confirmed for " + guestName);
        } else if (notificationMethod.equals("sms")) {
            SMSNotificationService smsService = new SMSNotificationService();
            smsService.sendSMS("Reservation confirmed for " + guestName);
        } else {
            System.out.println("Invalid notification method.");
        }

    }
}
