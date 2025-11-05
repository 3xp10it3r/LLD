package LLD.Solid.Example4.ProblematicCode;

public enum NotificationType {
    SMS,
    EMAIL,
    PUSH,
    WHATSAPP;

    public void sendSMSNotification(String message, String recipient) {
        // Logic to send SMS notification
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }

    public void sendEmailNotification(String message, String recipient) {
        // Logic to send Email notification
        System.out.println("Sending Email to " + recipient + ": " + message);
    }

    public void sendPushNotification(String message, String recipient) {
        // Logic to send Push notification
        System.out.println("Sending Push Notification to " + recipient + ": " + message);
    }

    public void sendWhatsAppNotification(String message, String recipient) {
        // Logic to send WhatsApp notification
        System.out.println("Sending WhatsApp to " + recipient + ": " + message);
    }
}
