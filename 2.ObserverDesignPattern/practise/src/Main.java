import Observable.YoutubeChannelObservable;
import Observer.SubscriberObserverImpl;

public class Main {
    public static void main(String[] args) {

        SubscriberObserverImpl arpit = new SubscriberObserverImpl("Arpit");
        SubscriberObserverImpl naman = new SubscriberObserverImpl("Naman");

        YoutubeChannelObservable ict = new YoutubeChannelObservable("ICT");
        YoutubeChannelObservable passenger = new YoutubeChannelObservable("Passenger Paramvir");

        ict.addObserver(arpit);
        ict.addObserver(naman);


        passenger.addObserver(arpit);

        ict.updateObserver();
        passenger.updateObserver();

    }
}