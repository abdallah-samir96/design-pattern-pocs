package behaviour.observer.impl;

import behaviour.observer.DisplayableObserver;
import behaviour.observer.WeatherObservable;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {

    private final List<DisplayableObserver> observers = new ArrayList<>();
    private long temperature;
    @Override
    public void register(DisplayableObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(DisplayableObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void update() {
        observers.forEach((observer)-> observer.update("temp:" + temperature));
    }
    public void setTemperature(long temperature) {
        this.temperature = temperature;
        // just calling update once the state changes
        this.update();
    }
}
