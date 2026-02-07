package LLD.FactoryPattern.SimpleFactoryPattern;

public class ErrorLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("ERROR: " + message);
    }
}
