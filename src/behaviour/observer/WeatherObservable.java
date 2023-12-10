package behaviour.observer;

public interface WeatherObservable {
     void register(DisplayableObserver observer);
     void unregister(DisplayableObserver observer);
     void update();
}