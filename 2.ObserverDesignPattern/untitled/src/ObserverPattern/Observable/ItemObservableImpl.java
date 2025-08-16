package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.List;
import java.util.ArrayList;

public class ItemObservableImpl implements  StockObservable{

    public List<NotificationAlertObserver>notificationAlertObserverList = new ArrayList<>();
    private static int stockCnt = 0;
    @Override
    public void add(NotificationAlertObserver obj){
        notificationAlertObserverList.add(obj);
    }
    @Override
    public void remove(NotificationAlertObserver obj){
        notificationAlertObserverList.remove(obj);
    }

    @Override
    public void notifyObserver(){
        for (NotificationAlertObserver obj : notificationAlertObserverList){
            obj.update();
        }
    }

    @Override
    public void setStock(int newStock){
        if(stockCnt==0){
            notifyObserver();
        }
        stockCnt = stockCnt + newStock;
    }


}
