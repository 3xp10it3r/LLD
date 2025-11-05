package LLD.Solid.Example4.ImprovedCode;

public class EmailNotification implements Notification {

    @Override
    public void sendMessage(String message) {
        // Logic to send Email notification
        System.out.println("Sending Email: " + message);
    }
}
