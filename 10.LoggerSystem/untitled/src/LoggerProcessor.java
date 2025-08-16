public abstract class LoggerProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    public static int EXCEPTION = 4;

    LoggerProcessor nextLoggerProcessor;

    LoggerProcessor(LoggerProcessor nextLoggerProcessor){
        this.nextLoggerProcessor = nextLoggerProcessor;
    }

    public void log(int logLevel, String message){
        if(nextLoggerProcessor!=null){
            nextLoggerProcessor.log(logLevel,message);
        }
    }


}
