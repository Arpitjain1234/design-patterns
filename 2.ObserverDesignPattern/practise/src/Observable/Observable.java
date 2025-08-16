package Observable;

import Observer.Observer;

public interface Observable {
    public void addObserver(Observer subscriberObserver);
    public void removeObserver(Observer subscriberObserver);
    public void updateObserver();
}
