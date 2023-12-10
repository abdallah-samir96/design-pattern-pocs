package behaviour.observer;

import behaviour.observer.impl.MobileDisplay;
import behaviour.observer.impl.TVDisplay;
import behaviour.observer.impl.WeatherStation;

public class App {
    public static void main(String[] args) {

        /*
        * Defines 0:m relationships between objects so when the subject state changes
        * the observers will be notified with the new state
        *
        *
        * moving from PULL mechanism to PUSH mechanism
        * the traditional way the observer (will ask the observable each time (have you changes????))
        * this is PULL mechanism, so we changed the strategy to be PUSH instead of PULL
        * Responsibility of push will be on the observable(subject) itself
        *
        * example (Weather Station, PUSH Notification, WEBHOOKS,Message Brokers,  ....)
        *
        * observers should register on the observable and once the state changes
        * the observers will be notified
        *
        *
        * The Observer Pattern will break the Single Responsibility Principle
        * as it has the register, unregister, notify + the main responsibility of weather for our example
        * so this is the drawbacks of observer design pattern.
        * */
        var observable = new WeatherStation();
        observable.register(new MobileDisplay());
        observable.register(new TVDisplay());

        // this will notify all observers internally throw the update method
        observable.setTemperature(23);

    }
}
