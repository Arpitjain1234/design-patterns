public class InfoProcessor extends LoggerProcessor {

    InfoProcessor(LoggerProcessor nextLoggerProcessor){
        super(nextLoggerProcessor);
        //this.nextLoggerProcessor = nextLoggerProcessor;

    }
    public void log(int logLevel,String message){
        System.out.println("InfoProcessor");
        if(logLevel==INFO){
            System.out.println("Info logger" + message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
