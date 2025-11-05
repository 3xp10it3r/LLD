package LLD.Solid.Example4.ImprovedCode;

import java.util.List;

// SRP Example: Notification System adhering to SOLID principles

public class Main {
    public static void main(String[] args) {
        NotificationCenter notificationCenter = new NotificationCenter();

        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SMSNotification();
        Notification pushNotification = new PushNotification();

        List<Notification> notifications = List.of(emailNotification, smsNotification, pushNotification);

        notificationCenter.sendNotification(notifications, "Hello! This is a test notification.");
    }
}
