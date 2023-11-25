package behaviour.strategy;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.UUID;

public class App {
    public static void main(String[] args) {



        /*
        * define A family of Algorithms , encapsulate each of them and make them interchangeable
        * we need to inject the behaviour instead of using inheritance(constructor injection, setter injection).
        * favor composition over inheritance
        * inheritance may lead to duplication when we have 2 subclasses
        * with the same behaviour in specific method
        *
        * Here composition is right solution and separate the behaviour to be reusable
        *
        * */




        /*
        *  we used the Lambda Expression & Method reference
        * to implement the Behaviour instead of creating new classes
        *
        *
         */
        var context = new StrategyContext();
        context.setClient(App::generateRandomUUID);
        context.run();

    }

    public static void generateRandomUUID(){
        System.out.println("Date Time Without TimeZone(default zone) is : " + LocalDateTime.now());
        var randomUUID = UUID.randomUUID();
        System.out.printf("Your Id Is : %s", randomUUID);
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli());
    }

    public static void printNumbers(){
        var list = List.of(10, 20, 30, 40, 50);
        for(int i : list){
            System.out.println(i);
        }
    }
}
