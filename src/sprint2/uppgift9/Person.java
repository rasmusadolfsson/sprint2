package sprint2.uppgift9;

public class Person {

    protected String name;
    protected String address;
    protected String zipCode;
    protected int age;
    protected int weight;
    protected int height;

    public Person(String name, String address, String zipCode, int age, int weight, int height) {
        this.name = name;
        this.address = address;
        this.zipCode = zipCode;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}
