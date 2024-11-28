package service;

public class NotificationService {
    public void sendNotification(String phoneNumber, String message) {
        System.out.println("Sending notification to " + phoneNumber + ": " + message);
    }
}
