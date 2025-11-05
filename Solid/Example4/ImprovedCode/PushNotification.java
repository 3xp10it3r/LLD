package LLD.Solid.Example4.ImprovedCode;

public class PushNotification implements Notification {

    @Override
    public void sendMessage(String message) {
        // Logic to send Push notification
        System.out.println("Sending Push Notification: " + message);
    }
}
