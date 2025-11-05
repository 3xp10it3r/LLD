package LLD.Solid.Example4.ImprovedCode;

import java.util.List;

public class NotificationCenter {
    
    public void sendNotification(List<Notification> notifications, String message) {
        for (Notification notification : notifications) {
            notification.sendMessage(message);
        }
    }
}
