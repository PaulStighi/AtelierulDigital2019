package Lab_6.Map;

public class Person {
    private String name;
    private int cnp;

    public Person(String name, int cnp) {
        this.name = name;
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public int getCnp() {
        return cnp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cnp=" + cnp +
                '}';
    }
}
