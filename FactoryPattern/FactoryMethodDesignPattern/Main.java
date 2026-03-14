package LLD.FactoryPattern.FactoryMethodDesignPattern;

public class Main {
    public static void main(String[] args) {
        ILoggerFactory debugLoggerFactory = new DebugLoggerFactory();
        ILogger debugLogger = debugLoggerFactory.createLogger();
        debugLogger.log("This is debug log");

        ILoggerFactory infoLoggerFactory = new InfoLoggerFactory();
        ILogger infoLogger = infoLoggerFactory.createLogger();
        infoLogger.log("I'm info logger");

        ILoggerFactory errorLoggerFactory = new ErrorLoggerFactory();
        ILogger errorLogger = errorLoggerFactory.createLogger();
        errorLogger.log("I'm Error log");
    }
}
