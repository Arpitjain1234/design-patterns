package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;



public class NotificationAlertObserverMobileImpl implements NotificationAlertObserver {

    String name;
    StockObservable observable;

    public NotificationAlertObserverMobileImpl(String name, StockObservable obj){
        this.name = name;
        this.observable = obj;
    }
    public void update(){
        sendMobileSms(name, "Hi");
    }
    public void sendMobileSms(String name, String msg){
        System.out.println("hi!!" + name + msg);

    }
}
