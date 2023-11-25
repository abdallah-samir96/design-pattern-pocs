package behaviour.strategy;

public class StrategyContext {

    private RunnableStrategy client;


    public void run(){
        // here we just delegate the calling to the appropriate client
        // there is no logic here and no inheritance for this context
        client.run();
    }


    public void setClient(RunnableStrategy client){
        // we can use any dependency injection module to inject the dependencies or use constructor
        this.client = client;
    }
}
