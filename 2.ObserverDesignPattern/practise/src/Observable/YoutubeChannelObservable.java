package Observable;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelObservable implements Observable {

    public String channelName;
    public YoutubeChannelObservable(String name){
        this.channelName = name;
    }
    List<Observer> subscriberOberverList = new ArrayList<>();
    public void addObserver(Observer subscriberObserver){
        subscriberOberverList.add(subscriberObserver);
    }
    public void removeObserver(Observer subscriberObserver){
        subscriberOberverList.remove(subscriberObserver);
    }
    public void updateObserver(){
        for(Observer observer : subscriberOberverList){
            observer.notifyObserver(channelName);
        }
    }
}
