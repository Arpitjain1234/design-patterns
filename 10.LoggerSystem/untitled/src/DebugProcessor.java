public class DebugProcessor extends LoggerProcessor {

    DebugProcessor(LoggerProcessor nextLoggerProcessor){
        super(nextLoggerProcessor);
        //this.nextLoggerProcessor = nextLoggerProcessor;

    }
    public void log(int logLevel,String message){
        System.out.println("DebugProcessor");
        if(logLevel==DEBUG){
            System.out.println("Debug logger" + message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
