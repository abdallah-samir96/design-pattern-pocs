package creational.prototype;

import java.util.List;

public class ProtoType implements Cloneable{
    private String name;
    private List<String> users;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "ProtoType{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }

    @Override
    public ProtoType clone() throws CloneNotSupportedException {
        System.out.println("This Used To Clone The Object");
        return (ProtoType)super.clone();
    }
}
