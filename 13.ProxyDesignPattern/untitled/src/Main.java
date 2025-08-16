public class Main {
    public static void main(String[] args) {
        User user  = new User("ADMIN");
        RealObjProxyImpl realObjProxy = new RealObjProxyImpl();
        realObjProxy.user = user;
        realObjProxy.createUser(user);

    }
}