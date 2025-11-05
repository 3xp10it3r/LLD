package LLD.Solid.Example4.ProblematicCode;

import java.util.List;

public class NotificationCenter {
    
    public void sendNotification(List<NotificationType> NotificationTypes, String message) {
        for (NotificationType type : NotificationTypes) {
            switch (type) {
                case SMS:
                    type.sendSMSNotification(message, "123-456-7890");
                    break;
                case EMAIL:
                    type.sendEmailNotification(message, "");
                    break;
                case PUSH:
                    type.sendPushNotification(message, "user_device_token");
                    break;
                case WHATSAPP:
                    type.sendWhatsAppNotification(message, "123-456-7890");     
                    break; 
            }
        }
    }
}
