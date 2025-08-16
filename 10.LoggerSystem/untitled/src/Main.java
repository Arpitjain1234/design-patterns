public class Main {
    public static void main(String[] args) {
        System.out.println("This is a logger system the classic example of Chain of Responsibility Principles");

        System.out.println("------------Logger Application Started------------");
        LoggerProcessor logobj = new InfoProcessor(new DebugProcessor(new ErrorProcessor(new ExceptionProcessor(null))));
        logobj.log(1,"This is a debug log");
    }

}