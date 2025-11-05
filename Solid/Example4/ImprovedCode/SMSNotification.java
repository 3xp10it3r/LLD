package LLD.Solid.Example4.ImprovedCode;

public class SMSNotification implements Notification {
    
    @Override
    public void sendMessage(String message) {
        // Logic to send SMS notification
        System.out.println("Sending SMS: " + message);
    }
}
