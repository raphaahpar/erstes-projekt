package Objects;
public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String to() {
        return "Hello, " + this.name + "! You are " + this.age + " years old.";
    }

    @Override
    public String toString() {
        return to();
    }
}
