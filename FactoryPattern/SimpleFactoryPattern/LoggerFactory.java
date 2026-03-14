package LLD.FactoryPattern.SimpleFactoryPattern;

public interface LoggerFactory {
    public static ILogger createLogger(Logger logLevel){
        switch(logLevel){
            case DEBUG:
                return new DebugLogger();
            case INFO:
                return new InfoLogger();
            case ERROR:
                return new ErrorLogger();
            default:
                return null;
        }
    }
}