public class ExceptionProcessor extends LoggerProcessor {



    ExceptionProcessor(LoggerProcessor nextLoggerProcessor){
        super(nextLoggerProcessor);
        //this.nextLoggerProcessor = nextLoggerProcessor;

    }
    public void log(int logLevel,String message){
        System.out.println("ExceptionProcessor");
        if(logLevel==EXCEPTION){
            System.out.println("Exception logger" + message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
