package creational.builder;
public class App {
    public static void main(String[] args) {

        /*
         * Builder Pattern Used for constructing complex object.
         * instead of creating multiple constructors we can create the builder and if we have the value will set it
         * otherwise will not add it and call the build method
         *
         * StringBuilder is builder pattern and when calling toString() on it will return String
         *
        * */
        // here you can determine only the needed fields otherwise neglect them
        var customerInfo = new CustomerInfo
                .Builder("required data","required data")
                .name("Abdallah")
                .email("abdallahsameer22@gmail.com")
                .mobile("01097456260")
                .password("12345")
                .build();
        System.out.println("Customer Info DTO " + customerInfo);

    }

}
