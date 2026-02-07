package LLD.FactoryPattern.SimpleFactoryPattern;

public class Main {
    public static void main(String[] args) {
        ILogger debugLogger = LoggerFactory.createLogger(Logger.DEBUG);
        debugLogger.log("This is debug log");

        ILogger infoLogger = LoggerFactory.createLogger(Logger.INFO);
        infoLogger.log("I'm info logger");

        ILogger errorLogger = LoggerFactory.createLogger(Logger.ERROR);
        errorLogger.log("I'm Error log");
    }
}
