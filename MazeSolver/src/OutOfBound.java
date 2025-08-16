public class OutOfBound extends RuntimeException {

    // this should also remove the thread from the threadpool
    public OutOfBound(String message) {
        super(message);
    }
}
