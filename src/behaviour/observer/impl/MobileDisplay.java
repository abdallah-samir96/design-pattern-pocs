package behaviour.observer.impl;

import behaviour.observer.DisplayableObserver;

import java.util.logging.Logger;

public class MobileDisplay implements DisplayableObserver {

    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private String message;
    @Override
    public void display() {
        var displayView = "<web-view>"+ this.message +"</web-view>";
        logger.info(displayView);
    }

    @Override
    public void update(String message) {
        this.message = message;
        display();
    }
}
