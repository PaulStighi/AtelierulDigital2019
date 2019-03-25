package Lab_2;

public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Play like a fish");
    }

    public void eat() {
        System.out.println("Eat like a fish");
    }

    public void walk() {
        System.out.println("Swim");
    }
}
