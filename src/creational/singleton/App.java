package creational.singleton;

import creational.singleton.withclass.Singleton;
import creational.singleton.withenums.SingletonWithEnum;

public class App {
    public static void main(String[] args) {

        /*
         * Singleton used to obtain just only one object of the whole system
         * such as Runtime is one object from the whole App
         * */
        var singleton = Singleton.getInstance();

        singleton.run(()->{
            var cipherText = new StringBuilder();
            var plainText = "AbdallahSamir".toLowerCase();
            byte cipherKey = 100;
            for(int i = 0; i < plainText.length(); i++){
                int currentCharCode = plainText.charAt(i) - 97;
                char newChar = (char) ((currentCharCode * cipherKey) % 26 + 97);
                cipherText.append(newChar);
            }
            System.out.println("The original Text is: " + plainText);
            System.out.println("The cipher Text is: " + cipherText);
        });

        // using Enums is different implementation of singleton
        var anotherSingleton = SingletonWithEnum.INSTANCE;
        anotherSingleton.run(App::run);
        anotherSingleton.doSomething();
    }

    public static void run(){
        System.out.println("to use in method reference");
    }
}