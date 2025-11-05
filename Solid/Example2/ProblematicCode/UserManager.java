package LLD.Solid.Example2.ProblematicCode;

public class UserManager {

    public void add(User user) {
        // Logic to add user
        System.out.println("User " + user.getName() + " added.");
    }

    public void remove(User user) {
        // Logic to remove user
        System.out.println("User " + user.getName() + " removed.");
    }

    public void update(User user) {
        // Logic to update user
        System.out.println("User " + user.getName() + " updated.");
    }

    public void get(User user) {
        // Logic to get user by email
        System.out.println("Fetched user " + user.getName() + " with email " + user.getEmail());
    }

    public void logUserActivity(User user) {
        // Logic to log user activity
        System.out.println("User " + user.getName() + " performed activity logged. ");
    }
}
