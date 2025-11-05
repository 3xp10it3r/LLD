package LLD.Solid.Example4.BetterCode;

import java.util.List;

public class NotificationCenter {
    
    public void sendNotification(List<String> NotificationTypes, String message) {
        for (String type : NotificationTypes) {
            switch (type) {
                case "SMS":
                    SMSNotification sms = new SMSNotification();
                    sms.sendSMSNotification(message);
                    break;
                case "EMAIL":
                    EmailNotification email = new EmailNotification();
                    email.sendEmailNotification(message);
                    break;
                case "PUSH":
                    PushNotification push = new PushNotification();
                    push.sendPushNotification(message); 
                    break;
            }
        }
    }
}
