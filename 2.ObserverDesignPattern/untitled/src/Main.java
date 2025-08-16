import ObserverPattern.Observable.ItemObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.NotificationAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserverMobileImpl;

import java.util.Observable;

public class Main {
    public static void main(String[] args)
    {
        StockObservable itemObservable = new ItemObservableImpl();

        NotificationAlertObserver xyz1 = new NotificationAlertObserverMobileImpl
                ("xyz1,",itemObservable);
        NotificationAlertObserver xyz2 = new NotificationAlertObserverMobileImpl
                ("xyz2",itemObservable);
        NotificationAlertObserver xyz3 = new NotificationAlertObserverMobileImpl
                ("xyz3",itemObservable);

                

        itemObservable.setStock(10);

    }
}