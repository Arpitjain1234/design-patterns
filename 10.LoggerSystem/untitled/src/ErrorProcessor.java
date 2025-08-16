public class ErrorProcessor extends LoggerProcessor {

    ErrorProcessor(LoggerProcessor nextLoggerProcessor){
        super(nextLoggerProcessor);
        //this.nextLoggerProcessor = nextLoggerProcessor;

    }
    public void log(int logLevel,String message){
        System.out.println("ErrorProcessor");
        if(logLevel==ERROR){
            System.out.println("Error logger" + message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
