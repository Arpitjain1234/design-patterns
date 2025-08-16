package Observer;

public class SubscriberObserverImpl implements  Observer{

    public String observerName;
    public SubscriberObserverImpl(String name){
        this.observerName = name;
    }
    public void notifyObserver(String channelName){
        System.out.println(observerName + "got notified for the latest release from the channel : " +channelName);
    }
}
