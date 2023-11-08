package creational.builder;

import java.util.UUID;

public class CustomerInfo {

    private final String username;
    private final String password;
    private final UUID id;
    private final String email;
    private final String mobile;
    private final int age;
    private final String name;

    // use the private constructor for not allowing on create new object directly
    private CustomerInfo(Builder builder){
        this.id = builder.id;
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.mobile = builder.mobile;
        this.age = builder.age;
        this.name = builder.name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder{

        private String username;
        private String password;
        private final UUID id;
        private String email;
        private String mobile;
        private int age;
        private String name;

        public Builder(){
            System.out.println("Generating UUID......");
            this.id = UUID.randomUUID();
        }
        public Builder(String username, String password){
            this();
            this.username = username;
            this.password = password;
        }

        Builder username(String username){
            this.username = username;
            return this;
        }
        Builder password(String password){
            this.password = password;
            return this;
        }

        Builder email(String email){
            this.email = email;
            return this;
        }

        Builder mobile(String mobile){
            this.mobile = mobile;
            return this;
        }

        Builder age(int age){
            this.age = age;
            return this;
        }

        Builder name(String name){
            this.name = name;
            return this;
        }

        CustomerInfo build(){
            return new CustomerInfo(this);
        }

    }

}
