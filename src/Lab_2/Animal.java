package Lab_2;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("Walk like an animal");
    }

    public abstract void eat();
}
