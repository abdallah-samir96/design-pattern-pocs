package behaviour.observer;

public interface WeatherObservable {
    public void register(DisplayableObserver observer);
    public void unregister(DisplayableObserver observer);
    public void update();
}