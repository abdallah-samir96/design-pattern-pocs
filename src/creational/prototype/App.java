package creational.prototype;

import java.util.List;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {

        /*
        * Cloneable Pattern used to clone the object to another object
        * Prototype is a creational design pattern that
        * lets you copy existing objects without making your code dependent
        * on their classes.
        * */

        var firstObject = new ProtoType();
        firstObject.setName("Abdallah");
        firstObject.setUsers(List.of("Ahmed", "Mohamed", "Ibraheem"));
        System.out.println(firstObject);

        var cloneableObject = firstObject.clone();
        System.out.println(cloneableObject);

        // will print false as there are 2 object not one object
        // we can use the deep copy constructor to make this change
        System.out.println("Is Equal: " + (firstObject == cloneableObject));

    }
}
